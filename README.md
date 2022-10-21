### Explanation
Name of executed Classes and there functionality:<br>
    -- Buyer Class - Inherits the Person class which specifies the type of user i.e. buyer. Calls the Bridge Pattern for the Menu Items<br>
    -- ClassProductList - Reads the content of the file and creates the list<br>
    -- Facade - Class that has the type of the facade pattern executes the classes for bridge, <br> factory, visitor and iterator pattern<br>
    -- LisIterator - Implements the Iterator pattern<br>
    -- ListIterator - Implements the Iterator pattern<br>
    -- Login - Class authenticating user at login<br>
    -- Main - Class to **initiate** the facade pattern<br>
    -- NodeVisitor - Node Visitor class for implementing visitor pattern<br>
    -- MeatProductMenu - Meat Menu responsible for bridge pattern<br>
    -- Offering - Dummy Class<br>
    -- OfferingIterator - Implements the Iterators pattern<br>
    -- OfferingList - Dummy Class, creates the list of offering<br>
    -- OfferingMenu - Dummy Class, Offering Menu<br>
    -- Person - An abstract class for implementing Buyer and Seller<br>
    -- PersonFactory - Class implements factory pattern and returns the objects (expected)<br>
    -- ProduceProductMenu - Produce Menu responsible for bridge pattern<br>
    -- Product - Class for creating the object of the selected product<br>
    -- ProductIterator - Implements the Iterator pattern for getting the product from list<br>
    -- ProductMenu - Menu Interface<br>
    -- Reminder - Abstract Reminder class for Visitor Pattern<br>
    -- ReminderVisitor - Implementation of the Abstract Class<br>
    -- Seller - Inherits the Person class which specifies the type of user i.e. seller. Calls the Bridge Pattern for the Menu Items<br>
    -- Trading - Dummy Class<br>
    -- TradingMenu - Dummy class for displaying the trading menu<br>
    -- UserInfoItem - Stores the information of the user having the active session<br>