package DesignPattern;

import java.util.List;
import java.util.Scanner;

/**
 @author Swapnil Mukeshbhai Chadotra, schadotr@asu.edu
 @version 1.0
 */

public class Facade {

	private Scanner inputScanner = new Scanner(System.in);

	private int userType;
	private Product theSelectedProduct;
	private int nProductCategory;
	private List<Product> theProductList;
	private Person thePerson;

	public Facade(){
		System.out.println("============== Facade Pattern ==============");
	}

	public void initiateFacade(){
		System.out.println("Initiate Facade Method has been called !!");
		boolean isLoginSuccessful = login();
	}

	public boolean login() {
		Login loginObject = new Login();
		setUserType(loginObject.userTypeSelection());
		return true;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

	public void setUserType(int typeOfUser){
		this.userType = typeOfUser;
	}
}
