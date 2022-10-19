package DesignPattern;

import java.util.Iterator;

@SuppressWarnings("unused")
public class OfferingIterator extends LisIterator {
    public boolean hasNext(Iterator<Offering> iterator) {
        return iterator.hasNext();
    } // Checks if it has next object

    public void moveToHead(Iterator<Offering> iterator) {
        System.out.println("Head Moved..");
    } // Moves to head

    public Offering next(Iterator<Offering> iterator) { // Returns the next object in the list
        if (this.hasNext(iterator)) {
            return iterator.next();
        } else {
            return null;
        }
    }

    public void remove(Iterator<Offering> iterator) { // Removes the object
        if (this.hasNext(iterator)) {
            iterator.remove();
        }
    }
}