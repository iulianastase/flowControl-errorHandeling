package com.endava.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inastase on 10/27/2016.
 */
public class Calculator {
    public int add(int a, int b){
        int sum = a + b;
        try{
            if((a > 0) && b > (Integer.MAX_VALUE - a)){
                System.out.println("sum > Integer.MAX_VALUE");
            }
            throw new OverflowException();
        }catch(OverflowException ovf){

        }
        try{
            if((a < 0) && b < (Integer.MAX_VALUE - a)){
                System.out.println("sum > Integer.MIN_VALUE");
            }
            throw new UnderflowException();
        }catch (UnderflowException uvf){

        }
        return sum;

    }
    public int divide(int a, int b){
        int div = a/b;
        return div;
    }
    public int average(List<Integer> list) {
        int avg = 0;
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum=add(sum,list.get(i));
        }
        avg = divide(sum,list.size());
        System.out.println("The average is: " + avg);
        return avg;

    }
}
