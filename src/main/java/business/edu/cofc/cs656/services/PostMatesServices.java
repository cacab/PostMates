package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.DeliveryDriver;
import model.edu.cofc.cs656.Review;

import java.util.ArrayList;

public class PostMatesServices {

    private static ArrayList<Review> lst = new ArrayList<>();




    public static ArrayList<Review> deleteReview(ArrayList<Review> r1) {




        lst.remove(r1);


        return lst;

    }

    public static ArrayList<DeliveryDriver> createDeliveryDriver() {

        ArrayList<DeliveryDriver> dlst = new ArrayList<>();
        DeliveryDriver d1 = new DeliveryDriver("Linda Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        dlst.add(d1);


        return dlst;

    }

    public static ArrayList<DeliveryDriver> addDeliveryDriver() {

        ArrayList<DeliveryDriver> dlst = new ArrayList<>();
        DeliveryDriver d1 = new DeliveryDriver("Bob Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        dlst.add(d1);


        return dlst;

    }

    public static ArrayList<DeliveryDriver> viewDeliveryDriver() {

        ArrayList<DeliveryDriver> dlst = new ArrayList<>();
        DeliveryDriver d1 = new DeliveryDriver("Bob Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        dlst.add(d1);


        return dlst;

    }

    public static ArrayList<DeliveryDriver> deleteDeliveryDriver() {

        ArrayList<DeliveryDriver> dlst = new ArrayList<>();
        DeliveryDriver d1 = new DeliveryDriver("Bob Belcher", "333-333-3333", "tina@aol.com", "4503 2nd St", "password", "DRIVERID_+6466464");
        dlst.remove(d1);


        return dlst;

    }





}
