package dev.ggorantala.streamsapi.streamsapi.methodreferences;
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

public class StringOperations {

    public static void main(String[] args) {
        helper();
    }

    // String operation using method reference
    private static void helper() {
        Constants.FRUITS_LIST // collection of fruits
            .stream() // stream of fruits
            // mapping/transforming each stream value using method reference
            .map(String::toUpperCase)
            // printing them using method reference (shorthand syntax)
            .forEach(System.out::println);
    }
}
