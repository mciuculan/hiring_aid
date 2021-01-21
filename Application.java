import java.util.*;

public class Application {
    private ArrayList<Company> companies;
    private TreeMap<User, Integer> users;
    private int no_users = 0;
    private Graph usersGraph = Graph.getInstance();

    private static Application single_instance = null;

    private Application() { }

    public static Application getInstance() {
        if (single_instance == null)
            single_instance = new Application();
        return single_instance;
    }

    public int getNo_users() {
        return no_users;
    }

    public TreeMap<User, Integer> getUsers() {
        return users;
    }

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

    public Graph getUsersGraph() {
        return usersGraph;
    }

    public void add(Company company) {
        companies.add(company);
    }
    public void add(User user) {
        users.put(user, no_users);
        user.setUnique_id(no_users);
        no_users += 1;
    }
    public boolean remove(Company company) {
        if (companies.contains(company)) {
            companies.remove(company);
            return true;
        }
        return false;
    }
    public boolean remove(User user) {
        for (Map.Entry<User, Integer> iterator : users.entrySet()) {
            User u = (User) iterator.getKey();
            if (u.getResume().getInformation().getSur_name().compareTo(user.getResume().getInformation().getSur_name()) == 0) {
                users.remove(user);
                no_users--;
                return true;
            }
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
