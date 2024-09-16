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

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> fruits = Constants.FRUITS_LIST.stream();
        fruits.forEach(System.out::println);
    }
}
