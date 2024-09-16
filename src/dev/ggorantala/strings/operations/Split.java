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
public class Split {
    public static void main(String[] args) {
        String text = "Hello World Welcome";
        String[] words = text.split(" ");  // Splits the string by spaces

        for (String word : words) {
            System.out.println(word);
        }


        // splitting by comma
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");  // Splits by commas

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
