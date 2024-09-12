package strings;

/*
 * This class contains snippets to create string literals, objects in Java.
 *
 * @author ggorantala
 */
public class StringPool {
    public static void main(String[] args) {
//        stringLiteral();
        stringConstructor();
    }

    static void stringLiteral() {
        String first = "Hello world";
        String second = "Hello world"; // `second` points to the same string object as `first`
        System.out.println(first == second); // true, both refer to the same object
    }

    static void stringConstructor() {
        String third = "Hello world";
        String fourth = new String("Hello world"); // fourth creates a new object in heap
        System.out.println(third == fourth); // false, different references
        System.out.println(third.equals(fourth)); // true, same objects
    }
}
