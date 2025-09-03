package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    // TODO: Replace these lines with your tests
    @Test
    void isValid() {
        assertTrue(PasswordValidator.isValid("Jorge2<<1!"));
        assertFalse(PasswordValidator.isValid("9012930941234123"));
        assertFalse(PasswordValidator.isValid("jorge1293!"));
        assertFalse(PasswordValidator.isValid("JORGE123!"));
        assertTrue(PasswordValidator.isValid("JorEEe2<<1!"));
    }

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalida
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
