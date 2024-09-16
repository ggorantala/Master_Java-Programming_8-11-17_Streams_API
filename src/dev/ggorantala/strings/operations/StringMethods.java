package dev.ggorantala.strings.operations;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright (C) 2024 by Gopi Gorantala, MIT License.
 *
 * @author ggorantala
 * Date: 16/09/24
 */
public class StringMethods {
    public static void main(String[] args) {
        // length()
        String text = "Hello, World!";
        int len = text.length();  // len will be 13

        // charAt()
        // syntax: `char character = stringVariable.charAt(index);`
        String word = "Java";
        char letter = word.charAt(2);  // letter will be 'v'

        // empty()
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();  // isEmpty will be true

        // equals()
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        boolean isEqual = str1.equals(str2);  // true, content is the same
        boolean notEqual = str1.equals(str3); // false, content differs

        // substring
        // syntax: `String subString = stringVariable.substring(startIndex);` and
        //         `String subString = stringVariable.substring(startIndex, endIndex);`
        String text1 = "Hello, World!";
        String sub1 = text1.substring(7);        // "World!"
        String sub2 = text1.substring(0, 5);     // "Hello"

        // concat()
        // syntax: `String newString = stringVariable.concat(anotherString);`
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName.concat(" ").concat(lastName);  // "John Doe"
        String fullNameAnotherWay = firstName + " " + lastName;  // "John Doe"

        // indexOf(), syntax: `int index = stringVariable.indexOf(characterOrSubstring);`
        String text2 = "Hello, World!";
        int indexChar = text2.indexOf('W');  // 7
        int indexSub = text2.indexOf("World");  // 7
        int notFound = text2.indexOf('x');  // -1

        // toLowerCase()
        String text4 = "JAVA";
        String lowerText = text4.toLowerCase();  // "java"

        // toUpperCase()
        String text5 = "java";
        String upperText = text5.toUpperCase();  // "JAVA"
    }
}
