import java.util.*;

public class Application {
    private ArrayList<Company> companies;
    private TreeSet<User> users;
    public ArrayList<Company> getCompanies() {
        return companies;
    }
    public Company getCompany(String name) {
        for (Company c : companies) {
            if (c.getName().compareTo(name) == 0)
                return c;
        }
        return null;
    }
    public void add(Company company) {
        companies.add(company);
    }
    public void add(User user) {
        users.add(user);
    }
    public boolean remove(Company company) {
        if (companies.contains(company) == true) {
            companies.remove(company);
            return true;
        }
        return false;
    }
    public boolean remove(User user) {
        if (users.contains(user) == true) {
            users.remove(user);
            return true;
        }
        return false;
    }
    public ArrayList<Job> getJobs(List<String> companies) {
        ArrayList<Job> availableJobs = new ArrayList<>();
        for (String preference : companies) {
            Company company = getCompany(preference);
            if (company == null)
                System.out.println("Nu exista compania " + preference);
            else {
                availableJobs.addAll(company.getJobs());
            }
        }
        return availableJobs;
    }
}
