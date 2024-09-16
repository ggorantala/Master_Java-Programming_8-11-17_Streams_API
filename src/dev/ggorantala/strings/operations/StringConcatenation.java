package dev.ggorantala.strings.operations;

import java.util.Objects;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright (C) 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;  // "John Doe"

        String greeting = "Hello, " + "my name is " + "John Doe!"; // Result: "Hello, my name is John Doe!"

        // differences b/w + and concat()
        String name = null;

        // String result2 = "Hello".concat(name);  // This would throw a NullPointerException
        String result = "Hello, " + name;  // "Hello, null";

        // bac approach ❌
        String result1 = "";
        for (int i = 0; i < 1000; i++) {
            result1 += "data";  // Creates a new string in each iteration
        }

        // Good/better approach ✅
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append("data");
        }
        String result2 = builder.toString();  // Converts StringBuilder back to a String

        // handling null strings during concatenation
        String name1 = null;
        String greeting1 = "Hello, " + Objects.toString(name, "");  // "Hello, "
        
        // alternatively, you can handle null with simple check:
        String name2 = null;
        String greeting2 = "Hello, " + (name == null ? "" : name);  // "Hello, "
    }
}
