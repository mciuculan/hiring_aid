import java.util.*;

public class Management extends Department{
    public Management(ArrayList<Employee> e, ArrayList<Job> j, String name) {
        super(e, j, name);
    }

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
