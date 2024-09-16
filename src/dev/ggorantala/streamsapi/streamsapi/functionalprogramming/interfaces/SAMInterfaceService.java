package dev.ggorantala.streamsapi.streamsapi.functionalprogramming.interfaces;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author Gopi Gorantala
 * Date: 07/05/23
 */


import dev.ggorantala.streamsapi.model.Book;

@FunctionalInterface
public interface SAMInterfaceService {
    void addBook(Book book);
}