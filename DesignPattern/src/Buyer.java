package DesignPattern;

public class Buyer extends Person{
    public Buyer(){
        super(theProductMenu);
    }

    // Shows the menu using Bridge Pattern
    @Override
    public void showMenu() {
        System.out.println("**********************************************************");
        System.out.println("                      Bridge Pattern                            ");
        System.out.println("**********************************************************");
        if(theProductMenu instanceof MeatProductMenu){ // if the object is an instance of MeatProductMenu
            System.out.println("Meat Product Menu for the Buyer");
        }
        else{ // if the object is an instance of ProduceProductMenu
            System.out.println("Produce Product Menu for the Buyer");
        }
    }

    // Creates the type of Menu selected
    @Override
    public void createProductMenu() {
        if(productType == 0) {
            theProductMenu = new MeatProductMenu();
            return; // if the productType is 0 of MeatProductMenu
        }
        theProductMenu = new ProduceProductMenu();
    }
}
