public class Email {
    public static boolean isValid(String email) {
        return email.matches("^[a-zA-Z0-9_%+-.]+@[a-zA-Z]+\\.[a-zA-Z]+$");
    }
}
