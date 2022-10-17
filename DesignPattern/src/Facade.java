package DesignPattern;

import java.util.List;
import java.util.Scanner;

/**
 @author Swapnil Mukeshbhai Chadotra, schadotr@asu.edu
 @version 1.0
 */

public class Facade {

	private final Scanner inputScanner = new Scanner(System.in);

	private int userType;
	private Product theSelectedProduct;
	private int nProductCategory;
	private List<Product> theProductList;
	private Person thePerson;


	public Facade(){
		System.out.println("============== Facade Pattern ==============");
		initiateFacade();
	}

	private void initiateFacade(){
		System.out.println("Initiate Facade Method has been called !!");
		boolean isLoginSuccessful = login();
		if(!isLoginSuccessful){
			System.out.println("Exited from the System !!!!");
			return;
		}
		inputProductSelection();
	}

	public boolean login() {
		Login loginObject = new Login();
		setUserType(loginObject.userTypeSelection());
		if(userType == 2){
			return false;
		}
		UserInfoItem user = loginObject.displayLoginForm();
		if(user == null){
			return false;
		}
		createUser(user);
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
		setUserType(userinfoitem.getUserType());
		setPerson(userinfoitem);
	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product selectProduct() {
		return null;
	}

	public void productOperation() {

	}

	public void setUserType(int typeOfUser){
		this.userType = typeOfUser;
	}

	public void setPerson(UserInfoItem userInfoItem){
		this.thePerson = PersonFactory.createPerson(userInfoItem.getUserType());
	}

	public void inputProductSelection(){
		System.out.println("Select from the following Product Menus : \n1. Meat Product Menu \n2. Produce Product Menu");
		int menuOption = inputScanner.nextInt();
		switch (menuOption){

		}
	}
}
