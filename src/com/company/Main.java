package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Egn();
    }
    enum Sex {
        Man,
        Woman,
    }

    private static void Egn(){
        System.out.println("Enter you EGN");

        Scanner sc = new Scanner(System.in);
        String egn = sc.nextLine();
        if (egn.length()!= 10){
            do {
                System.out.println("Please enter 10 numbers");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next(); // this is important!
                }
                egn = sc.nextLine();
            } while (egn.length() >10||egn.length()<10);
        }

        System.out.println("You EGN have 10 numbers");


        String dayOfBirth=egn.substring(4,6);

        String monthOfBirth=egn.substring(2,4);

        String yearOfBirth=egn.substring(0,2);


        int mon= Integer.parseInt(monthOfBirth);
        int day=Integer.parseInt(dayOfBirth);
        int year=Integer.parseInt(yearOfBirth);
        if(mon>52|day>31){
            System.out.println("This EGN is impossible!!!");
            do {
                System.out.println("This EGN is impossible!!!");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next(); // this is important!
                }
                egn = sc.nextLine();
            } while (mon<52|day<31);
        }

        if (mon > 40) {
            System.out.println("Your date of birth : "+day+"."+(mon-40)+"."+ (year+2000));
        } else
        if (mon > 20) {
            System.out.println("Your date of birth : " + day+"."+(mon-20)+"."+ (year+1800));
        } else {

            System.out.println("Your date of birth : "+ day+"."+mon+"."+ (year+1900));
        }


        String sex=egn.substring(1,7);
        int sexI=Integer.parseInt(sex);
        if(sexI%2==0){
            System.out.println(Sex.values()[0]);
        }else
            System.out.println(Sex.values()[1]);


    }
}

