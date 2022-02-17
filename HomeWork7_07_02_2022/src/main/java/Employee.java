public abstract class Employee implements Payment, Comparable<Employee> {
    protected String employeeID;
    protected String name;

    public Employee() {
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        return String.format("Employee ID: %s, Name: %s, Average Monthly Salary: %d", employeeID, name, calculatePay());
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(calculatePay(), employee.calculatePay());
    }
}
