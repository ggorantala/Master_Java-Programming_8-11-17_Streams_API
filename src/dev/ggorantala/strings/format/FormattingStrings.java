package dev.ggorantala.strings.format;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class FormattingStrings {
    public static void main(String[] args) {
        formatString1(); // formatting with %s and %d
        formatString2(); // formatting with %f
        paddingAndAlignment(); // padding and alignment
        combineMutipleSpecifiers(); // strings mixing with integers, floating-point
    }

    private static void formatString1() {
        String name = "Alice";
        int age = 25;

        String result = String.format("My name is %s, and I am %d years old.", name, age);
        System.out.println(result);  // Outputs: "My name is Alice, and I am 25 years old."
    }

    private static void formatString2() {
        String name = "Alice";
        int age = 25;

        String result = String.format("My name is %s, and I am %d years old.", name, age);
        System.out.println(result);  // Outputs: "My name is Alice, and I am 25 years old."

        // 3 decimal places
        double pi = 3.14159;
        String result1 = String.format("Pi to 3 decimal places: %.3f", pi);
        System.out.println(result1);  // Outputs: "Pi to 3 decimal places: 3.142"
    }

    private static void paddingAndAlignment() {
        String leftAligned = String.format("%-10s | %-10s", "Name", "Age");
        String rightAligned = String.format("%10s | %10s", "Alice", "25");

        System.out.println(leftAligned);   // Outputs: "Name       | Age       "
        System.out.println(rightAligned);  // Outputs: "     Alice |        25"

        // padding with leading zeros
        int number = 7;
        String result = String.format("%03d", number);
        System.out.println(result);  // Outputs: "007"
    }

    private static void combineMutipleSpecifiers() {
        String name = "Bob";
        int age = 30;
        double salary = 50000.567;

        String result = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(result);  // Outputs: "Name: Bob, Age: 30, Salary: 50000.57"
    }

}
