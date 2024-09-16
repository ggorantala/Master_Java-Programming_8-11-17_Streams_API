package dev.ggorantala.strings.operations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class RegularExpressions {
    public static void main(String[] args) {
        findDigitsInString(); // finding digits in string
        extractingPatterns(); // extracting patterns from a string
    }

    private static void findDigitsInString() {
        String text = "My phone number is 12345.";
        Pattern pattern = Pattern.compile("\\d+");  // The regex \\d+ looks for one or more digits
        Matcher matcher = pattern.matcher(text);


        if (matcher.find()) {
            System.out.println("Found digits: " + matcher.group());  // Outputs: "12345"
        }
    }
    private static void extractingPatterns() {
        String text = "Contact us at support@example.com or sales@example.org.";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}
