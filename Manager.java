import java.util.*;

public class Manager extends Employee {
    List<Request<Job, Consumer>> requests;
    public Manager(Company company, double salary) {
        super(company, salary);
    }
    //todo
    public void process(Job job) {
        TreeSet<User> posibili_angajati_crescator = new TreeSet<>();
        for (Request r : requests) {
            if (r.getKey() == job) {
                //posibili_angajati_crescator.add(r.getValue1());

            }
        }
        TreeSet<User> posibili_angajati = (TreeSet<User>) posibili_angajati_crescator.descendingSet();
    }
}
