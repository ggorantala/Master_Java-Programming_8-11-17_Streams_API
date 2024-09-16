package dev.ggorantala.streamsapi.streamsapi.functionalinterfaces.types.supplier;
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

import java.util.function.Supplier;

public class StringOperations {


    public static void main(String[] args) {
        Supplier<Boolean> flag = () -> Constants.FRUIT_NAME.length() == Constants.LENGTH_VALUE;
        Supplier<Integer> multiplier = () -> Constants.FRUIT_NAME.length() * Constants.MULTIPLIER;
        Supplier<String> operation = Constants.FRUIT_NAME::toLowerCase;

        System.out.println(flag.get());
        System.out.println(multiplier.get());
        System.out.println(operation.get());
    }
}
