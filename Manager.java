import java.util.*;

public class Manager extends Employee {
    ArrayList<Request<Job, Consumer>> requests;

    public Manager(Company company, double salary, Resume r, int id) {
        super(company, salary, r, id);
    }

    public void process(Job job) {
        TreeSet<User> posibili_angajati = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (int) (o2.getTotalScore() - o1.getTotalScore());
            }
        });
        for (Request r : requests) {
            if (r.getKey() == job && Application.getInstance().getUsers().contains((User) r.getValue1())) {
                posibili_angajati.add((User) r.getValue1());
            }
        }
        int iterator = 0;
        for (User u : posibili_angajati) {
            if (iterator < job.getNoPositions()) {
                Employee e = u.convert();
                Application.getInstance().remove(u);
                for (Department d : this.getCompany().getDepartment_list()) {
                    if (d.getAllJobList().contains(job)) {
                        d.add(e);
                    }
                }
            }
        }
    }
}
