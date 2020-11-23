package model.edu.cofc.cs656;

public class DriverDirections {

    private String directionsToCustomer = " ";
    private String directionsToRestaurant = " ";
    private String miscCustomerDirections = " ";
    private String currentLocation = " ";

    public DriverDirections(String directionsToCustomer, String directionsToRestaurant, String miscCustomerDirections, String currentLocation) {
        this.directionsToCustomer = directionsToCustomer;
        this.directionsToRestaurant = directionsToRestaurant;
        this.miscCustomerDirections = miscCustomerDirections;
        this.currentLocation = currentLocation;
    }

    public static String viewAllDirections(String orderID) {

        String allDirections = "Turn right on 3rd street, Turn left on main street, ring doorbell 3 times";

        return allDirections;
    }

    public static String viewDirectionsToCustomer(String orderID) {

        String directions = "Turn left on main street";

        return directions;
    }

    public static String viewDirectionsToRestaurant(String orderID) {

        String directions = "Turn right on 3rd street";

        return directions;
    }

    public static String viewMiscCustomerDirections(String orderID) {

        String directions = "ring doorbell 3 times";

        return directions;
    }

    public String getDirectionsToCustomer() {
        return directionsToCustomer;
    }

    public void setDirectionsToCustomer(String directionsToCustomer) {
        this.directionsToCustomer = directionsToCustomer;
    }

    public String getDirectionsToRestaurant() {
        return directionsToRestaurant;
    }

    public void setDirectionsToRestaurant(String directionsToRestaurant) {
        this.directionsToRestaurant = directionsToRestaurant;
    }

    public String getMiscCustomerDirections() {
        return miscCustomerDirections;
    }

    public void setMiscCustomerDirections(String miscCustomerDirections) {
        this.miscCustomerDirections = miscCustomerDirections;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
