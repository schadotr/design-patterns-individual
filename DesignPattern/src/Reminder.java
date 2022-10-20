package DesignPattern;

public class Reminder {
    private final NodeVisitor nodeVisitor;
    public Reminder(){
        nodeVisitor = new ReminderVisitor(); // Implements the visitor pattern
        System.out.println("**********************************************************");
        System.out.println("                            Visitor Pattern                            ");
        System.out.println("**********************************************************");
    }
    public void visitFacade(Facade facade) {
        nodeVisitor.visitFacade(facade);
    }

    @SuppressWarnings("unused")
    public void visitProduct(Product product) {
        product.accept(nodeVisitor);
    }

    @SuppressWarnings("unused")
    public void visitTrading(Trading trading) {
        trading.accept(nodeVisitor);
    }
}
