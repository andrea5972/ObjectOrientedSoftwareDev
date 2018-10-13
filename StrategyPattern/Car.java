/*
Author: Andrea Murphy
Date: 09/16/2018
Purpose: Strategy Design Patterns
*/

package oop_hw2;

import java.util.*;

public class Car {
    String year, make, model, price, rating;
    CarStrategy cStrat = null;

    public Car(String make, String model, String year, String rating, String price) {
        this.make = make;
        this.model = model;
        this.rating = rating;
        this.price = price;
    }


    public static String getDescription() {
        String ret = "Make: " + make + "\n";
        ret += "Model: " + model + "\n";
        ret += "Year: " + year + "\n";
        ret += "Price: " + price + "\n";
        ret += "Rating: " + rating +"\n";

        if (cStrat != null) {
            ret += cStrat.getExtendedDescription();
        }
        return ret;
    }
    public void setCarStrategy(CarStrategy cs){
        cStrat = cs;
    }
    public void removeCarStrategy(){
        cStrat = null;
    }
}
