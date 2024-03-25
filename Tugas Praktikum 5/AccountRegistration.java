import java.util.regex.*;

interface Registration {
    void registerAccount(String username, String name, String phone_number, String email, String password);
}

abstract class RegistrationValidator {
    protected boolean validateUsername(String username) {
        return !username.isEmpty();
    }

    protected boolean validateName(String name) {
        return name.matches("^[a-zA-Z ]+$");
    }

    protected boolean validatePhoneNumber(String phone_number) {
        return phone_number.matches("^[0-9]+$");
    }

    protected boolean validateEmail(String email) {
        return !email.isEmpty();
    }

    protected boolean validatePassword(String password) {
        return password.length() >= 8;
    }
}

class AccountRegistration extends RegistrationValidator implements Registration {
    @Override
    public void registerAccount(String username, String name, String phone_number, String email, String password) {
        if (!username.isEmpty() && !name.isEmpty() && !phone_number.isEmpty() && !email.isEmpty() && !password.isEmpty() &&
            validateUsername(username) && validateName(name) && validatePhoneNumber(phone_number) && validateEmail(email) && validatePassword(password)) {
            System.out.println("Registrasi akun berhasil!");
        } else {
            System.out.println("Registrasi akun gagal! Mohon periksa kembali kolom isian.");
        }
    }
}
