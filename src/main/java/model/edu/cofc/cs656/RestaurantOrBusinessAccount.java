package model.edu.cofc.cs656;

public class RestaurantOrBusinessAccount extends UserAccount {

    public String restaurantOrBusinessID;
    String customerOrders;
    boolean subcriptionPlan;
    boolean oneTimePaymentPlan;

    public RestaurantOrBusinessAccount(String name, String phoneNumber, String emailAddress, String address, String password, String restaurantOrBusinessID, String paymentInformation, String customerOrders, boolean subcriptionPlan, boolean oneTimePaymentPlan) {
        super(name, phoneNumber, emailAddress, address, password);



    }


    private boolean signUpAsRestaurantOrBusiness() {

        if (restaurantOrBusinessID.isEmpty())   {

            return false;
        }
        else {
            return true;
        }

    }

    public String getRestaurantOrBusinessID() {
        return restaurantOrBusinessID;
    }

    public void setRestaurantOrBusinessID(String restaurantOrBusinessID) {
        this.restaurantOrBusinessID = restaurantOrBusinessID;
    }

    public String getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(String customerOrders) {
        this.customerOrders = customerOrders;
    }

    public boolean isSubcriptionPlan() {
        return subcriptionPlan;
    }

    public void setSubcriptionPlan(boolean subcriptionPlan) {
        this.subcriptionPlan = subcriptionPlan;
    }

    public boolean isOneTimePaymentPlan() {
        return oneTimePaymentPlan;
    }

    public void setOneTimePaymentPlan(boolean oneTimePaymentPlan) {
        this.oneTimePaymentPlan = oneTimePaymentPlan;
    }
}
