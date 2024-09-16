package dev.ggorantala.strings.introduction;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright (C) 2024 by Gopi Gorantala, MIT License.
 *
 * @author ggorantala
 * Date: 16/09/24
 */
public class StringsHeapStackMemory {
    public static void main(String[] args) {
        // references are stored in stack and objects on heap
        String literalString = "Hello";  // Stored in String Pool (on Heap)
        String newString = "World";  // Stored in Heap (outside the String Pool)

        // string pool optimizes memory
        String s1 = "Hello";
        String s2 = "Hello";  // Reuses the same object from the String Pool
    }
}
