package dev.ggorantala.strings.operations;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class ReplaceAndReplaceAll {
    public static void main(String[] args) {
        replace();
    }

    private static void replace() {
        String text = "Hello, World!";
        String newText = text.replace('l', 'x');  // "Hexxo, Worxd!"
        System.out.println(newText);  // Outputs: "Hexxo, Worxd!"

        // You can also replace entire substrings:
        String text1 = "I love Java!";
        String newText1 = text1.replace("Java", "Python");  // "I love Python!"
        System.out.println(newText1);  // Outputs: "I love Python!"
    }

    private static void replaceAll() {
        String text = "123abc456";
        String newText = text.replaceAll("\\d", "X");  // Replaces all digits with 'X'
        System.out.println(newText);  // Outputs: "XXXabcXXX"
    }
}
