package DesignPattern;

public class Buyer extends Person{
    public Buyer(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    public Buyer(){
        super(theProductMenu);
    }

    @Override
    public void showMenu() {
        System.out.println("=============== Bridge Pattern  ===============");
    }

    @Override
    public ProductMenu createProductMenu() {

    }
}
