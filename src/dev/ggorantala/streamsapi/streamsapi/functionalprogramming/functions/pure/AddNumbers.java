package dev.ggorantala.streamsapi.streamsapi.functionalprogramming.functions.pure;
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

public class AddNumbers {

    public static void main(String[] args) {
        Integer sum = addNumbers(Constants.INTEGER_FIRST_VALUE, Constants.INTEGER_SECOND_VALUE);
        System.out.println(sum);
    }

    public static Integer addNumbers(Integer first, Integer second) {
        return first + second;
    }
}
