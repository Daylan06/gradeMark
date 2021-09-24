package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your mark");
        float mark = input.nextFloat();
        while (mark < 0 || mark > 100) {
            System.out.println("Incorrect mark inputted");
        }
        float percentage = (mark / 50) * 100;
        System.out.println(percentage);
        if (percentage >= 80) {
            System.out.println("Your grade is A");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Your grade is B");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Your grade is C");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Your grade is D");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Your grade is E");
        } else if (percentage < 40) {
            System.out.println("Your grade is U");
        }


    }
}
