package dev.ggorantala.streamsapi.streamsapi.methodreferences.kinds;
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

import java.util.List;

public class RefToInstance {
    public static void main(String[] args) {
        List<Book> books = Book.BOOKS;

        // Reference to instance
        RefToInstance referenceToInstance = new RefToInstance();

        System.out.println("SORT BASED ON PRICE");
        books.sort(referenceToInstance::compareByCost);
        books.stream()
            .map(book -> book.title() + ": " + book.costInEuros())
            .forEach(System.out::println);

        System.out.println();

        System.out.println("SORT BASED ON TITLES: ");
        books.sort(referenceToInstance::compareByTitle);
        books.stream().map(book -> book.title() + ": " + book.rating()).forEach(System.out::println);
    }

    public int compareByTitle(Book first, Book second) {
        return first.title().compareTo(second.title());
    }

    public int compareByCost(Book first, Book second) {
        return first.costInEuros().compareTo(second.costInEuros());
    }
}
