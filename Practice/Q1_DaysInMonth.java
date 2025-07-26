package com.akashdipmahapatra.Practice;

import java.util.Scanner;

public class Q1_DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd-mm-yyyy): ");
        String input = sc.nextLine();

        String[] parts = input.split("-");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        int daysInMonth;

        if (month == 2)
            daysInMonth = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            daysInMonth = 30;
        else
            daysInMonth = 31;

        System.out.println("Output: " + daysInMonth);
    }
}
