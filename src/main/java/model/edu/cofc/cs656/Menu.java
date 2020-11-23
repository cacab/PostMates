package model.edu.cofc.cs656;

import java.util.ArrayList;

public class Menu {


    public String foodItem = " ";
    public float pricePerItem;
    public int quantity;
    public String cusineType;


    public Menu(String foodItem, float pricePerItem, int quantity, String cusineType) {
        this.foodItem = foodItem;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.cusineType = cusineType;
    }

    public static void createFoodMenuItem(ArrayList<String> foodMenu) {

        foodMenu.add("Don't You Four Cheddar 'Bout Me Burger (comes with four kinds of cheddar)");


    }


    public static void updateFoodMenuItem(ArrayList<String> foodMenu) {

        foodMenu.add("Ruta-Bag-A Burger");
        foodMenu.add("Romanes of the Day Burger");
        foodMenu.add("The Cauliflower's Cumin From Inside the House Burger (comes with cauliflower & cumin)");
        foodMenu.add("Gourdon-Hamsey Burger (comes with squash & ham)");
        foodMenu.add("The Silentil Night Burger (comes with lentils)");
        foodMenu.add("Poutine on the Ritz Burger (comes with poutine fries)");



    }

    private static String deleteFoodMenuItem(ArrayList<String> foodMenu) {

        return "Deleted the item from the menu";

    }



    private static void createPriceMenuItem(ArrayList<Double> priceMenu) {

        priceMenu.add(3.45);

    }

    private static String deletePriceMenuItem(ArrayList<Double> priceMenu) {

        return "Deleted the item from the menu";

    }

    private static String updatePriceMenuItem(ArrayList<Double> priceMenu) {

        return "Changed the price to $0.99";

    }

    private static String addCusineType(String restaurantID) {

        return "Cusine added as Cuban food";

    }

    private static String changeCusineType(String restaurantID) {

        return "Cusine changed to Indian food";

    }

    private static String viewCusineType(String restaurantID) {

        return "The cusine type is Indian food";

    }

    private static String deleteCusineType(String restaurantID) {

        return "The cusine type has been deleted";

    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(float pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCusineType() {
        return cusineType;
    }

    public void setCusineType(String cusineType) {
        this.cusineType = cusineType;
    }
}
