import java.util.*;

public abstract class Department {
    private ArrayList<Employee> employeeList;
    private ArrayList<Job> jobs;
    private String name;

    public Department(ArrayList<Employee> e, ArrayList<Job> j, String name) {
        this.employeeList = e;
        this.jobs = j;
        this.name = name;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setJobs(ArrayList<Job> jobs) {
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

    public ArrayList<Job> getAllJobList() {
        return jobs;
    }
}
