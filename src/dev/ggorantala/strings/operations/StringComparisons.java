package dev.ggorantala.strings.operations;

import java.util.Objects;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class StringComparisons {
    public static void main(String[] args) {
        doubleEquals();
        equals();
        usingCompareTo();
        handlingNulls();
    }

    private static void handlingNulls() {
        String str1 = null;
        String str2 = "Hello";
        String str3 = "Hello";

        boolean safeComparison1 = Objects.equals(str1, str2);  // false, str1 is null
        boolean safeComparison2 = Objects.equals(str2, str3);  // true, content is the same
    }

    private static void usingCompareTo() {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);  // -1, "apple" comes before "banana"
        int result2 = str1.compareTo(str3);  // 0, both strings are equal
        int result3 = str2.compareTo(str1);  // 1, "banana" comes after "apple"

        // case sensitive
        String str4 = "Apple";
        String str5 = "apple";

        int result = str4.compareTo(str5);  // Negative value, "Apple" comes before "apple"

        // using compareToIgnoreCase()
        int result5= str4.compareToIgnoreCase(str5);  // 0, considered equal ignoring case
    }

    private static void doubleEquals() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        boolean refEqual1 = (s1 == s2);  // true, both refer to the same object in the String Pool
        boolean refEqual2 = (s1 == s3);  // false, s3 is a new object even though content is the same
    }

    private static void equals() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        boolean isEqual = str1.equals(str2);  // true, same content
        boolean notEqual = str1.equals(str3); // false, different content
    }
}
