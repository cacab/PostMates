package main.edu.cofc.cs656.app;
import model.edu.cofc.cs656.*;
import model.edu.cofc.cs656.Menu;
import business.edu.cofc.cs656.services.*;

import java.util.ArrayList;

public class App {



    public static void main(String[] args) { // Begin main method

        //TESTS FOR USER ACCOUNT
        System.out.println("*******UserAccount tests:******* \n");
        UserAccount useraccount1 = new UserAccount("John The User", "123-345-3333", "john@aol.com", "123 Bay Street, Charleston SC 29456", "password123");
        System.out.println(useraccount1);
        System.out.println();


        //TESTS FOR CUSTOMER
        System.out.println("*******Customer tests:******* \n");
        Customer c3 = new Customer("John Customer", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "Visa card ending in 332");
        c3.setPreviousOrders("Beet-er Late Than Never Burger");
        System.out.println(c3);
        System.out.println();






        //TESTS FOR DELIVERY DRIVER
        System.out.println("*******DeliveryDriver tests:******* \n");
        DeliveryDriver deliveryDriver2 = new DeliveryDriver("Tina Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        deliveryDriver2.setDriversLicenseNumber("222-44444-23333");
        deliveryDriver2.setDeliveryArea("Summerville");
        deliveryDriver2.isOnDuty();
        deliveryDriver2.setDriverHours("10pm-2am T, H");
        System.out.println(deliveryDriver2);
        System.out.println("Directions to customer: " + DriverDirections.viewDirectionsToCustomer("ORDERID24") + "\n");
        System.out.println();


        //TESTS FOR MENU
        System.out.println("*******Menu tests:******* \n");
        ArrayList<String> BobsBurgersFoodItems = new ArrayList<>();
        @SuppressWarnings("unused")
		ArrayList<Double> priceOfFoodItems = new ArrayList<>();
        Menu.createFoodMenuItem(BobsBurgersFoodItems);
        System.out.println("The menu: "+ BobsBurgersFoodItems);
        Menu.updateFoodMenuItem(BobsBurgersFoodItems);
        System.out.println("Updated the menu: "+ BobsBurgersFoodItems + "\n");

        //TESTS FOR RESTAURANT OR BUSINESS
        System.out.println("*******Restaurant Or Business Tests:******* \n");
        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");
        System.out.println(r1);
        System.out.println();



    } // end main method
} // end test class
