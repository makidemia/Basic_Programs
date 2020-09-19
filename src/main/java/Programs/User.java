package Programs;

import java.util.HashMap;

public class User {
    String firstName;

    String lastName;

    String email;

    String address;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {

        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+email;
    }
}
