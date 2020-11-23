package business.edu.cofc.cs656.services;

public class ReviewServices {

    public int numOfStars;
    public String reviewMessage;
    private String reviewID;


    public ReviewServices(int numOfStars, String reviewMessage, String reviewID) { //constructor
        this.numOfStars = numOfStars;
        this.reviewMessage = reviewMessage;
        this.reviewID = reviewID;
    }

    private ReviewServices addReview (int numOfStars, String reviewMessage, String reviewID) {

        ReviewServices theReviewServices = new ReviewServices(numOfStars, reviewMessage, reviewID);

        System.out.println("Review added!");

        return theReviewServices;
    }


    private ReviewServices editReview (int numOfStars, String reviewMessage, String reviewID) {

        ReviewServices theReviewServices = new ReviewServices(numOfStars, reviewMessage, reviewID);

        System.out.println("Review changed!");

        return theReviewServices;

    }

    private String readReview (int numOfStars, String reviewMessage) {

        String reviewToRead = "  ";

        return reviewToRead;

    }

    private boolean deleteReview(int numOfStars, String reviewMessage, String reviewID) {

        boolean isDeleted = true;

        return isDeleted;
    }


    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getReviewMessage() {
        return reviewMessage;
    }

    public void setReviewMessage(String reviewMessage) {
        this.reviewMessage = reviewMessage;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }
}
