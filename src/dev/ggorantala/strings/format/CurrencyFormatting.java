package dev.ggorantala.strings.format;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * This code is part of the course "Master Java 8(11/17), along with Functional Programming With Lambdas And Streams API"
 * find this course on https://www.ggorantala.dev/all-courses/ page.
 *
 * Copyright © 2024 by Gopi Gorantala, MIT License.
 *
 * @author Gopi Gorantala
 * Date: 16/09/24
 */
public class CurrencyFormatting {
    public static void main(String[] args) {

        double price = 1234567.89;

        // Get the currency instance for the US locale
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedPrice = currencyFormatter.format(price);

        System.out.println(formattedPrice);  // Outputs: "$1,234,567.89"
    }
}
