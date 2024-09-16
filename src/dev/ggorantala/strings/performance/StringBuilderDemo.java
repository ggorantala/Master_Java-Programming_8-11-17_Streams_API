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
public class StringBuilderDemo {
    public static void main(String[] args) {
        append();
        insert();
        delete();
        replace();
        reverse();
        convertion();
    }

    private static void append() {
        System.out.println("Hello" + " World");  // Outputs: "Hello World"
    }

    private static void insert() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Beautiful ");
        System.out.println(sb);  // Outputs: "Hello Beautiful World"
    }

    private static void delete() {
        StringBuilder sb = new StringBuilder("Hello Beautiful World");
        sb.delete(6, 16);
        System.out.println(sb);  // Outputs: "Hello World"
    }

    private static void replace() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Universe");
        System.out.println(sb);  // Outputs: "Hello Universe"
    }

    private static void reverse() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);  // Outputs: "olleH"
    }

    private static void convertion() {
        String str = "Hello World";
        System.out.println(str);  // Outputs: "Hello World"
    }
}
