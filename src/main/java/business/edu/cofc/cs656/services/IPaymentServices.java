package business.edu.cofc.cs656.services;

public interface IPaymentServices {


    static float updatePayment(float paymentAmount) {
        return paymentAmount;
    }

    static float depositPayment(float paymentAmount) {
        return paymentAmount;
    }

    static float addTip(float tipAmount) {
        return tipAmount;
    }

    static String updatePaymentMethod(String typeOfPaymentMethod) {
        return typeOfPaymentMethod;
    }

    static String addPaymentMethod(String typeOfPaymentMethod) {
        return typeOfPaymentMethod;
    }

    static String deletePaymentMethod(String userID) {
        return "The payment method has been deleted";
    }

    static String viewPaymentMethod(String userID) {
        return "The payment method is the visa card ending in 556";
    }

    static String addDirectDepositInfo(String userID, String bankAcctNum, String bankRoutingNum) {
        return "The direct deposit info has been added";
    }

    static String editDirectDepositInfo(String userID, String bankAcctNum, String bankRoutingNum) {
        return "The direct deposit info has been changed";
    }

    static String viewDirectDepositInfo(String userID) {
        return "The direct deposit info is: bank account number:11000010101 routing number:1010010101";
    }

    static String deleteDirectDepositInfo(String userID) {
        return "The direct deposit info has been deleted";
    }

}
