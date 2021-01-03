import java.util.ArrayList;

public class IT extends Department{
    @Override
    public double getTotalSalaryBudget() {
        ArrayList<Employee> employees = getEmployees();
        double budget = 0.0;
        for (Employee e : employees) {
            budget += e.getSalary();
        }
        return budget;
    }
}
