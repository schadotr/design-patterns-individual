package DesignPattern;

import java.util.Iterator;

public abstract class ListIterator { // Iterator for iterating the indexes of the list
    public abstract boolean hasNext(Iterator<Product> iterator); // hasNext checks if the next object is null

    public abstract Product next(Iterator<Product> iterator); // Jumps to the next element in the list

    @SuppressWarnings("unused")
    public abstract void remove(Iterator<Product> iterator); // Removes the object

    @SuppressWarnings("unused")
    public abstract void moveToHead(Iterator<Product> iterator); // Moves to the start of the list
}
