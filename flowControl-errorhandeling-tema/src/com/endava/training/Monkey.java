package com.endava.training;

/**
 * Created by inastase on 10/27/2016.
 */
public class Monkey {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if(aSmile == true && bSmile == true)
        {
            System.out.println("We are in trouble!");
            return true;
        }
        else if(aSmile == false && bSmile == false)
        {
            System.out.println("We are in trouble!");
            return true;
        }
        else{
            System.out.println("We are safe!");
            return false;
        }
    }
}
