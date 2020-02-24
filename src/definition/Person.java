package definition;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private MyLinked<String> ContactNumber;


    public Person(String firstName, String lastName, String email, MyLinked<String> contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        ContactNumber = contactNumber;
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

    public String getContactNumber() {
        StringBuilder contacts = new StringBuilder();
        boolean p = false;
        for (int i = 0; i < ContactNumber.size; i++) {
            if (i == 0) {
                contacts.append(ContactNumber.getData(i));
            } else {
                contacts.append(" , ").append(ContactNumber.getData(i));
            }
        }
        if (ContactNumber.size == 0) {
            contacts.append("null");

        } else if (ContactNumber.size == 1) {
            p = true;
        }
        return p ? "Contact Number: " + contacts : "Contact Number(s): " + contacts;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + getContactNumber() + "\n" + "Email: " + getEmail()
                + "\n" + "-------- * -------- * -------- * --------\n" + "-------- * -------- * -------- * --------";
    }

}
