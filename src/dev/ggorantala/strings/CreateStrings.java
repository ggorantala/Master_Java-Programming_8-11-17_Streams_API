package dev.ggorantala.strings;

/*
 * This class contains snippets to create strings in Java.
 *
 * @author ggorantala
 */
public class CreateStrings {
    public static void main(String[] args) {
        // using string literal
        String greeting = "Hello, world!";

        // using constructor
        String name = "John Doe";

        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}; // char array
        String newGreeting = new String(charArray); // Hello world!

    }
}
