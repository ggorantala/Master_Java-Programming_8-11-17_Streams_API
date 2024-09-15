package dev.ggorantala.streamsapi.streamsapi.functionalprogramming.functions.impure;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class NetworkIOFunctions {
    public static void main(String[] args) throws IOException {
        networkOperations();
    }

    public static void networkOperations() throws IOException {
        Socket socket = new Socket("www.example.com", 80);
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        Integer bytesRead = in.read(data);
        socket.close();
    }
}
