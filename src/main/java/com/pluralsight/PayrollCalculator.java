package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Enter hours worked: ");
        float hoursWorked = myScanner.nextFloat();
        System.out.println("Enter Pay Rate: ");
        float payRate = myScanner.nextFloat();
        float overtimehours = hoursWorked - 40;
        float overtimePay = 0.0f;
        float totalPay = 0.0f;
        if (overtimehours > 0){
            overtimePay = overtimehours * (1.5f * payRate);
            totalPay = overtimePay + (40 * payRate);
        }else{
            totalPay = hoursWorked * payRate;
        }
        System.out.println(name + "'s gross pay is " + totalPay);



    }
}
