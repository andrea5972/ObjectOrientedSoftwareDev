/*
Author: Andrea Murphy
Date: 09/16/2018
Purpose: Strategy Design Patterns
*/

import java.util.*;

public class Car implements RunHW2 {
        Make make;
        Model model;
        Year year;
        Description description;
        Rating rating;
        Price price;
        CarStrategy object;

    public Car(String make, String model, String year, String description, String rating, String price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.description = description;
        this.rating = rating;
        this.price = price;
    }

    public void setDesciption(String description) {
    }

    public static String getDescription() {
    }

    public void setStrategy(CarStrategy strategy) {
    }
}
