package com;

public class UserRegister {
    public boolean welcomeMessage(String welcomeMessage) {
        if (welcomeMessage.contains("Welcome"))
            return true;
        else
            return false;
    }
    private String nameRule="^[A-Z]{1}[a-z]{2,}$";
    public boolean validateFirstName(String firstName) {
        if (firstName.matches(nameRule))
            return true;
        else
            return false;
    }
}
