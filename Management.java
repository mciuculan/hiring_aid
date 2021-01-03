import java.util.*;

public class Management extends Department{
    @Override
    public double getTotalSalaryBudget() {
        ArrayList<Employee> employees = getEmployees();
        double budget = 0.0;
        for (Employee e : employees) {
            budget += e.getSalary() - 0.16 * e.getSalary();
        }
        return budget;
    }
}
