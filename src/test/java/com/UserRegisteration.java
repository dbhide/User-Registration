package com;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisteration {
    @Test
    public void givenWelcomeMessage_whenProperShouldReturnTrue() {
        UserRegister validator = new UserRegister();
        boolean message = validator.welcomeMessage("Welcome to User Registeration Problem");
        Assert.assertEquals(true, message);
    }

    @Test
    public void givenWelcomeMessage_whenImpoperShouldReturnFalse() {
        UserRegister validator = new UserRegister();
        boolean message = validator.welcomeMessage("User Registeration Problem");
        Assert.assertEquals(false, message);
    }

    @Test
    public void givenFirstName_whenProperShouldReturnTrue() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateFirstName("Dhanashree");
        Assert.assertEquals(true, validName);
    }

    @Test
    public void givenFirstName_whenImproperShouldReturnFalse() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateFirstName("shree");
        Assert.assertEquals(false, validName);
    }

    @Test
    public void givenLastName_whenProperShouldReturnTrue() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateLastName("Bhide");
        Assert.assertEquals(true, validName);
    }

    @Test
    public void givenLastName_whenImproperShouldReturnFalse() {
        UserRegister validname = new UserRegister();
        boolean validName = validname.validateLastName("Bh");
        Assert.assertEquals(false, validName);
    }

    @Test
    public void givenEmail_whenProperShouldReturnTrue() {
        UserRegister validEmail = new UserRegister();
        boolean email = validEmail.validateEmail("abcd@yahoo.com");
        Assert.assertEquals(true, email);
    }

    @Test
    public void givenEmail_whenImproperShouldReturnFalse() {
        UserRegister validEmail = new UserRegister();
        boolean email = validEmail.validateEmail("abc@.com");
        Assert.assertEquals(false, email);
    }

    @Test
    public void givenMobileNumber_whenProperShouldReturnTrue() {
        UserRegister validNumber = new UserRegister();
        boolean mobileNumber = validNumber.validateMobileNumber("91 1234567890");
        Assert.assertEquals(true, mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenImproperShouldReturnFalse() {
        UserRegister validNumber = new UserRegister();
        boolean mobileNumber = validNumber.validateMobileNumber("1234567890");
        Assert.assertEquals(false, mobileNumber);
    }

    @Test
    public void givenPassword_whenSatisfiesRule1ShouldReturnTrue() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePassword("abcd1234");
        Assert.assertEquals(true, password);
    }

    @Test
    public void givenPassword_whenDissatisfiesRule1ShouldReturnFalse() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePassword("gh12$");
        Assert.assertEquals(false, password);
    }

    @Test
    public void givenPassword_whenSatisfiesRule2ShouldReturnTrue() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule2("abCd1234");
        Assert.assertEquals(true, password);
    }

    @Test
    public void givenPassword_whenDissatisfiesRule2ShouldReturnFalse() {
        UserRegister validPassword = new UserRegister();
        boolean password = validPassword.validatePasswordRule2("ab12cd");
        Assert.assertEquals(false, password);
    }
}
