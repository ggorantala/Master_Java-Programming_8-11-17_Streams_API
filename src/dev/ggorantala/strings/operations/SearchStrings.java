package dev.ggorantala.strings.operations;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright©2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class SearchStrings {
    public static void main(String[] args) {
        //searching for a character
        String text = "Hello, World!";
        int index = text.indexOf('W');  // 7
        System.out.println(index);  // Outputs: 7

        // searching a substring
        int index1 = text.indexOf("World");  // 7
        System.out.println(index1);  // Outputs: 7

        // when search fails
        int index2 = text.indexOf('X');  // -1
        System.out.println(index2);  // Outputs: -1

        // using lastIndexOf()
        int index3 = text.lastIndexOf('H');  // 7
        System.out.println(index3);  // Outputs: 7

        // find last occurrence of a substring
        String text4 = "banana";
        int index4 = text4.lastIndexOf("an");  // 3
        System.out.println(index4);  // Outputs: 3
    }
}
