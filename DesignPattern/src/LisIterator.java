package DesignPattern;

import java.util.Iterator;

public abstract class LisIterator { // Iterator for iterating the indexes of the list
    public abstract boolean hasNext(Iterator<Offering> iterator); // hasNext checks if the next object is null

    @SuppressWarnings("unused")
    public abstract Offering next(Iterator<Offering> iterator); // Jumps to the next element in the list

    @SuppressWarnings("unused")
    public abstract void remove(Iterator<Offering> iterator); // Removes the object

    @SuppressWarnings("unused")
    public abstract void moveToHead(Iterator<Offering> iterator); // Moves to the start of the list
}
