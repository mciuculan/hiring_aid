import java.util.*;

public abstract class Department {
    private List<Employee> employeeList;
    private List<Job> jobs;
    private String name;

    public Department(List<Employee> e, List<Job> j, String name) {
        this.employeeList = e;
        this.jobs = j;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        for (Job j : this.jobs) {
            if (j.getOpen())
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
        return new ArrayList<>(this.employeeList);
    }
}
