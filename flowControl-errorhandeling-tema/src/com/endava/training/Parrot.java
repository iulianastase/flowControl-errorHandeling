package com.endava.training;

/**
 * Created by inastase on 10/27/2016.
 */
public class Parrot {
    public boolean parrotTrouble(boolean talking, int hour)
    {
        if(talking == true && hour == 6)
        {
            System.out.println("trouble! trouble! trouble!");
            return true;
        }
        else if(talking == true && hour == 7)
        {
            System.out.println("not in trouble!");
            return false;
        }
        else if( talking == true && hour == 6)
        {
            System.out.println("trouble! trouble! trouble!");
            return false;
        }
        else
            return true;
    }
}
