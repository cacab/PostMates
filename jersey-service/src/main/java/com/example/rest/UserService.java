package com.example.rest;
import com.example.rest.User;
import com.example.rest.UserList;
import org.glassfish.jersey.server.model.Parameter;
import com.example.rest.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserService {

  private final CopyOnWriteArrayList<User> uList = UserList.getInstance();

  @GET
  @Path("/all")
  @Produces(MediaType.TEXT_PLAIN)
  public String getAllUsers() {
    return "List of PostMates users: \n"
        + uList.stream()
        .map(u -> u.toString())
        .collect(Collectors.joining("\n"));
  }


@Path("/all")
@POST
@Consumes("application/x-www-form-urlencoded")
public  void post(@FormParam("name") String name, @FormParam("emailAddress") String emailAdderess, 
      @FormParam("address") String address, 
      @FormParam("phoneNumber") String phoneNumber, 
      @FormParam("password") String password) {
 

         uList.add(new User.UserBuilder().name(name)
        .emailAddress(emailAdderess)
        .address(address)
        .phoneNumber(phoneNumber)
        .password(password)
        .build()); 
  
      
  }


}