package org.example;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        double grade01, grade02, grade03;
        Scanner scan = new Scanner(System.in);
        System.out.println("Grade 01: ");
        grade01 = scan.nextDouble();
        System.out.println("Grade 02: ");
        grade02 = scan.nextDouble();
        System.out.println("Grade 03: ");
        grade03 = scan.nextDouble();

        // logic grade
        if (grade03 < 4.0) {
            System.out.println("Failed in 3th grade!");
        } else {
            double average;
            average = (grade01 + grade02 + grade03)/3;
            System.out.println("Average grade: " + average);
            if (average >= 5.0) {
                System.out.println("Approved!");
            } else {
                System.out.println("Failed!");
            }
        }
    }
}
