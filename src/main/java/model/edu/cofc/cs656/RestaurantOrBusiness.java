package model.edu.cofc.cs656;
import business.edu.cofc.cs656.services.*;
public class RestaurantOrBusiness extends RestaurantOrBusinessAccount implements IPaymentServices {

    private String hours;

    public RestaurantOrBusiness(String name, String phoneNumber, String emailAddress, String address, String password, String restaurantOrBusinessID, String paymentInformation, String customerOrders, boolean subcriptionPlan, boolean oneTimePaymentPlan, String hours, String restaurantID) {
        super(name, phoneNumber, emailAddress, address, password, restaurantOrBusinessID, paymentInformation, customerOrders, subcriptionPlan, oneTimePaymentPlan);
        this.name = name;
        setHours(hours);
        setAddress(address);
    }



    private static void reviewDriver(String driverID, String name) {


        ReviewServices.addReview();
    }

    private static String setHours(String restaurantOrBusinessID, String hours) {
        String businessHours = hours;


        return "The hours of business ID " + restaurantOrBusinessID + "are" + businessHours;
    }

    private static String editHours(String restaurantOrBusinessID, String hours) {
        String businessHours = hours;


        return "The new hours of business ID " + restaurantOrBusinessID + "are" + businessHours;
    }

    static String viewHours(String restaurantOrBusinessID) {


        return "The hours of Bobs Burgers (ID: " + restaurantOrBusinessID + ") are 6:00am-9:00pm Monday-Saturday";
    }

    static String deleteHours(String restaurantOrBusinessID) {


        return "The hours of Bobs Burgers (ID: " + restaurantOrBusinessID + ") have been deleted";
    }

    private static String choosePaymentOption(String restaurantOrBusinessID, boolean subscriptionPlan, boolean oneTimePaymentPlan) {
        if (subscriptionPlan == true)
            return "You have chosen the subcription payment plan";

        else
            return "You have chosen the one time payment plan";
    }


    private static String viewPaymentOption(String restaurantOrBusinessID) {

        return "The payment plan for Bobs Burgers (ID: " + restaurantOrBusinessID + ") is the one time payment plan";

    }

    private static String deletePaymentOption(String restaurantOrBusinessID) {

        return "The payment option has been deleted";
    }

    private static String changePaymentOption(String restaurantOrBusinessID, boolean subscriptionPlan, boolean oneTimePaymentPlan) {
        if (subscriptionPlan == true)
            return "You have chosen the subcription payment plan";

        else
            return "You have chosen the one time payment plan";
    }

    private static String viewCustomerOrders(String orderID) {

        return "Sally ordered 10 cheesecakes, Sam ordered 5 Burgers";

    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "RestaurantOrBusiness{" +
                "name='" + name + '\'' +
                "address='" + getAddress() + '\'' +
                "hours='" + getHours() + '\'' +
                '}';
    }
}