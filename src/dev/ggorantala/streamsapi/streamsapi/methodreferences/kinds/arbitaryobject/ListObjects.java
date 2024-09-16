package dev.ggorantala.streamsapi.streamsapi.methodreferences.kinds.arbitaryobject;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author Gopi Gorantala
 * Date: 07/05/23
 */

import dev.ggorantala.streamsapi.model.Person;

public class ListObjects {
    public static void main(String[] args) {
        Person.PEOPLE // list of persons
            .stream()
            .map(Person::name) // Stream<String>
            .toList()
            .forEach(System.out::println);
    }
}
