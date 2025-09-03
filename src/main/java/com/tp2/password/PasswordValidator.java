package com.tp2.password;

public class PasswordValidator {
    
    public static boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach
        int UL = 0;
        int LL = 0;
        int N = 0;
        int SC = 0;
        if (password.length() < 8){
            return false;
        }
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (c >= 65 && c <= 90){
                UL = 1;
            }
            else if (c >= 97 && c <= 122){
                LL = 1;
            }
            else if (c >= 48 && c <= 57){
                N = 1;
            }
            else if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96)) {
                SC = 1;
            }
        }
        return UL == 1 && LL == 1 && N == 1 && SC == 1;
        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)a
    }
}
