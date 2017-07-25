package com.example;

import com.example.common.Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a month.");
        String monthChoice = userInput.nextLine();
        System.out.println(Month.getRemainingMonths(monthChoice));


    }
}
