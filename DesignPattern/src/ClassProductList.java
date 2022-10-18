package DesignPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ClassProductList {
    List<Product> productList;
    public ClassProductList(){
        productList = new ArrayList<>();
    }

    public void readProductList(){
        try{
            File file = new File("DesignPattern/TextFiles/ProductInfo.txt");
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

    public Iterator createIterator() {
        return this.productList.iterator();
    }

    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Product List Reminder ...");
        return nodeVisitor.visitProduct(this);
    }
}
