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

    public boolean validateLastName(String lastName) {
        if (lastName.matches(nameRule))
            return true;
        else
            return false;
    }

    public boolean validateEmail(String mail) {
        String emailRule="^\\w{3,}([-._+]\\w+)?@\\w+.[a-z]{2,4}([.][a-z]{2,4})?$";
        if (mail.matches(emailRule))
            return true;
        else
            return false;
    }
}
