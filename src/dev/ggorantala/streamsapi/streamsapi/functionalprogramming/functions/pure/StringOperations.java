package dev.ggorantala.streamsapi.streamsapi.functionalprogramming.functions.pure;
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

public class StringOperations {

    public static void main(String[] args) {
        String result = add(Constants.FIRST_STRING, Constants.SECOND_STRING);
        System.out.println(result);
    }

    public static String add(String s1, String s2) {
        return s1.concat(s2);
    }
}
