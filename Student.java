public class Student extends Person {
    private String status;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
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
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


