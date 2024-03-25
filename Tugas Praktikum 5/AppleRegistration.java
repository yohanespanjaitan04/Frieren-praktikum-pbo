class AppleRegistration implements Registration {
    @Override
    public void registerAccount(String username, String name, String phone_number, String email, String password) {
        System.out.println("Registrasi melalui Apple berhasil!");
    }
}
