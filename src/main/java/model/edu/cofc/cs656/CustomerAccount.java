package model.edu.cofc.cs656;

import model.edu.cofc.cs656.*;
import business.edu.cofc.cs656.services.*;

public class CustomerAccount extends UserAccount {


    public CustomerAccount(String name, String phoneNumber, String emailAddress, String address, String password) {
        super(name, phoneNumber, emailAddress, address, password);
        setCustomerID(customerID);
        setPaymentMethod(paymentMethod);

    }



    public String customerID = "234-223-222";

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private String paymentMethod;


    private boolean signUpAsCustomer() {

        if (customerID.isEmpty())   {

            return false;


        }
        else {
            return true;
        }

    }

}
