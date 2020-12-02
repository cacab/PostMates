package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.*;
import business.edu.cofc.cs656.services.*;

import java.util.ArrayList;

public class CustomerServices {


    public  ArrayList<RestaurantOrBusiness> seeRestaurant() {

        ArrayList<RestaurantOrBusiness> rest = new ArrayList<>();

        RestaurantOrBusiness r1 = new RestaurantOrBusiness("Bob's Burgers", "843-843-8438", "BB@aol.com", "404 Azalea Ave", "pass123", "123-123-334444234345D", "visa 1222-222-1111", "Sally's order", false, true, "9a-3p", "333");

        rest.add(r1);


        return rest;

    }

}
