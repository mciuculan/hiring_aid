import java.util.*;

public class Marketing extends Department{
    public Marketing(List<Employee> e, List<Job> j, String name) {
        super(e, j, name);
    }

    @Override
    public double getTotalSalaryBudget() {
        ArrayList<Employee> employees = getEmployees();
        double budget = 0.0;
        for (Employee e : employees) {
            if (e.getSalary() > 5000)
                budget += e.getSalary() - 0.1 * e.getSalary();
            else if (e.getSalary() < 3000)
                budget += e.getSalary();
            else
                budget += e.getSalary() - 0.16 * e.getSalary();
        }
        return budget;
    }
}
