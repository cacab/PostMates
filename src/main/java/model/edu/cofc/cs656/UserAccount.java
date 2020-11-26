package model.edu.cofc.cs656;

public class UserAccount implements IUser {

    String name;
    String phoneNumber;
    String emailAddress;
    String address;
    String password;

    public UserAccount(String name, String phoneNumber,  String emailAddress, String address, String password) {

        setName(name);
        setAddress(address);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
        setPassword(password);
    }

    public String showID() {

        String ID = "123-456-789";


        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
