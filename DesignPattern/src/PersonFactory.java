package DesignPattern;

public class PersonFactory extends Person {
    public PersonFactory(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    @Override
    public void showMenu() {}

    @Override
    public ProductMenu createProductMenu() {
        return null;
    }

    public static Person createPerson(int userType){
        Person person;
        System.out.println("================  Factory Pattern  ================");
        switch (userType){
            case 0:
                person = new Seller();
                System.out.println("Seller object has been created!");
                break;
            case 1:
                person = new Buyer();
                System.out.println("Buyer object has been created!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userType);
        }
        return person;
    }
}
