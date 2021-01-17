import java.util.*;

public abstract class Department {
    private List<Employee> employeeList;
    private List<Job> jobs;

    public Department(List<Employee> e, List<Job> j) {
        this.employeeList = e;
        this.jobs = j;
    }
    public List<Job> getAllJobList() {
        return jobs;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        for (Job j : this.jobs) {
            if (j.getOpen() == true)
                jobs.add(j);
        }
        return jobs;
    }
    public void add(Employee employee) {
        this.employeeList.add(employee);
    }

    public void remove(Employee employee) {
        this.employeeList.remove(employee);
    }

    public void add(Job job) {
        this.jobs.add(job);
    }

    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Employee e : this.employeeList) {
            employees.add(e);
        }
        return employees;
    }
}
