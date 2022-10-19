package DesignPattern;

public abstract class NodeVisitor { // visits the nodes

    public abstract void visitFacade(Facade facadeObject); // visits Facade

    public abstract void visitProduct(Product productObject); // visits Product

    public abstract void visitTrading(Trading trading); // visits Trading

}
