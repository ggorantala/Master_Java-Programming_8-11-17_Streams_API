package dev.ggorantala.streamsapi.streamsapi.streams.create;
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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamExample {
    public static void main(String[] args) {
        // not empty collection items
        System.out.println("Non empty collections");
        isEmptyStream(Constants.LANGUAGES_LIST).forEach(System.out::println);

        // for empty collections
        System.out.println("Empty collections");
        List<String> emptyLocales = new ArrayList<>();

        isEmptyStream(emptyLocales).forEach(System.out::println); // prints nothing
    }

    /**
     * this is how we check and give empty stream
     *
     * @param languages
     * @return stream
     */
    public static Stream<String> isEmptyStream(List<String> languages) {
        return languages == null || languages.isEmpty() ? Stream.empty() : languages.stream();
    }
}
