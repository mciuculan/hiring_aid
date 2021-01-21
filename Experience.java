import java.util.*;

public class Experience implements Comparable<Experience> {
    private Date starting_date;
    private Date finishing_date;
    private String position;
    private Company company;

    static class InvalidDatesException extends Exception {
        public InvalidDatesException(String s) {
            super(s);
        }
    }
    public Experience(Date starting_date, Date finishing_date, Company company,String position) {
        try {
            this.starting_date = starting_date;
            this.finishing_date = finishing_date;
            if (starting_date.compareTo(finishing_date) > 0) {
                throw new InvalidDatesException("Data de finalizare este inaintea datei de inceput\n");
            }
        }
        catch (InvalidDatesException e) {
            System.out.println(e.getMessage());
        }
        this.position = position;
        this.company = company;

    }

    public Date getStarting_date() {
        return starting_date;
    }

    public Date getFinishing_date() {
        return finishing_date;
    }

    public Company getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void setStarting_date(Date starting_date) {
        this.starting_date = starting_date;
    }

    public void setFinishing_date(Date finishing_date) {
        this.finishing_date = finishing_date;
        Date current_date = new Date(System.currentTimeMillis());
        if (finishing_date.compareTo(current_date) >= 0) {
            this.finishing_date = null;
        }
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public int compareTo(Experience exp) {
        if (this.getFinishing_date() == null || exp.getFinishing_date() == null)
            return this.getCompany().getName().compareTo(exp.getCompany().getName());
        if (this.getFinishing_date().compareTo(exp.getFinishing_date()) != 0) {
            return exp.getFinishing_date().compareTo(this.getFinishing_date());
        }
        else if (this.getCompany().getName().compareTo(exp.getCompany().getName()) != 0) {
            return this.getCompany().getName().compareTo(exp.getCompany().getName());
        }
        return 0;
    }
}
