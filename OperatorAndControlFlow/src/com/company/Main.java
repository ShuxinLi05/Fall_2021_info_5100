package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 5;

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println("Add = " + add);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("remainder = " + remainder);

        a += 2;
        b -=1;
        boolean bValue = true;
        bValue = !bValue;

        a++; // a = a+1
        b--; // b = b-1

        if( bValue == true){
            // comand j sout
            System.out.println("Boolean value is true");
        }

        if (b > 10){
            System.out.println("b's value is greater than 10");
        }else{
            System.out.println("b's value is less than 10");
        }

        // == equal to
        // != not equal to
        // > greater than
        // >= greater than equal to
        // < less than
        // <= less than equal to

        // if b == 10 and a > 22 then print some value

        a = 25;
        b += 7;
        if (b == 10){
            if ( a > 22 ){
                System.out.println("b's value is equal to 10 and a's value greater than 22");
            }
        }

        // Conditional operators
        // && and
        // || or condition
        // ? ternary operator

        b--;
        if( b >10 || a > 22){
            System.out.println("b's value is equal to 10 or a's value is greater than 22");
        }



        int result = 5;

        if(b > 10){
            result = 10;
        }else{
            result = 15;
        }
        // result = (conditional expression) ? value 1: value2;

        b = 18;
        result = b >10 ? 10 : 15;

        if(b < 10){
            System.out.println("B is less than 10");
        }else if( a > 20){
            System.out.println("A is greater than 20");
        }else{
            System.out.println("I don't know what is going on");
        }

        a = -5;
        a = -a;
        a = a+1;
        System.out.println("A's value should be " + a);

        // loops
        // assign the values
        //int[] arr = new int[5];
        //arr[0] = 1;
        //arr[1] = -3;
        //arr[2] = 9;
        //arr[3] = 10;
        //arr[4] = 4;

        int[] arr = {2,-3,9,4,3};
        System.out.println(arr[3]);

        for(int i = 0; i < arr.length; i++){
            System.out.println("Value of i = " + i);
            System.out.println("Value of arr[i] = " + arr[i]);
        }

        for (int num : arr ) {
            System.out.println("Value = " + num);

        }

        boolean[] bValues = {true, false, false, true};
        for (boolean booleanvalue : bValues) {
            System.out.println(booleanvalue);
        }

        int count = 10;
        while( count > 0 ){
            System.out.println("Count value = " + count);
            count --;
        }

        // Do while
        do{
            System.out.println("Count value = " + count);
            count --;
        }while( count > 0 );

        char[] name = {'A','s','h','i','s','h'};
        for(Character ch : name){
            System.out.println(ch);
        }
        System.out.println(name.toString());


        String myName = "Ashish";
        System.out.println(myName);

        printName("Ashish", "Singh");

        printDayOfTheWeek(0);



    } // end of main function



    static void printName(String firstName, String lastName){
        String fullName = firstName + lastName;
        System.out.println("Name = " + fullName);

    }

    static void printDayOfTheWeek(int day){
         // sun = 0, Monday = 1, ...

        /*
        if(day == 0){
            System.out.println("Today is Sunday");

        }
        else if(day == 1){
            System.out.println("Today is Monday");

        }
        else if(day == 2){
            System.out.println("Today is Tues");

        }
        else if(day == 3){
            System.out.println("Today is Wednes");

        }
        else if(day == 4){
            System.out.println("Today is Thur");

        }
        else if(day == 5){
            System.out.println("Today is Fri");

        }
        else if(day == 6){
            System.out.println("Today is Sat");

        }
        else{
            System.out.println("Invalid");
        }
        */


        switch (day){
            case = 0:
                System.out.println("Today is sun");
                break;
            case = 1:
                System.out.println("Today is mon");
                break;
            case = 2:
                System.out.println("Today is tue");
                break;
            case = 3:
                System.out.println("Today is wed");
                break;
            case = 4:
                System.out.println("Today is thu");
                break;
            case = 5:
                System.out.println("Today is fri");
                break;
            case = 6:
                System.out.println("Today is sat");
                break;
            default:
                break;
        }

    }
    static void printMonth(String month){
        switch (month.toLowerCase()){
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            case "Mar":
                System.out.println("March");
                break;
            case "Apr":
                System.out.println("April");
                break;
            case "Oct", "Nov", "Dec":
                System.out.println("winter");
                break;

            default:
                System.out.println("Unknown");
        }
    }



} // end of the class

