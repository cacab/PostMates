package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.CustomerOrder;
import model.edu.cofc.cs656.Review;

import java.util.ArrayList;

public class ReviewServices {


    public static ArrayList<Review> createReview() {

        ArrayList<Review> lst = new ArrayList<>();


        return lst;

    }


    public static ArrayList<Review> seeReview() {

        ArrayList<Review> lst = new ArrayList<>();

        Review r1= new Review (5, "Great service", "333-333-333");
        Review r2 = new Review (5, "Great service", "333-333-333");


        lst.add(r1);
        lst.add(r2);


        return lst;

    }

    public static ArrayList<Review>  addReview() {

        ArrayList<Review> lst = new ArrayList<>();

        Review r1= new Review (5, "Great service", "333-333-333");
        Review r2 = new Review (5, "Great service", "333-333-333");

        lst.add(r1);
        lst.add(r2);


        return lst;

    }


}
