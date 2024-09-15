package dev.ggorantala.streamsapi.streamsapi.lambdas;
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

public class PrintElements {

    public static void main(String[] args) {
        Constants.INTEGERS_LIST.forEach(System.out::println);
    }
}
