import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Finance extends Department{
    public Finance(List<Employee> e, List<Job> j, String name) {
        super(e, j, name);
    }

    @Override
    public double getTotalSalaryBudget() {
        ArrayList<Employee> employees = getEmployees();
        double budget = 0.0;
        for (Employee e : employees) {
            int experience_years = 0;
            TreeSet<Experience> exp = e.getResume().getExperience();
            for (Experience ex : exp) {
                Period p = Period.between(ex.getFinishing_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        ex.getStarting_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                experience_years += p.getYears();
            }
            if (experience_years < 1)
                budget += e.getSalary() - 0.1 * e.getSalary();
            else
                budget += e.getSalary() - 0.16 * e.getSalary();
        }
        return budget;
    }
}
