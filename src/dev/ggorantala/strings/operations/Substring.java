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
public class Substring {
    public static void main(String[] args) {
        //substring from a specific position
        String text = "Hello, World!";
        String subText = text.substring(7);  // "World!"

        // substring between two positions
        String text1 = "Hello, World!";
        String subText1 = text.substring(0, 5);  // "Hello"

        // index out of bounds
        String text2 = "Hello, World!";
        String subText2 = text.substring(0, 50);  // This will throw an exception because 50 is too large

        // empty strings
        String text3 = "Hello";
        String subText3 = text.substring(3, 3);  // Result: ""

        // inefficient code ❌
        String text4 = "Hello, World!";
        for (int i = 0; i < text.length(); i++) {
            String subText4 = text.substring(i);
        }
    }
}
