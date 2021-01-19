public class Employee extends Consumer{
    private Company company;
    private double salary;

    public Employee(Company company, double salary, Resume r, int id) {
        super(r, id);
        this.company = company;
        this.salary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Consumer o) {
        if (this.getResume().getInformation().getSur_name().compareTo(o.getResume().getInformation().getSur_name()) == 0)
            return 1;
        return 0;
    }
}
