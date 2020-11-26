package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.CustomerOrder;
import model.edu.cofc.cs656.RestaurantOrBusiness;

import java.util.ArrayList;

public class DeliveryDriverServices {

    private boolean acceptOrder (String orderID) {

        return true;
    }


    private boolean declineOrder (String orderID) {

        return false;
    }

    public static ArrayList<CustomerOrder> createCustomerOrder() {

        ArrayList<CustomerOrder> lst = new ArrayList<>();


        return lst;

    }


    public static ArrayList<CustomerOrder> seeCustomerOrder() {

        return getCustomerOrders();

    }

    private static ArrayList<CustomerOrder> getCustomerOrders() {
        ArrayList<CustomerOrder> lst = new ArrayList<>();

        CustomerOrder o1 = new CustomerOrder("Visa ending in 332", "11-2222-111222", (float) 28.35);
        CustomerOrder o2 = new CustomerOrder("Visa ending in 222", "11-2222-555555", (float) 5.58);


        lst.add(o1);
        lst.add(o2);


        return lst;


    }

    public static ArrayList<CustomerOrder> addCustomerOrder() {

        return getCustomerOrders();

    }


    public static ArrayList<CustomerOrder> deleteCustomerOrder() {

        ArrayList<CustomerOrder> lst = new ArrayList<>();

        CustomerOrder o1 = new CustomerOrder("Visa ending in 332", "11-2222-111222", (float) 28.35);
        CustomerOrder o2 = new CustomerOrder("Visa ending in 222", "11-2222-555555", (float) 5.58);
        CustomerOrder o3 = new CustomerOrder("Visa ending in 111", "77-0000-3333333", (float) 2.99);



        lst.add(o1);
        lst.add(o2);
        lst.add(o3);

        lst.remove(o3);


        return lst;

    }

}
