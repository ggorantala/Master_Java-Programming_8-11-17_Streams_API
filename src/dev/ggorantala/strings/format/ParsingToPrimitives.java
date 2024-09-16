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
public class ParsingToPrimitives {
    public static void main(String[] args) {
        intergerParsing();
        doubleParsing();
        otherParsing();

        // exceptions
        parsingExceptions();
    }

    private static void intergerParsing() {
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);  // Converts "123" to 123
        System.out.println(number + 10);  // Outputs: 133
    }

    private static void doubleParsing() {
        String priceStr = "12.34";
        double price = Double.parseDouble(priceStr);  // Converts "12.34" to 12.34
        System.out.println(price + 1.5);  // Outputs: 13.84
    }

    private static void otherParsing() {
        String trueStr = "true";
        boolean flag = Boolean.parseBoolean(trueStr);  // Converts "true" to true
        System.out.println(flag);  // Outputs: true
    }

    private static void parsingExceptions() {
        String numberStr = "abc";

        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + numberStr);
        }


        // number format exceptions
        String[] numbers = {"123", "456", "abc", "789"};

        for (String numberString : numbers) {
            try {
                int number = Integer.parseInt(numberString);
                System.out.println("Parsed number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + numberString);
            }
        }
    }
}
