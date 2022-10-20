package DesignPattern;

public class Product {
    @SuppressWarnings(value="FieldMayBeFinal")
    private String productName; // The name of the product i.e. Meat or Produce
    @SuppressWarnings(value="FieldMayBeFinal")
    private String value;

    public Product(String productName, String value){
        this.productName = productName;
        this.value = value;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getValue(){
        return this.value;
    }

    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visitProduct(this);
    }
}
