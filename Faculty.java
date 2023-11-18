public class Faculty extends Employee {

    String officeHours;
    String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress);
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                ", hireDate=" + getHireDate() +
                ", officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}