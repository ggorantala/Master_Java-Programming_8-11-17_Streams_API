package dev.ggorantala.strings.introduction;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright (C) 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class CreateStrings {
    public static void main(String[] args) {
        // using string literal
        String greeting = "Hello, world!";

        // using constructor
        String name = "John Doe";

        // using char[], array of characters
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}; // char array
        String newGreeting = new String(charArray); // Hello world!

        // immutability
        String original = "Hello";
        String modified = original.concat(", World!");
    }
}
