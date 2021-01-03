public class Employee extends Consumer{
    private Company company;
    private double salary;

    public Employee(Company company, double salary) {
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
}
