package dev.ggorantala.strings.performance;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class ThreadSafety {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Initial");

        Runnable task = () -> {
            sb.append(" Appended");
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sb);  // Outputs: "Initial Appended Appended"
    }
}
