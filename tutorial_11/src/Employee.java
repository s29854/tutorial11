public class Employee extends User {
    private static int employeesCount=0;
    private String employeeId;
    private Employee(String name, String lastName) {
        super(name, lastName);
        this.employeeId = "E#"+employeesCount++;

    }
}

