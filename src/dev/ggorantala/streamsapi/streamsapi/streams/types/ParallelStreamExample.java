package dev.ggorantala.streamsapi.streamsapi.streams.types;
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

public class ParallelStreamExample {
    public static void main(String[] args) {

        Integer sum =
            Constants.INTEGERS_LIST // list of integers
                .parallelStream() // parallel stream
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();

        System.out.println(sum); // Output: 12
    }
}
