package dev.ggorantala.streamsapi.streamsapi.functionalinterfaces.types.supplier;
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

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> s = () -> Constants.GREETING_MESSAGE;

        System.out.println(s.get()); // Hello, Developers!
    }
}
