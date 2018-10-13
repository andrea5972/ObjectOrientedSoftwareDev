/*
Author: Andrea Murphy
Date: 09/16/2018
Purpose: Strategy Design Patterns
*/

package oop_hw2;

import java.util.*;

public class CarStrategy{
    String description;

    public CarStrategy(String desc){
        this.description = desc;
    }
    public String getExtendedDescription(){
        return description;
    }
}
