package com.company;

public class Main {

    public static void main(String[] args) {
        // variable name always start with lower case
        // command j(sout):
        System.out.println("Hello World");
        System.out.println("New Line");

        // define variables:
        // lower case int; numOfStudentInClass is not a class; string, Integer are classes (wrapper class)
        // int is the property inside the class Integer
        int numOfStudentsInClass = 62;

        // upper case Integer, will have different kind of features, Integer is whole number, there is a limit, can go
        // both positive and negative, there is max and min values
        Integer test = 52;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // max = max + 1; -> Max Value of Integer = -2147483648
        // min = min - 1; -> Min Value of Integer = 2147483647

        System.out.println("Max Value of Integer =" + max);
        System.out.println("Min Value of Integer =" + min);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        System.out.println("Max Value of Short = " + maxShort);
        System.out.println("Min Value of Short = " + minShort);

        float myFloat = 5.23f;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        System.out.println("myFloat = " + myFloat);
        System.out.println("Max Value of Float = " + maxFloat);
        System.out.println("Min Value of Float = " + minFloat);

        double myDouble = 5.23d;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("myDouble = " + myDouble);
        System.out.println("Max Value of Double = " + maxDouble);
        System.out.println("Min Value of Double = " + minDouble);

        long myLong = 5;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("myLong = " + myLong);
        System.out.println("Max Value of Long = " + maxLong);
        System.out.println("Min Value of Long = " + minLong);


    }

    //public static void thisIsNewFunction(){ }

}

