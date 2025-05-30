public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;
    private long phoneNo;

    public Employee(String name, int id, double salary, String department, long phoneNo) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.phoneNo = phoneNo;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Phone No: " + phoneNo);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 50000.0, "Engineering", 7996993803L);
        emp.display();
    }
}
