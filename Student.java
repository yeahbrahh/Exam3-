public class Student extends Person {
    private String status;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    // Getter and Setter methods for Status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "\nStudent (\n" +
                " Name: " + getName()+ '\n' +
                "Address: " + getAddress() + '\n' +
                "Phone Number: " + getPhoneNumber() + '\n' +
                "Email Address: " + getEmailAddress() + '\n' +
                "Status: " + getStatus() + ')';
    }
}


