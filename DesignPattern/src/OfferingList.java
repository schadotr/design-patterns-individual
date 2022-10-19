package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class OfferingList {
    List<Offering> offeringList;
    public OfferingList(){
        offeringList = new ArrayList<>();
    } // initializing the offering list

    public Iterator<Offering> createIterator() {
        return this.offeringList.iterator();
    } // returns the iterator object
}
