package model.edu.cofc.cs656;

public class CustomerOrder {

    private String paymentInformation;
    private String orderID;
    private float orderCost;

    public CustomerOrder(String paymentInformation, String orderID, float orderCost) {

        setOrderCost(orderCost);
        setPaymentInformation(paymentInformation);
        setOrderID(orderID);

    }

    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }
    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPaymentInformation() {
        return paymentInformation;
    }


    public String getOrderID() {
        return orderID;
    }



    public float getOrderCost() {
        return orderCost;
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

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "paymentInformation='" + getPaymentInformation() + '\'' +
                ", orderID='" + getOrderID() + '\'' +
                ", orderCost=" + getOrderCost() +
                '}';
    }
}
