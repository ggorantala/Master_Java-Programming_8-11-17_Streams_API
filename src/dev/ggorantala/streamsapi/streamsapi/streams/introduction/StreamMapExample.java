package dev.ggorantala.streamsapi.streamsapi.streams.introduction;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import dev.ggorantala.streamsapi.constants.Constants;

import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        Constants.FRUITS_LIST // list of integer values
            .stream() // Stream<String>
            .map(String::length) // Stream<Integer>
            .collect(Collectors.toList())
            .forEach(System.out::println); // Output: Fruit Lengths: [5, 6, 6, 4, 5, 4]
    }
}
