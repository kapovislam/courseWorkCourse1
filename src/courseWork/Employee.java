package courseWork;

public class Employee {
    private String fulName;
    private int department;
    private double salary;
    private int id;

    private static int counter = 1;

    public Employee(String fulName, int department, double salary) {
        this.fulName = fulName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFulName() {
        return fulName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toSting() {
        return String.format("%d. %s. Номер отдела - %d. Заработная плата - %.2f", id, fulName, department, salary);
    }
}
