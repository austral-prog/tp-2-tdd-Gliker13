package com.tp2.stringcalculator;

import java.util.Objects;
//a
public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        // split on comma or newline
        String[] parts = numbers.split("[,\n]");

        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                int value = Integer.parseInt(part);

                if (value < 0) {
                    throw new IllegalArgumentException("Negatives not allowed: " + value);
                }

                sum += value;
            }
        }
        return sum;
    }
}

