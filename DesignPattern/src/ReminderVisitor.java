package DesignPattern;

public class ReminderVisitor extends NodeVisitor{
    @Override
    public void visitFacade(Facade facadeObject) {
        System.out.println("Visiting Facade.......");
    }

    @Override
    public void visitProduct(Product productObject) {
        System.out.println("Visiting Product.......");
    }

    @Override
    public void visitTrading(Trading trading) {
        System.out.println("Visiting Trading.......");
    }
}
