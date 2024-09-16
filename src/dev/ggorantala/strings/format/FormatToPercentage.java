package dev.ggorantala.strings.format;

import java.text.NumberFormat;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class FormatToPercentage {
    public static void main(String[] args) {
        double fraction = 0.75;

        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String formattedPercent = percentFormatter.format(fraction);

        System.out.println(formattedPercent);  // Outputs: "75%"
    }
}
