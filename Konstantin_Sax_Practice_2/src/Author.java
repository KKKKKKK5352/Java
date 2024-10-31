class Author {
    private String name, email;
    private char gender;

    Author(String newName, String newEmail, char newGender) {
        name = newName;
        email = newEmail;
        gender = newGender;
    }

    void setEmail(String newEmail) {
        email = newEmail;
    }

    String getEmail() {
        return email;
    }

    String getName() {
        return name;
    }

    char getGender() {
        return gender;
    }

    String getString() {
        return name + " (" + gender + ") at " + email;
    }
}