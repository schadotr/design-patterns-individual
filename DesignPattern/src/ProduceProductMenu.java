package DesignPattern;

public class ProduceProductMenu implements ProductMenu {
    @Override
    public void showMenu() { // Showing Menu
        System.out.println("Showing Menu.......");
    }

    @Override
    public void showAddButton() {
        System.out.println("Add Product : Produce Product Menu");
    }

    @Override
    public void showViewButton() {
        System.out.println("View Product : Produce Product Menu");
    }

    @Override
    public void showRadioButton() {
        System.out.println("View Type of Product : Produce Product Menu");
    }

    @Override
    public void showLabels() {
        System.out.println("Show Labels of Product : Produce Product Menu");
    }

    @Override
    public void showComboBoxes() {
        System.out.println("Show Combo boxes of Product : Produce Product Menu");
    }
}
