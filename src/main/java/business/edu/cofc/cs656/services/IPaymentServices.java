package business.edu.cofc.cs656.services;

public interface IPaymentServices {


    static float updatePayment(float paymentAmount) {
        return paymentAmount;
    }

    private float depositPayment(float paymentAmount) {
        return paymentAmount;
    }

    private float addTip(float tipAmount) {
        return tipAmount;
    }

    private String updatePaymentMethod(String typeOfPaymentMethod) {
        return typeOfPaymentMethod;
    }

    private String addPaymentMethod(String typeOfPaymentMethod) {
        return typeOfPaymentMethod;
    }

    private String deletePaymentMethod(String userID) {
        return "The payment method has been deleted";
    }

    private String viewPaymentMethod(String userID) {
        return "The payment method is the visa card ending in 556";
    }

    private String addDirectDepositInfo(String userID, String bankAcctNum, String bankRoutingNum) {
        return "The direct deposit info has been added";
    }

    private String editDirectDepositInfo(String userID, String bankAcctNum, String bankRoutingNum) {
        return "The direct deposit info has been changed";
    }

    private String viewDirectDepositInfo(String userID) {
        return "The direct deposit info is: bank account number:11000010101 routing number:1010010101";
    }

    private String deleteDirectDepositInfo(String userID) {
        return "The direct deposit info has been deleted";
    }

}
