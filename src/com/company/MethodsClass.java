package com.company;

public class MethodsClass {

    public static boolean containsOne(int n) {
        //We'll write the function after we've written our unit tests
        //This is TDD: Test Driven Development.
//        if (n % 10 == 1) {
//            return true;
//        }
//        return false;
//    }
        if (n < 0) {
            throw new IllegalArgumentException("We only take positive numbers");
        }
        String numString = Integer.toString(n); //Convert the number to a string
        return numString.contains("1"); //Check to see if it contains 1
    }
}
