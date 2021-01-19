import java.util.*;

public class Job {
    private String companyName;
    private boolean open = true; // daca jobul este deschis sau nu
    private Constraint<Integer> graduation_year;
    private Constraint<Integer> experience;
    private Constraint<Double> grade;
    private List<User> candidates;
    private int noPositions;
    private double salary;
    public Job(String Company, int noPositions, double salary, Constraint<Integer> graduation_year, Constraint<Integer> experience, Constraint<Double> grade) {
        this.companyName = Company;
        this.noPositions = noPositions;
        this.salary = salary;
        this.grade = grade;
        this.graduation_year = graduation_year;
        this.experience = experience;
    }

    public void setExperience(Constraint<Integer> experience) {
        this.experience = experience;
    }

    public void setGrade(Constraint<Double> grade) {
        this.grade = grade;
    }

    public void setGraduation_year(Constraint<Integer> graduation_year) {
        this.graduation_year = graduation_year;
    }

    public void setCandidates(List<User> candidates) {
        this.candidates = candidates;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNoPositions(int noPositions) {
        this.noPositions = noPositions;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Constraint<Double> getGrade() {
        return grade;
    }

    public Constraint<Integer> getExperience() {
        return experience;
    }

    public Constraint<Integer> getGraduation_year() {
        return graduation_year;
    }

    public double getSalary() {
        return salary;
    }

    public int getNoPositions() {
        return noPositions;
    }

    public List<User> getCandidates() {
        return candidates;
    }
    public String getCompanyName() {
        return companyName;
    }
    public boolean getOpen() {
        return open;
    }

    public void apply(User user) {
        for (Company c : Application.getInstance().getCompanies())
            if (c.getName().compareTo(this.getCompanyName()) == 0) {
                c.getRecruiter(user).evaluate(this, user);
            }
    }

    public boolean meetsRequirments(User user) {
        boolean meets = false;
        if (user.meanGPA() >= this.getGrade().getInferiorLimit() && user.meanGPA() <= this.getGrade().getSuperiorLimit()) {
            if (user.getGraduationYear() >= this.getGraduation_year().getInferiorLimit() && user.getGraduationYear() <= this.getGraduation_year().getSuperiorLimit()) {
                if ((((user.getTotalScore() - user.meanGPA()) / 1.5) >= this.getExperience().getInferiorLimit()) && (((user.getTotalScore() - user.meanGPA()) / 1.5) <= this.getExperience().getSuperiorLimit())) {
                    meets = true;
                }
            }
        }
        return meets;
    }
}
