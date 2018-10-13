/*
Author: Andrea Murphy
Date: 09/16/2018
Purpose: Strategy Design Patterns
*/

package oop_hw2;

import java.util.*;

public interface class RunHW2{

    public static void main(String[] args){
        Car car1, car2, car3;


        Car car1 = new Car("Honda", "Fit", "2013", "Good", "8000")
        Car car2 = new Car("Ford", "Focus", "2000", "Fair", "2000")
        Car car3 = new Car("Toyota", "4Runner", "2018", "Excellent", "10000")

        CarStrategy cs = new CarStrategy("I drove this car for 5 years!");
        car2.setCarStrategy(cs);    S

        System.out.println("Car 1: \n" +  car1.getDescription());
        System.out.println("Car 2: \n" +  car2.getDescription());
        System.out.println("Car 3: \n" +  car3.getDescription());
    }
}

