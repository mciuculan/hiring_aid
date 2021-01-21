import java.util.*;

public class Company implements Comparable<Company> {
    private String name;
    private Manager manager;
    private ArrayList<Department> department_list;
    private ArrayList<Recruiter> recruiters;

    public Company(String name, Manager manager, ArrayList<Department> department_list, ArrayList<Recruiter> recruiters) {
        this.name = name;
        this.manager = manager;
        this.department_list = department_list;
        this.recruiters = recruiters;
    }

    public ArrayList<Department> getDepartment_list() {
        return department_list;
    }

    public ArrayList<Recruiter> getRecruiters() {
        return recruiters;
    }

    public Manager getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public void setDepartment_list(ArrayList<Department> department_list) {
        this.department_list = department_list;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecruiters(ArrayList<Recruiter> recruiters) {
        this.recruiters = recruiters;
    }

    public void add(Department department) {
        this.department_list.add(department);
    }

    public void add(Recruiter recruiter) {
        this.recruiters.add(recruiter);
        for (Department d : this.getDepartment_list()) {
            if (d.getName().compareTo("IT") == 0) {
                d.add(recruiter);
            }
        }
    }

    public void add(Employee employee, Department depatment) {
        depatment.add(employee);
    }

    public void remove(Employee employee) {
        for (Department d : this.department_list) {
            for (Employee e : d.getEmployees()) {
                if (e.getResume().getInformation().equals(employee.getResume().getInformation())) {
                    d.remove(employee);
                    break;
                }
            }
        }
    }

    public void remove(Department department) {
        this.department_list.remove(department);
    }

    public void remove(Recruiter recruiter) {
        this.recruiters.remove(recruiter);
    }

    public void move(Department source, Department destination) {
        for (Employee e : source.getEmployees()) {
            destination.add(e);
            source.remove(e);
        }
        for (Job j : source.getAllJobList()) {
            destination.add(j);
            source.getAllJobList().remove(j);
        }
        source = null;
    }

    public void move(Employee employee, Department newDepartment){
        for (Department d : this.department_list) {
            for (Employee e : d.getEmployees()) {
                if (e.getResume().getInformation().equals(employee.getResume().getInformation())) {
                    d.remove(employee);
                    newDepartment.add(employee);
                    break;
                }
            }
        }
    }

    public boolean contains(Department department) {
        return this.department_list.contains(department);
    }

    public boolean contains(Employee employee) {
        for (Department d : this.department_list) {
            for (Employee e : d.getEmployees()) {
                if (e.getResume().getInformation().equals(employee.getResume().getInformation())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contains(Recruiter recruiter) {
        return this.recruiters.contains(recruiter);
    }

    @Override
    public int compareTo(Company o) {
        if (this.name.compareTo(o.name) == 0)
            return 0;
        return 1;
    }

    public Recruiter getRecruiter(User user) {
        return Application.getInstance().getUsersGraph().getSuitableRecruiter(user);
    }

    public ArrayList<Job> getJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        for (Department d : this.department_list) {
            jobs.addAll(d.getJobs());
        }
        return jobs;
    }
}
