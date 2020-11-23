package model.edu.cofc.cs656;
import model.edu.cofc.cs656.*;
import business.edu.cofc.cs656.services.*;
public class DeliveryDriver  extends DeliveryDriverAccount implements IPaymentServices {

    private String driversLicenseNumber;
    public String  deliveryArea;
    public boolean onDuty;
    public boolean offDuty;
    public String driverHours;
    private String driverID;
    private String name;

    public DeliveryDriver(String name, String phoneNumber, String emailAddress, String address, String password, String driverID) {
        super(name, phoneNumber, emailAddress, address, password);
        this.driverID = driverID;
        this.name = name;

    }

    private boolean verifyDriver(String driversLicenseNumber) {

        if (driversLicenseNumber.isEmpty()) {
            return false;
        }

        else {

            return true;
        }

    }

    private String designateDeliveryArea(String driverID, String deliveryArea) {
        String theDeliveryArea = deliveryArea;



        return theDeliveryArea;
    }


    private String setHours(String driverID, String driverHours) {

        String theHours = driverHours;


        return theHours;
    }

    private String editHours(String driverID, String driverHours) {

        String theHours = driverHours;


        return theHours;
    }

    private float generateIncomeReport(String driverID) {
        float totalIncome = (float) 1234.93;

        this.driverID = driverID;

        return  totalIncome;

    }

    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    public void setDriversLicenseNumber(String driversLicenseNumber) {
        this.driversLicenseNumber = driversLicenseNumber;
    }

    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    public boolean isOnDuty() {
        return onDuty = true;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public boolean isOffDuty() {
        return offDuty;
    }

    public void setOffDuty(boolean offDuty) {
        this.offDuty = offDuty;
    }

    public String getDriverHours() {
        return driverHours;
    }

    public void setDriverHours(String driverHours) {
        this.driverHours = driverHours;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public void setDriverName() {
        this.name = name;

    }
    public String getDriverName() {
        return name;
    }

    private boolean setStatus(boolean onDuty, boolean offDuty) {
        boolean driverOnClock = true;

        if (onDuty == true)
            driverOnClock = true;

        if (offDuty == false)

            driverOnClock = false;

        return driverOnClock;
    }


    @Override
    public String toString() {
        return "DeliveryDriver{" +
                "driverName=" + name + '\'' +
                "driversLicenseNumber='" + driversLicenseNumber + '\'' +
                ", deliveryArea='" + deliveryArea + '\'' +
                ", onDuty=" + onDuty +
                ", offDuty=" + offDuty +
                ", driverHours='" + driverHours + '\'' +
                ", driverID='" + driverID + '\'' + '}';
    }
}
