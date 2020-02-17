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
}
