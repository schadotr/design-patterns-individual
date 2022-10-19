package DesignPattern;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 @author Swapnil Mukeshbhai Chadotra, schadotr@asu.edu
 @version 1.0
 */

public class Facade {

	private final Scanner inputScanner = new Scanner(System.in); // Scanning the input from the user

	private int userType; // The type of the user 0 = Buyer or 1 = Seller
	private Product theSelectedProduct; // The selected product by the user Meat or Produce

	int nProductCategory; // The type of the nth product selected by the user 0 or 1
	private ClassProductList theProductList; // List of Products from the file : ProductInfo.txr
	private Person thePerson; // The object is a type of Person, Buyer or Seller
	private UserInfoItem userInfoItem; // The details of the user of the current session

	@SuppressWarnings("unused")
	private TradingMenu tradingMenu; // Trading Menu Object
	@SuppressWarnings("unused")
	private OfferingMenu offeringMenu; // Offering Menu Object

	public Facade(){
		System.out.println("**********************************************************");
		System.out.println("                      Facade Pattern                            ");
		System.out.println("**********************************************************");
		initiateFacade(); // Initializing the method

	}

	private void initiateFacade(){
		System.out.println("Initiate Facade Method has been called !!\n");
		boolean isLoginSuccessful = login(); // calls the login method
		if(!isLoginSuccessful){ // if not successful exit
			System.out.println("Exited from the System !!!!\n");
			System.exit(0);
		}
		createProductList(); // Read the List of Product from the file
		this.theSelectedProduct = selectProduct(); // The selected product by the user from the list of products
		System.out.println("The category selected product is : " + this.theSelectedProduct.getProductName() + " : " + this.theSelectedProduct.getValue());
		attachProductToUser(); // Prints the product selected by the user to the output file
		productOperation(); // Performs the product operation
		System.out.println();
	}

	public boolean login() {
		Login loginObject = new Login(); // Creates the loginObject
		setUserType(loginObject.userTypeSelection()); // Sets the type of user selected from the input
		if(userType == 2){
			return false; // Exit
		}
		UserInfoItem user = loginObject.displayLoginForm(); // User gets created
		if(user == null){
			return false;
		}
		createUser(user);
		return true;
	}
	@SuppressWarnings("unused")
	public void addTrading() {
		tradingMenu.addTrading();
	} // Adds the trading
	@SuppressWarnings("unused")
	public void viewTrading() {
		tradingMenu.viewTrading();
	} // View the trading
	@SuppressWarnings("unused")
	public void decideBidding() {
		offeringMenu.decideBidding();
	} // Decide Bidding
	@SuppressWarnings("unused")
	public void discussBidding() {
		offeringMenu.discussBidding();
	} // Discuss Bidding
	@SuppressWarnings("unused")
	public void submitBidding() {
		offeringMenu.submitBidding();
	} // Submits Bidding

	public void remind() { // Visits the facade class
		Reminder reminder = new Reminder();
		reminder.visitFacade(this);
	}

	public void createUser(UserInfoItem userinfoitem) { // Sets the user type and person
		setUserType(userinfoitem.getUserType());
		setPerson(userinfoitem);
	}

	public void createProductList() { // Creates the list of product
		theProductList = new ClassProductList();
		theProductList.readProductList();
	}

	public void attachProductToUser() { // Writes the product selected by the user ina file
		try {
			FileWriter fileWriter = new FileWriter("DesignPattern/TextFiles/UserProduct.txt",true);
			fileWriter.write(this.userInfoItem.getUserName() + ":" + this.theSelectedProduct.getValue() + "\n");
			fileWriter.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Product selectProduct() { // Selects the product
		System.out.println("**********************************************************");
		System.out.println("                            Iterator Pattern                            ");
		System.out.println("**********************************************************");
		System.out.println("Select the Product");
		Iterator<Product> iterator = this.theProductList.createIterator();
		ProductIterator productIterator = new ProductIterator();
		int index = 1;
		while(productIterator.hasNext(iterator)){ // Iterates over all the product objects
			Product product = productIterator.next(iterator);
			System.out.println(index + " " + product.getProductName() + " " + product.getValue());
			index++;
		}
		System.out.println("Select an option");
		int option = inputScanner.nextInt();

		Product selectedProduct = this.theProductList.productList.get(option - 1);

		if(selectedProduct.getProductName().equals("Meat")){ // Sets the product type
			this.nProductCategory = 0;
			Person.productType = 0;
		}
		else{
			this.nProductCategory = 1;
			Person.productType = 1;
		}
		System.out.println("The category of the selected product : " + this.nProductCategory);
		return selectedProduct;
	}

	public void productOperation() { // Performs product operations like Creating Menu, Viewing Menu and Reminder
		int choice;
		while(true){
			System.out.println("\n\nPlease select from the following : ");
			System.out.println("1. Create Product Menu\n2. Show Product Menu\n3. Remind\n4. Logout\n\n");
			choice = inputScanner.nextInt();
			switch (choice) {
				case 1 -> {
					this.thePerson.createProductMenu();
					System.out.println("Created the Product");
					this.thePerson.showMenu();
					Person.theProductMenu.showAddButton();
					Person.theProductMenu.showLabels();
					Person.theProductMenu.showRadioButton();
					Person.theProductMenu.showViewButton();
					Person.theProductMenu.showComboBoxes();
				}
				case 2 -> {
					this.thePerson.showMenu();
					Person.theProductMenu.showAddButton();
					Person.theProductMenu.showLabels();
					Person.theProductMenu.showRadioButton();
					Person.theProductMenu.showViewButton();
					Person.theProductMenu.showComboBoxes();
				}
				case 3 -> remind();
				case 4 -> System.exit(0);
				default -> {
					System.exit(0);
					throw new IllegalStateException("Unexpected value: " + choice);
				}
			}
		}
	}

	public void setUserType(int typeOfUser){
		this.userType = typeOfUser;
	} // Sets the type of user

	public void setPerson(UserInfoItem userInfoItem){ // Sets the type of person
		this.userInfoItem = userInfoItem;
		this.thePerson = PersonFactory.createPerson(userInfoItem.getUserType());
	}
}
