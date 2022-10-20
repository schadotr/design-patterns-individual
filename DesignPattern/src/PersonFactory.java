package DesignPattern;

public abstract class PersonFactory extends Person {
    @Override
    public void createProductMenu() {}

    public PersonFactory(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    public static Person createPerson(int userType){ // Implements the factory design pattern
        Person person;
        System.out.println("**********************************************************");
        System.out.println("                            Factory Pattern                            ");
        System.out.println("**********************************************************");
        switch (userType) {
            case 1 -> {
                person = new Seller();
                System.out.println("Seller object has been created!");
            }
            case 0 -> {
                person = new Buyer();
                System.out.println("Buyer object has been created!");
            }
            default -> throw new IllegalStateException("Unexpected value: " + userType);
        }
        return person;
    }
}
