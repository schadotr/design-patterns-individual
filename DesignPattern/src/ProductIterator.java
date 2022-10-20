package DesignPattern;

import java.util.Iterator;


public class ProductIterator extends ListIterator {
    public boolean hasNext(Iterator<Product> iterator) { // Checks if there is a product next in the list
        return iterator.hasNext();
    }

    public void moveToHead(Iterator<Product> iterator) { // Moves to the start of the list
        System.out.println("Head Moved..");
    }

    public Product next(Iterator<Product> iterator) { // Moves to the next product
        if (this.hasNext(iterator)) {
            return iterator.next();
        } else {
            return null;
        }
    }

    public void remove(Iterator<Product> iterator) { // Removes the product from the list
        if (this.hasNext(iterator)) {
            iterator.remove();
        }
    }
}
