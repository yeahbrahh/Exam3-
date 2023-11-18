public class Faculty extends Employee {

    String officeHours;
    String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double salary, int hireDate, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

        public String getOfficeHours () {
            return officeHours;
        }

        public void setOfficeHours (String officeHours){
            this.officeHours = officeHours;
        }

        public String getRank () {
            return rank;
        }

        public void setRank (String rank){
            this.rank = rank;
        }
        @Override
        public String toString () {
            return "\nFaculty (\n" +
                    " Name: " + getName() + '\n' +
                    "Address: " + getAddress() + '\n' +
                    "Phone Number: " + getPhoneNumber() + '\n' +
                    "Email Address: " + getEmailAddress() + '\n' +
                    "Department " + getDepartment() + '\n' +
                    "Salary: " + '$' + getSalary() + '\n' +
                    "Hire Date: " + getHireDate() + '\n' +
                    "Office Hours: " + getOfficeHours() + '\n' +
                    "Rank: " + getRank() + ')';
        }
    }