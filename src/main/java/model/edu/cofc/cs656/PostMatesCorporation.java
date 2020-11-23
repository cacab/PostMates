package model.edu.cofc.cs656;
import java.util.ArrayList;
import model.edu.cofc.cs656.*;
import business.edu.cofc.cs656.services.*;


class PostMatesCorporation extends UserAccount implements IIncomeReportsServices {

    private String adminID;


    public PostMatesCorporation(String name, String phoneNumber, String emailAddress, String address, String password, String adminID) {
        super(name, phoneNumber, emailAddress, address, password);
    }


    private boolean matchOrderToDriver(String orderID, String driverId, String customerID) {
       String order = orderID;
       String theDriverID = driverId;
       String theCustomerID = customerID;
       boolean orderMatched;

        if ( orderID.isBlank() || driverId.isBlank() || customerID.isBlank())
            orderMatched = false;


        else orderMatched = true;

        return orderMatched;
    }


    public static ArrayList<DeliveryDriver> seeDriver() {
        ArrayList<DeliveryDriver> deliv = new ArrayList<>();

        DeliveryDriver d1 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        DeliveryDriver d2 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");

        deliv.add(d1);
        deliv.add(d2);

        return deliv;
    }

    public static ArrayList<DeliveryDriver> updateDriver() {
        ArrayList<DeliveryDriver> deliv = new ArrayList<>();

        DeliveryDriver d1 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        DeliveryDriver d2 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");

        deliv.add(d1);
        deliv.add(d2);

        return deliv;
    }

    public static ArrayList<DeliveryDriver> deleteDriver() {
        ArrayList<DeliveryDriver> deliv = new ArrayList<>();

        DeliveryDriver d1 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        DeliveryDriver d2 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");

        deliv.remove(d1);

        return deliv;
    }


    public static ArrayList<RestaurantOrBusiness> viewRestaurant() {

        ArrayList<RestaurantOrBusiness> rest = new ArrayList<>();

        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");
        RestaurantOrBusiness r2 = new RestaurantOrBusiness("Jimmy Pestos", "843-843-1118", "JPS@aol.com", "403 Azalea Ave", "pass123333", "123-123-334444D", "visa 1222-222333-1111", "Sam's order", false, true, "9a-3p", "333");

        rest.add(r1);
        rest.add(r2);

        return rest;

    }

    public static ArrayList<RestaurantOrBusiness> createRestaurant() {

        ArrayList<RestaurantOrBusiness> rest = new ArrayList<>();

        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");
        RestaurantOrBusiness r2 = new RestaurantOrBusiness("Jimmy Pestos", "843-843-1118", "JPS@aol.com", "403 Azalea Ave", "pass123333", "123-123-334444D", "visa 1222-222333-1111", "Sam's order", false, true, "9a-3p", "333");

        rest.add(r1);
        rest.add(r2);

        return rest;

    }
    public static ArrayList<RestaurantOrBusiness> updateRestaurant() {

        ArrayList<RestaurantOrBusiness> rest = new ArrayList<>();

        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");
        RestaurantOrBusiness r2 = new RestaurantOrBusiness("Jimmy Pestos", "843-843-1118", "JPS@aol.com", "403 Azalea Ave", "pass123333", "123-123-334444D", "visa 1222-222333-1111", "Sam's order", false, true, "9a-3p", "333");

        rest.add(r1);
        rest.add(r2);

        return rest;

    }

    public static ArrayList<RestaurantOrBusiness> deleteRestaurant() {

        ArrayList<RestaurantOrBusiness> rest = new ArrayList<>();

        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");
        RestaurantOrBusiness r2 = new RestaurantOrBusiness("Jimmy Pestos", "843-843-1118", "JPS@aol.com", "403 Azalea Ave", "pass123333", "123-123-334444D", "visa 1222-222333-1111", "Sam's order", false, true, "9a-3p", "333");


        rest.remove(r2);

        return rest;

    }


    public static ArrayList<Customer> seeCustomer() {
        ArrayList<Customer> lst = new ArrayList<>();

        Customer c1 = new Customer("John Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");

        lst.add(c1);

        return lst;
    }


    public static ArrayList<Customer> addCustomer() {
        ArrayList<Customer> lst = new ArrayList<>();


        Customer c1 = new Customer("John Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");



        Customer c2 = new Customer("Sam Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");
        lst.add(c1);
        lst.add(c2);

        return lst;
    }

    public static ArrayList<Customer> updateCustomer() {
        ArrayList<Customer> lst = new ArrayList<>();


        Customer c1 = new Customer("John Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");



        Customer c2 = new Customer("Sam Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");
        lst.add(c1);
        lst.add(c2);

        return lst;
    }

    public static ArrayList<Customer> deleteCustomer() {
        ArrayList<Customer> lst = new ArrayList<>();


        Customer c1 = new Customer("John Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");



        Customer c2 = new Customer("Sam Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");
        lst.remove(c1);
        lst.add(c2);

        return lst;
    }

    @Override
    public float getMonthlyIncome(float payment) {
        float reportedIncome = (float) (payment * 5323.32);
        return reportedIncome;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
}
