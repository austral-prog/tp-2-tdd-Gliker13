package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    // TODO: Replace these lines with your tests
    @Test
    void Simples(){
        assertEquals("I",RomanNumerals.convert(1));
        assertEquals("V",RomanNumerals.convert(5));
        assertEquals("XC",RomanNumerals.convert(90));
    }
    @Test
    void LXXVIII(){
        assertEquals("LXXVIII",RomanNumerals.convert(78));
    }
    @Test
    void MCMI(){
        assertEquals("MCMI",RomanNumerals.convert(1901));
    }
    @Test
    void MM(){
        assertEquals("MM",RomanNumerals.convert(2000));
    }
    @Test
    void MMMCMXCIX(){
        assertEquals("MMMCMXCIX",RomanNumerals.convert(3999));
    }

//    Missing tests:a
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
