import java.util.LinkedList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String designation;
    double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee other) {
        int nameComparison = name.compareTo(other.name);
        // Sort by name first, then by salary if names are equal
        return nameComparison == 0 ? Double.compare(salary, other.salary) : nameComparison;
    }
}

public class SortEmployees {

    public static void sortByChoice(LinkedList<Employee> list, int choice) {
        if (choice == 1) {
            Collections.sort(list); // Sort by name and salary using Employee's compareTo
        } else if (choice == 2) {
            Collections.sort(list, new NameComparator()); // Sort by name only
        } else if (choice == 3) {
            Collections.sort(list, new SalaryComparator()); // Sort by salary only
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(101, "Alice", "Manager", 80000));
        employees.add(new Employee(102, "Bob", "Developer", 65000));
        employees.add(new Employee(103, "Charlie", "Tester", 50000));
        employees.add(new Employee(104, "Alice", "Sales", 70000)); // Duplicate name, lower salary

        System.out.println("Original list:");
        System.out.println(employees);

        int choice;
        do {
            System.out.println("\nSort by:");
            System.out.println("1. Name and Salary (Default)");
            System.out.println("2. Name Only");
            System.out.println("3. Salary Only");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = new java.util.Scanner(System.in).nextInt();

            if (choice > 0) {
                sortByChoice(employees, choice);
                System.out.println("\nSorted list:");
                System.out.println(employees);
            }
        } while (choice != 0);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.salary, o2.salary);
    }
}
