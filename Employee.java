public abstract class Employee extends Person {

    public String department;
    public double salary;
    public int hireDate;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double salary, int hireDate) {
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
        return "Employee " +
                " Name: " + getName() + '\n' +
                "Address: " + getAddress() + '\n' +
                " Phone Number: " + getPhoneNumber() + '\n' +
                " Email Address :" + getEmailAddress() + '\n' +
                " Department: " + getDepartment() + '\n' +
                "Salary: " + getSalary() +
                "Hire Date: " + getHireDate();
    }

}

