package model.edu.cofc.cs656;
import business.edu.cofc.cs656.services.*;

public class Customer extends CustomerAccount implements IPaymentServices {


    public String previousOrders;
    public RestaurantOrBusiness restaurant;
    private String restaurantID;


    public Customer(String name, String phoneNumber, String emailAddress, String address, String password, String customerID, String paymentMethod) {
        super(name, phoneNumber, emailAddress, address, password);
        setName(name);
        setCustomerID(customerID);


    }

    public String getPreviousOrders() {
        return "The Bob Burger, small coke, fries";
    }

    public void setPreviousOrders(String previousOrders) {
        this.previousOrders = previousOrders;
    }

    public RestaurantOrBusiness getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantOrBusiness restaurant) {
        this.restaurant = restaurant;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    private boolean placeOrder(String foodItems, int quantity, String customerID, String restaurantID, RestaurantOrBusiness restaurant) {


        if (quantity >0) {
            return true;
        }

        else
            return false;
    } // end placeOrder method

    private String viewMenu(String menu, String restaurantOrBusinessID) {
        String theMenu = "Fries, Cheeseburger, Sprite";
        return theMenu;
    }

    private String seePreviousOrders(String previousOrders) {

        return previousOrders;
    }


    public static void reviewDriver() {


        ReviewServices.addReview();


    }

    static void reviewRestaurant(String restaurantID, String name) {

        ReviewServices.addReview();
    }

    static boolean favoriteRestaurant(RestaurantOrBusiness restaurant) {
        boolean isFavorite = true;

        return isFavorite;

    }

    static boolean unFavoriteRestaurant(RestaurantOrBusiness restaurant) {
        boolean isFavorite = false;

        return isFavorite;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name'" + getName()+ '\'' +
                "customerID'" + getCustomerID() + '\'' +
                "previousOrders='" + previousOrders + '\'' +
                '}';
    }
}
