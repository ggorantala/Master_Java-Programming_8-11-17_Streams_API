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
public class IteratingStrings {
    public static void main(String[] args) {
        String text = "Hello, World!";

        // indexed for-loop
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            System.out.println(currentChar);
        }

        // for-each loop
        for (char currentChar : text.toCharArray()) {
            System.out.println(currentChar);
        }

        // using charAt() to access characters
        String text1 = "Java";
        char firstChar = text1.charAt(0);  // 'J'
        char secondChar = text1.charAt(1);  // 'a'
        System.out.println(firstChar);  // Outputs: J
        System.out.println(secondChar);  // Outputs: a


        // string to character array
        String text2 = "Hello";
        char[] charArray = text2.toCharArray();  // Converts "Hello" into ['H', 'e', 'l', 'l', 'o']

        System.out.println(charArray[0]);  // Outputs: 'H'
        System.out.println(charArray[1]);  // Outputs: 'e'

        // modifying character array
        char[] charArray1 = "Java".toCharArray();
        charArray1[0] = 'Y';  // Change 'J' to 'Y'
        String newString = new String(charArray1);  // Converts back to a string
        System.out.println(newString);  // Outputs: "Yava"

        // converting char[] to String
        char[] charArray2 = {'H', 'e', 'l', 'l', 'o'};
        String newString1 = new String(charArray2);  // Converts ['H', 'e', 'l', 'l', 'o'] into "Hello"
        System.out.println(newString1);  // Outputs: "Hello"
    }
}
