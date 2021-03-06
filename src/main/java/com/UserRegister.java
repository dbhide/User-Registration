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

    public boolean validateMobileNumber(String mobile) {
        String numberRule = "^([0-9]{2}[ ]{1}[0-9]{10})$";
        if (mobile.matches(numberRule))
            return true;
        else
            return false;
    }

    public boolean validatePassword(String password) {
        String passwordRule = "^[a-zA-Z0-9]{8,}$";
        if (password.matches(passwordRule))
            return true;
        else
            return false;
    }

    public boolean validatePasswordRule2(String password) {
        String passwordRule = "^((?=.*[A-Z])[a-zA-Z0-9].{7,}$)";
        if (password.matches(passwordRule))
            return true;
        else
            return false;
    }

    public boolean validatePasswordRule3(String passsword) {
        String passwordRule = "^((?=.*[A-Z])(?=.*[0-9])[a-zA-Z].{7,}$)";
        if (passsword.matches(passwordRule))
            return true;
        else
            return false;
    }

    public boolean validatePasswordRule4(String password) {
        String passwordRule ="(?=.*[A-Z])(?=[^@|#|$|&|%]*[@|&|$|#|%][^@|#|$|&|%]*$)(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9@#$%]{7,}";
        if (password.matches(passwordRule))
            return true;
        else
            return false;
    }
}
