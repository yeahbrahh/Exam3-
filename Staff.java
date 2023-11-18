public class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String title, String department, double salary, int hireDate) {
        super(name, address, phoneNumber, emailAddress, department, salary, hireDate);
    }

    public String getTitle() {
        return title;

    }
   public void setTitle(String title) {
        this.title = title;
   }
    @Override
    public String toString() {
        return "Staff\n" +
                " Name: " + getName() + '\n' +
                "Address: " + getAddress() + '\n' +
                "Phone Number: " + getPhoneNumber() + '\n' +
                "Email Address: " + getEmailAddress() + '\n' +
                "Salary: " + getSalary() +
                "Hire Date: " + getHireDate()+ '\n' +
                "Title: " + getTitle();
    }
}

