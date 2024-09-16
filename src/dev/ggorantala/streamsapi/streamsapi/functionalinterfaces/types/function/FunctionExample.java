package dev.ggorantala.streamsapi.streamsapi.functionalinterfaces.types.function;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author Gopi Gorantala
 * Date: 07/05/23
 */

import dev.ggorantala.streamsapi.constants.Constants;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> length = String::length; // same as `str -> str.length();`

        // Calling the apply() method to get the length of a string
        Integer result = length.apply(Constants.GREETING_MESSAGE);
        System.out.println("Length: " + result);
    }
}
