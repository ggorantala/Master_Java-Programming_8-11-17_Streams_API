package dev.ggorantala.streamsapi.service;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright © 2023 by Gopi Gorantala.
 *
 * @author Gopi Gorantala
 * Date: 07/05/23
 */

import dev.ggorantala.streamsapi.model.Book;

@FunctionalInterface
public interface BookService {
    Book getBook(
        String title,
        String author,
        Integer year,
        Integer copiesSoldInMillions,
        Double rating,
        Double costInEuros);
}
