package com.endava.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static boolean posNeg(int a, int b, boolean negative) {
        if ((a > 0 && b < 0 && negative == false) || (a < 0 && b > 0 && negative == false)) {
            System.out.println("One if them is negative!");
            return true;
        } else if (a < 0 && b < 0 && negative == true) {
            System.out.println("The numbers are both negative!");
            return true;
        } else return true;
    }

    public static String backAround(String str) {
        if (str.length() > 0) {
            char c = str.charAt(str.length() - 1);
            System.out.println(c + str + c);
        }
        return str;
    }

    public static String everyNth(String str, int n) {
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        return str;
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] >= scores[i - 1]) {
                continue;
            } else {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end - 1; i++) {
            sum = sum + Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    static void outOfMem() throws OutOfMemoryError {
        try {
            int[] vect = new int[33 * 23564 * 94556];
        } catch (OutOfMemoryError err) {
            System.out.println("Out Of Memory Error!!");
        }
    }

    static void overflow() {
        try {
            System.out.println("overflow.....");
            overflow();
        } catch (StackOverflowError stk) {
            System.out.println("Stack Overflow Error!");
        }
    }

    static void finallyDem() {
        try {
            System.out.println("Try Block!!");
            throw new Exception();
        } catch(Exception e) {
            System.out.println("Catched!!");
            return;
        } finally {
            System.out.println("Finally!! even though it's a return above me :)");
            return;
        }
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.monkeyTrouble(true, true);
        monkey.monkeyTrouble(false, true);

        Parrot parrot = new Parrot();
        parrot.parrotTrouble(true, 6);
        posNeg(-1, 1, false);
        posNeg(1, -1, false);
        posNeg(-4, -5, true);

        backAround("cat");
        backAround("Hello");
        backAround("a");

        everyNth("Miracle", 2);
        everyNth("abcdefg", 2);
        everyNth("abcdefg", 3);

        int[] scores1 = {1, 3, 4};
        scoresIncreasing(scores1);
        int[] scores2 = {1, 3, 2};
        scoresIncreasing(scores2);

        int[] heights = {5, 3, 6, 7, 2};
        System.out.println(sumHeights(heights, 2, 4));
        System.out.println(sumHeights(heights, 0, 1));
        System.out.println(sumHeights(heights, 0, 4));

        outOfMem();
        overflow();
        finallyDem();

        Calculator calc = new Calculator();
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        calc.average(list);


    }
}
