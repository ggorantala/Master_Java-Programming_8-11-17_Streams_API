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
public class StringPool {
    public static void main(String[] args) {
        stringLiteral();
        stringConstructor();
    }

    static void stringLiteral() {
        String first = "Hello world";
        String second = "Hello world"; // `second` points to the same string object as `first`
        System.out.println(first == second); // true, both refer to the same object
    }

    static void stringConstructor() {
        String third = "Hello world";
        String fourth = "Hello world"; // fourth creates a new object in heap
        System.out.println(third == fourth); // false, different references
        System.out.println(third.equals(fourth)); // true, same objects
    }
}
