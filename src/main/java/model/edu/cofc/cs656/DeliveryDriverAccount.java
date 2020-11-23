package model.edu.cofc.cs656;

public class DeliveryDriverAccount extends UserAccount {

    public String driverID;
    private String directDepositAccountNum;

    public DeliveryDriverAccount(String name, String phoneNumber, String emailAddress, String address, String password) {
        super(name, phoneNumber, emailAddress, address, password);
    }


    private boolean signUpAsDriver() {

        if (driverID.isEmpty())   {

            return false;
        }
        else {
            return true;
        }

    }


}
