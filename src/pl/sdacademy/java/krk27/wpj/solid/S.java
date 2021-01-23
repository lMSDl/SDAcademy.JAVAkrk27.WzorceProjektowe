package pl.sdacademy.java.krk27.wpj.solid;

public class S {

    public class User {
        String username;
        String password;
        String email;
    }

    class Validators {

        public boolean validateEmail(String email)
        {
            try {
                return email.split("@")[1].split(".").length >= 2;
            }
            catch(Exception e) {
                return false;
            }
        }
    }
}
