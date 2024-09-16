package dev.ggorantala.strings.operations;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright (C) 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class Trim {
    public static void main(String[] args) {
        String text = "   Hello, World!   ";
        String trimmedText = text.trim();  // "Hello, World!"
        System.out.println(trimmedText);  // Outputs: "Hello, World!"
    }
}
