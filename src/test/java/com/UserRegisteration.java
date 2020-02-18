package com;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisteration {
    @Test
    public void givenWelcomeMessage_whenProperShouldReturnTrue() {
        UserRegister validator = new UserRegister();
        boolean message = validator.welcomeMessage("Welcome to User Registeration Problem");
        Assert.assertTrue(message);
    }

    @Test
    public void givenWelcomeMessage_whenImpoperShouldReturnFalse() {
        UserRegister validator = new UserRegister();
        boolean message = validator.welcomeMessage("User Registeration Problem");
        Assert.assertFalse(message);
    }

    @Test
    public void givenFirstName_whenProperShouldReturnTrue() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateFirstName("Dhanashree");
        Assert.assertTrue(validName);
    }

    @Test
    public void givenFirstName_whenImproperShouldReturnFalse() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateFirstName("shree");
        Assert.assertFalse(validName);
    }

    @Test
    public void givenLastName_whenProperShouldReturnTrue() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateLastName("Bhide");
        Assert.assertTrue(validName);
    }

    @Test
    public void givenLastName_whenImproperShouldReturnFalse() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateLastName("Bh");
        Assert.assertFalse(validName);
    }

    @Test
    public void givenEmail_whenProperShouldReturnTrue() {
        UserRegister validEmail = new UserRegister();
        boolean email = validEmail.validateEmail("abcd@yahoo.com");
        Assert.assertTrue(email);
    }

    @Test
    public void givenEmail_whenImproperShouldReturnFalse() {
        UserRegister validEmail = new UserRegister();
        boolean email = validEmail.validateEmail("abc@.com");
        Assert.assertFalse(email);
    }

    @Test
    public void givenMobileNumber_whenProperShouldReturnTrue() {
        UserRegister validNumber = new UserRegister();
        boolean mobileNumber = validNumber.validateMobileNumber("91 1234567890");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenImproperShouldReturnFalse() {
        UserRegister validNumber = new UserRegister();
        boolean mobileNumber = validNumber.validateMobileNumber("1234567890");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenPassword_whenSatisfiesRule1ShouldReturnTrue() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePassword("abcd1234");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_whenDissatisfiesRule1ShouldReturnFalse() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePassword("gh12$");
        Assert.assertFalse(password);
    }

    @Test
    public void givenPassword_whenSatisfiesRule2ShouldReturnTrue() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule2("abCd1234");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_whenDissatisfiesRule2ShouldReturnFalse() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule2("ab12cd");
        Assert.assertFalse(password);
    }

    @Test
    public void givenPassword_whenSatisfiesRule3ShouldReturnTrue() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule3("abcdEf1g");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_whenDissatisfiesRule3ShouldReturnFalse() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule3("abcdEfhg");
        Assert.assertFalse(password);
    }
}
