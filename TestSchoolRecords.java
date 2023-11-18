import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

    public static void main(String[] args) {
        // Create an ArrayList of Persons
        List<Person> persons = new ArrayList<>();

        // Create two Student objects
        Student student1 = new Student("Kodak Black", "123 Main St", "555-1234", "broccoli@website.com", "Freshman");
        Student student2 = new Student("Kevin Gates", "456 Oak St", "555-5678", "idgt@website.com", "Sophomore");

        // Create two Faculty objects
        Faculty faculty1 = new Faculty("Dr. Who", "789 Pine St", "555-9876", "whoyou@frcc.com", "2 to 4", "Junior");
        Faculty faculty2 = new Faculty("Professor Longhair", "234 Elm St", "555-4321", "tipitina@frcc.com", "4 to 6", "Senior");

        // Create two Staff objects
        Staff staff1 = new Staff("Alice Cooper", "789 Pine St", "555-1111", "alice@gmail.com", "Secretary");
        Staff staff2 = new Staff("Steve Miller", "234 Elm St", "555-2222", "joker@gmail.com", "Bossman");

        // Add persons to the list
        persons.add(student1);
        persons.add(student2);
        persons.add(faculty1);
        persons.add(faculty2);
        persons.add(staff1);
        persons.add(staff2);

        // Traverse the list using a foreach loop and print details using toString method
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        // Test the function to filter employees
        List<Employee> employees = filterEmployees(persons);
        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    // Function to filter employees from a list of persons
    public static List<Employee> filterEmployees(List<Person> persons) {
        List<Employee> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add((Employee) person);
            }
        }
        return employees;
    }
}