package dev.ggorantala.streamsapi.streamsapi.otherstreams;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright © 2023 by Gopi Gorantala.
 *
 * @author Gopi Gorantala
 * Date: 07/05/23
 */

import dev.ggorantala.streamsapi.constants.Constants;

import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {
        range(Constants.START_RANGE_DELIMITER, Constants.END_RANGE_DELIMITER);
        System.out.println("---");
        rangeClosed(Constants.START_RANGE_DELIMITER, Constants.END_RANGE_DELIMITER);
        System.out.println("---");
        findMax();
    }

    private static void range(int start, int end) {
        // create an IntStream containing a range of values
        IntStream.range(start, end)
            // filter out odd values
            .filter(n -> n % 2 == 0)
            // map each value to its square
            .map(n -> n * n)
            // print the resulting values
            .forEach(System.out::println);
    }

    private static void rangeClosed(int start, int end) {
        // create an IntStream containing a range of values
        IntStream.rangeClosed(start, end)
            // filter out odd values
            .filter(n -> n % 2 == 0)
            // map each value to its square
            .map(n -> n * n)
            // print the resulting values
            .forEach(System.out::println);
    }

    private static void findMax() {
        // create an IntStream containing specified values
        IntStream.of(10, 20, 5000, 40, 50)
            // find the maximum value
            .max()
            // print the maximum value
            .ifPresent(System.out::println);
    }
}
