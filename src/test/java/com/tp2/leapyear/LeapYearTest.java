package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest{
    // TODO: Replace these lines with your tests
    @Test
    void NDivisible4(){
        assertFalse(LeapYear.isleapYear(2001));
    }
    @Test
    void NDivisible100(){
        assertFalse(LeapYear.isleapYear(1900));
    }
    @Test
    void Divisible4(){
        assertTrue(LeapYear.isleapYear(2004));
    }
    @Test
    void Divisible400(){
        assertTrue(LeapYear.isleapYear(2000));
    }

//    Missing tests:
//a
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
