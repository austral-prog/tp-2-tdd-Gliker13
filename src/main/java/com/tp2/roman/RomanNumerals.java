package com.tp2.roman;

public class RomanNumerals {
    
    public static String convert(int number) {
        // TODO: Implement roman numeral conversion following TDD approach
        int[] numbers =   {1,  4,   5,   9,  10, 40,  50,  90,  100,400,500,900,1000};
        String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String result = "";
        for(int i=12;i>=0;i--){
            if (numbers[i] <= number){
                number -= numbers[i];
                result += romans[i];
                i = 13;
            }
        }
        return result;
        //I = 1
        //V = 5
        //X = 10
        //L = 50
        //C = 100
        //D = 500
        //M = 1000
        // Then handle subtraction cases: 4=IV, 9=IX
        // Build up to complex numbers like 1994=MCMXCIVa
    }
}
