package DesignPattern;

public abstract class Person {
    protected static ProductMenu theProductMenu; // protected variable the type of menu
    public static int productType; // the type of the product
    public abstract void showMenu(); // displays the menu
    public abstract void createProductMenu(); // creates the product menu

    public Person(ProductMenu theProductMenu){
        Person.theProductMenu = theProductMenu;
    } // constructor

    @SuppressWarnings("unused")
    private void showAddButton() {
        theProductMenu.showAddButton();
    } // Displays the add button

    @SuppressWarnings("unused")
    private void showViewButton() {
        theProductMenu.showViewButton();
    } // Displays the view button

    @SuppressWarnings("unused")
    private void showRadioButton() {
        theProductMenu.showRadioButton();
    } // Displays the radio button

    @SuppressWarnings("unused")
    private void showLabels() {
        theProductMenu.showLabels();
    } // Displays the label

}
