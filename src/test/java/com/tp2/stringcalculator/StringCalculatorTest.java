package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {
    @Test
    void Empty(){
        assertEquals(0,StringCalculator.add(""));
    }
    @Test
    void Single(){
        assertEquals(5,StringCalculator.add("5"));
        assertEquals(9,StringCalculator.add("9"));
    }
    @Test
    void TwoNumbers(){
        assertEquals(3,StringCalculator.add("1,2"));
        assertEquals(10,StringCalculator.add("4,6"));
    }
    @Test
    void MoreNumbers(){
        assertEquals(23,StringCalculator.add("4,6,9,2,2"));
        assertEquals(30,StringCalculator.add("5,5,3,3,3,1,8,2"));
    }
    @Test
    void newline(){
        assertEquals(6,StringCalculator.add("1\n2,3"));
        assertEquals(10,StringCalculator.add("1\n2\n3,\n\n4"));
    }
    @Test
    void Negatives(){
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1"));
    }

//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
