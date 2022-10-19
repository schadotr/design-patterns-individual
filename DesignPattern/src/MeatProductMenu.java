package DesignPattern;

public class MeatProductMenu implements ProductMenu {
    @Override
    public void showMenu() { // Showing Meat Menu
        System.out.println("Showing Menu.......");
    }

    @Override
    public void showAddButton() { // Showing Add Button
        System.out.println("Add Product : Meat Product Menu");
    }

    @Override
    public void showViewButton() { // Showing View Button
        System.out.println("View Product : Meat Product Menu");
    }

    @Override
    public void showRadioButton() { // Showing Radio Button
        System.out.println("View Type of Product : Meat Product Menu");
    }

    @Override
    public void showLabels() { // Showing Labels Button
        System.out.println("Show Labels of Product : Meat Product Menu");
    }

    @Override
    public void showComboBoxes() { // Showing Combo Boxes
        System.out.println("Show Combo boxes of Product : Meat Product Menu");
    }
}
