import courseWork.Employee;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Райан Гиггз", 1, 22500.00);
        employees[1] = new Employee("Бобби Чарльтон", 2, 47500.15);
        employees[2] = new Employee("Джордж Бест", 3, 40500.50);
        employees[3] = new Employee("Эрик Кантона", 4, 35000.35);
        employees[4] = new Employee("Петер Шмейхель", 5, 31250.42);
        employees[5] = new Employee("Уэйн Руни", 4, 38460.48);
        employees[6] = new Employee("Криштиану Роналду", 1, 41155.58);
        employees[7] = new Employee("Рууд Ван Нистелрой", 2, 39522.15);
        employees[8] = new Employee("Дэвид Бэкхем", 3, 39845.15);
        employees[9] = new Employee("Пол Скоулз", 4, 28950.00);
        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalaries());
        System.out.println("Сотрудника с минимальной зарплатой: " + searchEmployeeMinSalary());
        System.out.println("Сотрудника с максимальной зарплатой: " + searchEmployeeMaxSalary());
        System.out.println("Среднее значение зарплат: " +printsAverageSalary());
        printName();


    }

    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                System.out.println(employees[i].toSting());
            }
        }
    }

    public static double sumSalaries() {
        double totalSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                totalSum += employees[i].getSalary();
            }
        }
        return totalSum;
    }

    public static String searchEmployeeMinSalary() {
        Employee result = null;
        double minSalary = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result.toSting();
    }

    public static String searchEmployeeMaxSalary() {
        Employee result = null;
        double maxSalary = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result.toSting();
    }

    public static double printsAverageSalary() {
        int countsNumberEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                countsNumberEmployees++;
            }
        }
        return sumSalaries() / countsNumberEmployees;
    }

    public static void printName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                System.out.println(employees[i].getFulName());
            }
        }
    }
}