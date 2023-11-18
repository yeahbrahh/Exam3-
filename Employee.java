public abstract class Employee extends Person {

    private String department;
    private double salary;
    private int hireDate;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double salary, int hireDate) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String emailAddress) {
        this.department = emailAddress;

    }

    public double getSalary() {
        return salary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;


    }

    public String dateFormat() {
        return hireDate + "%02d/%02d/%02d";
    }

    @Override
    public String toString() {
        return "\nEmployee ( \n" +
                " Name: " + getName() + '\n' +
                "Address: " + getAddress() + '\n' +
                " Phone Number: " + getPhoneNumber() + '\n' +
                " Email Address :" + getEmailAddress() + '\n' +
                " Department: " + getDepartment() + '\n' +
                "Salary: " + '$' + getSalary() +
                "Hire Date: " + dateFormat() + ')';
    }

}

