package dev.ggorantala.strings.format;

import java.text.DecimalFormat;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class FormattingToThousandsSeparator {
    public static void main(String[] args) {

        double number = 1234567.89;

        // Define a pattern to format with commas and two decimal places
        DecimalFormat df = new DecimalFormat("#,###.00");
        String formattedNumber = df.format(number);

        System.out.println(formattedNumber);  // Outputs: "1,234,567.89"
    }
}
