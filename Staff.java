public class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String title) {
        super(name, address, phoneNumber, emailAddress);
    }

    public String getTitle() {
        return title;

    }
   public void setTitle(String title) {
        this.title = title;
   }
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

