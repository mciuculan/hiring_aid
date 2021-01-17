import java.util.*;

public class Manager extends Employee {
    List<Request<Job, Consumer>> requests;
    public Manager(Company company, double salary, Resume r, int id) {
        super(company, salary, r, id);
    }
    //todo
    public void process(Job job) {
        TreeSet<User> posibili_angajati = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (int) (o2.getTotalScore() - o1.getTotalScore());
            }
        });
        for (Request r : requests) {
            if (r.getKey() == job) {
                posibili_angajati.add((User) r.getValue1());
            }
        }
        int iterator = 0;
        for (User u : posibili_angajati) {
            if (iterator < job.getNoPositions()) {

            }
        }
    }
}
