package model.edu.cofc.cs656;

public class CustomerOrder {

    private String paymentInformation;
    private String orderID;
    private float orderCost;

    public CustomerOrder(String paymentInformation, String orderID, float orderCost) {


    }

    public String getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public float getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }

    private static boolean cancelOrder(String orderID) {

        return true;
    }

    private static String contactRestaurant(String restaurantID) {

        return "The phone number is 111-111-1111";

    }

    private static String contactDriver( String driverID) {

        return "The phone number is 121-444-1111";
    }




}
