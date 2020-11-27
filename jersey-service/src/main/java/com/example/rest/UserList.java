package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class UserList {
  private static final CopyOnWriteArrayList<User> uList = new CopyOnWriteArrayList<>();

  static {
    // the list of users 
    uList.add(
        new User.UserBuilder()
        .name("Caitlin Cabrera")
        .emailAddress("caitlin.aol.com")
        .address("3333 South 3rd Street Louisville KY, 40222")
        .phoneNumber("333-132-0987")
        .password("1732-02-23")
        .build()
    );

    uList.add(
        new User.UserBuilder()
        .name("Elliott Cabrera")
        .emailAddress("elliott@aol.com")
        .address("3333 South 3rd Street Louisville KY, 40222")
        .phoneNumber("343-654-3234")
        .password("thepassword")
        .build()
    );

    uList.add(
      new User.UserBuilder()
      .name("Shadow Cabrera")
      .emailAddress("shadow@aol.com")
      .address("3333 South 3rd Street Louisville KY, 40222")
      .phoneNumber("343-654-3234")
      .password("woofwoofiamadog")
      .build()
    );


  }
  
  private UserList(){}
  
  public static CopyOnWriteArrayList<User> getInstance(){
    return uList;
  }
  
  public static void testList(){
    CopyOnWriteArrayList<User> list = UserList.getInstance();
    list.stream()
        .forEach(i -> System.out.println(i));
    String cString = 
        list.stream()
        .map( u -> u.toString())
        .collect(Collectors.joining("\n"));
    System.out.println(cString);
  }
    
  public static void main(String[] args) {
    UserList.testList();
  }
  
}