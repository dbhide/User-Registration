package com;

public class UserRegister {
    public boolean welcomeMessage(String welcomeMessage) {
        if (welcomeMessage.contains("Welcome"))
            return true;
        else
            return false;
    }
}
