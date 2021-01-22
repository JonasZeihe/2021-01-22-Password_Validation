public class PasswordValidationApp {

    public static void main(String[] args) {
        if (longenough() = true){
            System.out.println("Password is long enough");
        } else {
            System.out.println("Password too short");
        }
    }

    public static boolean longenough(int minLength, String password){
/*        password = "asdasdasd";
        minLength = 5;*/
        if (password.length() >= minLength){
           return true;
        } else {
            return false;
        }
        }
}


/*
public class passwordvalidation {
    public static void main(String[] args) {
        String passwd = "aaZZa44@";
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        System.out.println(passwd.matches(pattern));
    }
}*/
