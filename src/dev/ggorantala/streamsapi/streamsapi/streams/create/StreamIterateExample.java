package dev.ggorantala.streamsapi.streamsapi.streams.create;
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

import java.util.stream.Stream;

public class StreamIterateExample {

    public static void main(String[] args) {
        Stream<Integer> stream =
            Stream.iterate(Constants.SEED_VALUE, n -> n + 2).limit(Constants.LIMIT_VALUE);
        stream.forEach(System.out::println);
    }
}
