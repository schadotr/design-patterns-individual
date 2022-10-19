package DesignPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Login {
    private int typeOfUser; // the type of user 0 - Buyer and 1 - Seller
    private final Scanner inputScanner = new Scanner(System.in); // Scanning the input from the user


    private boolean authentication(String username, String userPassword){ // Authenticates if the user is valid or not
        File fileReader; // File Object for reading the file content
        if(typeOfUser == 1){ // if type 1 then it is Seller
            fileReader = new File("DesignPattern/TextFiles/SellerInfo.txt");
        }
        else { // if type 0 then Buyer
            fileReader = new File("DesignPattern/TextFiles/BuyerInfo.txt");
        }
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileReader)); // bufferedReader to read the input stream
            String lineReader; // read each line from the file
            while ((lineReader = bufferReader.readLine()) != null) // Reads till it is not null
            {
                String[] userCredentials = lineReader.split(":",2); // userCredentials : username and password
                if(username.equals(userCredentials[0])) { // if username matches and password matches then the user is correct
                    if(userPassword.equals(userCredentials[1])) {
                        return true;
                    }
                    break;
                }
            }
        } catch (Exception exception) { // Exceptions while file reading
            System.out.println("An Exception occurred while reading the file. Please check the data in file is correct!!");
            exception.printStackTrace();
        }
        System.out.println("Invalid Credentials. Please try again!!");
        return false;
    }

    protected UserInfoItem displayLoginForm() { // Displays the login form
        switch (typeOfUser) {
            case 1 -> System.out.println("Seller Login Form"); // Seller login form type
            case 0 -> System.out.println("Buyer Login Form"); // Buyer login form type
            default -> {}
        }

        UserInfoItem userObject = inputCredentials(); // takes the credentials from the user
        if(userObject == null){ // if incorrect user then null object will be returned
            System.out.println("Invalid 10 login attempts. Logged out of the menu !!");
            return null;
        }
        System.out.println("Login successful Welcome :" + userObject.getUserName()); // If correct user then login successful
        return userObject;
    }

    public int userTypeSelection(){
        boolean validInput = false; // initializing valid input flag

        while(!validInput){ // runs till we don't get a valid input
            System.out.println("Please select any option from the following : \n0 : Buyer\n1 : Seller\n2 : Exit Program\n");
            typeOfUser = inputScanner.nextInt();
            if(typeOfUser == 0 || typeOfUser == 1 || typeOfUser == 2){ // if type of user is any 3 of these
                validInput = true;
            }
        }
        return typeOfUser;
    }

    private UserInfoItem inputCredentials() { // Takes the credentials from the user
        int countWrongAttempts = 0; // Counts the wrong attempts
        while(true){
            if(countWrongAttempts >= 5){ // if wrong attempts >=5 then exits
                return null;
            }
            System.out.println("Please enter your username : "); // Scans the username
            String scannedUsername = inputScanner.next();
            System.out.println("Please enter your password : "); // Scans the password
            String scannedPassword = inputScanner.next();
            if(authentication(scannedUsername, scannedPassword)){
                return new UserInfoItem(typeOfUser, scannedUsername, scannedPassword); // returns the user object
            }
            else{
                countWrongAttempts++; // increments total wrong attempts
            }
        }
    }
}
