package Block_1_2;

public class Name {
    String lastName;   // Фамилия
    String firstName;  // Имя
    String middleName; // Отчество

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName != null ? lastName : "";
        this.firstName = firstName != null ? firstName : "";
        this.middleName = middleName != null ? middleName : "";
    }

    Name(String lastName, String firstName) {
        this(lastName, firstName, "");
    }

    Name(String singleName) {
        this("", singleName, "");
    }

    boolean hasLastName() {
        return !lastName.isEmpty();
    }

    boolean hasFirstName() {
        return !firstName.isEmpty();
    }

    boolean hasMiddleName() {
        return !middleName.isEmpty();
    }
}
