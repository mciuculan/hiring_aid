public class Recruiter extends Employee{
    private double rating = 5.0; // se adauga +0.1 pt userii evaluati
    public Recruiter(Company company, double salary, Resume r, int id) {
        super(company, salary, r, id);
    }

    public double getRating() {
        return rating;
    }

    public int evaluate(Job job, User user) {
        if (job.meetsRequirments(user) == true) {
            Request<Job, Consumer> request = new Request<>(job, user, this, this.getRating() * user.getTotalScore());
            this.getCompany().getManager().requests.add(request);
        }
        this.rating += 0.1;
        return (int) (this.getRating() * user.getTotalScore());
    }
}
