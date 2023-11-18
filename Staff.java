public class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String title, String department, double salary, int hireDate) {
        super(name, address, phoneNumber, emailAddress, department, salary, hireDate);
        this.title = title;
    }

    public String getTitle() {
        return title;

    }
   public void setTitle(String title) {
        this.title = title;
   }
    @Override
    public String toString() {
        return "\nStaff (\n" +
                " Name: " + getName() + '\n' +
                "Address: " + getAddress() + '\n' +
                "Phone Number: " + getPhoneNumber() + '\n' +
                "Email Address: " + getEmailAddress() + '\n' +
                "Salary: " + '$' +getSalary() + '\n' +
                "Hire Date: " + getHireDate()+ '\n' +
                "Title: " + getTitle() + ')';
    }
}

