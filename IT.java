import java.util.ArrayList;
import java.util.List;

public class IT extends Department{

    public IT(List<Employee> e, List<Job> j, String name) {
        super(e, j, name);
    }

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
