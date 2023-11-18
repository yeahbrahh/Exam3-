public abstract class Employee extends Person {

    private String department;
    private double salary;
    private int hireDate;

    public Employee(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
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
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

}

