public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan
        Registration accountRegistration = new AccountRegistration();
        accountRegistration.registerAccount("JONG666", "Yohanes", "19473", "jong666@gmai.com", "JONG123");

        Registration googleRegistration = new GoogleRegistration();
        googleRegistration.registerAccount("", "", "", "pboa1@gmail.com", "");

        Registration facebookRegistration = new FacebookRegistration();
        facebookRegistration.registerAccount("", "", "", "", "");

        Registration appleRegistration = new AppleRegistration();
        appleRegistration.registerAccount("", "", "", "", "");
    }
}
