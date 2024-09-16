package dev.ggorantala.streamsapi.streamsapi.functionalinterfaces.types.consumer;
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

import java.util.function.Consumer;

public class AcceptExample {

    public static void main(String[] args) {
        print(Constants.INTEGER_VALUE);
    }

    public static void print(Integer number) {
        Consumer<Integer> consumer = A -> System.out.println(A * Constants.MULTIPLIER);
        consumer.accept(number);
    }
}
