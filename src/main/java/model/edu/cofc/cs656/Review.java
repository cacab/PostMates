package model.edu.cofc.cs656;

public class Review {


    public int numOfStars;
    public String reviewMessage;
    private String reviewID;


    public Review(int numOfStars, String reviewMessage, String reviewID) { //constructor
        setNumOfStars(numOfStars);
        setReviewMessage(reviewMessage);
        setReviewID(reviewID);
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

    @Override
    public String toString() {
        return "Review{" +
                "numOfStars=" + getNumOfStars() +
                ", reviewMessage='" + getReviewMessage() + '\'' +
                ", reviewID='" + getReviewID() + '\'' +
                '}';
    }
}
