package dev.ggorantala.streamsapi.streamsapi.streams.introduction;
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

public class StreamFilter {

    public static void main(String[] args) {

        // Filter elements based on a condition
        Constants.FRUITS_LIST // collection of strings
            .stream() // Stream<String>
            .filter(fruit -> fruit.startsWith("a")) // Stream<String>
            .toList() // List<String>
            .forEach(System.out::println); // Output: Filtered Fruits: [apple]
    }
}
