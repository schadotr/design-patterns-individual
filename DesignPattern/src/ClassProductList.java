package DesignPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ClassProductList {
    List<Product> productList; // List of objects type of Product
    public ClassProductList(){
        productList = new ArrayList<>();
    } // initializing the list

    public void readProductList(){
        try{
            File file = new File("DesignPattern/TextFiles/ProductInfo.txt"); // Reading the list of products from the given file
            BufferedReader bufferReader= new BufferedReader(new FileReader(file));
            String reader;
            while ((reader = bufferReader.readLine()) != null) {
                String[] temp = reader.split(":");
                productList.add(new Product(temp[0], temp[1]));
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public Iterator<Product> createIterator() {
        return this.productList.iterator();
    } // Creating an Iterator for the iterator pattern
}
