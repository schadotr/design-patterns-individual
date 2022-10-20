package DesignPattern;

public class UserInfoItem {
    private final int userType; // Type of user Buyer or Seller
    private final String username; // username of the selected type of user
    private final String userPassword; // password of the selected type of user

    // Making the object
    public UserInfoItem(int userType, String username, String userPassword){
        this.userType = userType;
        this.username = username;
        this.userPassword = userPassword;
    }

    public int getUserType(){
        return userType;
    } // Gets the type of user

    public String getUserName() {
        return username;
    } // Gets the username

    // Suppressing the warning because this function is never used
    @SuppressWarnings(value = "unused")
    public String getPassword() {
        return userPassword;
    } // Gets the password
}