package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.CustomerOrder;
import model.edu.cofc.cs656.Review;

import java.util.ArrayList;

public class PostMatesServices {

    static ArrayList<Review> lst = new ArrayList<>();


    public static ArrayList<Review> deleteReview(ArrayList<Review> r1) {




        lst.remove(r1);


        return lst;

    }



}
