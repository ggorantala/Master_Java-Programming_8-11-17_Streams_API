package dev.ggorantala.strings.performance;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class StringBuilderVsStringConcatenation {
    public static void main(String[] args) {
        stringConcatenation();
        stringBuilder();
        performanceComparison();
    }

    private static void performanceComparison() {
        // using + operator
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "Hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with + operator: " + (endTime - startTime) + " ms"); // 28ms

        // using StringBuilder
        long startTime1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello");
        }
        String result1 = sb.toString();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime1 - startTime1) + " ms"); // 4ms

    }

    private static void stringConcatenation() {
        // immutable string
        String result = "Hello" + " " + "World";

        // multiple intermediate objects
        String result1 = "Part1";
        result1 = result1 + "Part2";
        result1 = result1 + "Part3";

        // inefficiency in loops
        String result2 = "";
        for (int i = 0; i < 1000; i++) {
            result2 += "Hello";
        }
    }

    private static void stringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("Hello");
        }
        String result = sb.toString();
    }
}
