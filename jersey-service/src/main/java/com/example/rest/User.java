package com.example.rest;


public class User {

  private final String name;
  private final String emailAddress;
  private final String address;
  private final String phoneNumber;
  private final String password;

 
  private User(UserBuilder builder){

    this.name = builder.name;
    this.emailAddress = builder.emailAddress;
    this.address = builder.address;
    this.phoneNumber = builder.phoneNumber;
    this.password = builder.password;
  }
  
  public User(){
    User usr = new User.UserBuilder().build();

      this.name = usr.getName();
      this.emailAddress = usr.getEmailAddress();
      this.address = usr.getAddress();
      this.phoneNumber = usr.getPhoneNumber();
      this.password = usr.getPassword();
  }
  
  public User(String name,
      String emailAddress, String address, String phoneNumber, String password){
      User usr = new User.UserBuilder()
           .name(name)
           .emailAddress(emailAddress)
           .address(address)
           .phoneNumber(phoneNumber)
           .password(password)
           .build();
      this.name = usr.getName();
      this.emailAddress = usr.getEmailAddress();
      this.address = usr.getAddress();
      this.phoneNumber = usr.getPhoneNumber();
      this.password = usr.getPassword();
  }
  


  public String getName() {
    return this.name;
  }
  
  public String getEmailAddress(){
    return this.emailAddress;
  }

  public String getAddress() {
    return this.address;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  } 
  
  public String getPassword(){
    return this.password;
  }
  
  @Override
  public String toString(){
    return 
         " name: " + name + "\n"
        +  " emailAddress: " + emailAddress + "\n"
        +  " address: " + address + "\n"
        +  " phoneNumber: " + phoneNumber + "\n"
        +  " password " + password;
  }  
  
  public static class UserBuilder{

    private String name = "";
    private String emailAddress = "";
    private String address = "";
    private String phoneNumber = "";
    private String password = "";
    
    public UserBuilder name(String name){
      this.name= name;
      return this;
    }
    
    public UserBuilder emailAddress(String emailAddress){
      this.emailAddress = emailAddress;
      return this;
    }
    
    public UserBuilder address(String address){
      this.address = address;
      return this;
    }
    
    public UserBuilder phoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
      return this;
    }
    
    public UserBuilder password(String password){
      this.password = password;
      return this;
    }
    
    public User build(){
      return new User(this);
    }
    
  }    
}