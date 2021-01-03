import java.util.*;

public class Education implements Comparable<Education> {
    private Date starting_date;
    private Date finishing_date;
    private String institution;
    private String level;
    private double grade;

    class InvalidDatesException extends Exception {
        public InvalidDatesException(String s) {
            super(s);
        }
    }
    public Education(Date starting_date, Date finishing_date, String institution,String level, double grade) {
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
        this.institution = institution;
        this.level = level;
        this.grade = grade;

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

    public void setLevel(String level) {
        this.level = level;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getStarting_date() {
        return starting_date;
    }

    public Date getFinishing_date() {
        return finishing_date;
    }

    public String getLevel() {
        return level;
    }

    public double getGrade() {
        return grade;
    }

    public String getInstitution() {
        return institution;
    }

    @Override
    public int compareTo(Education ed) {
        if (this.getFinishing_date().compareTo(ed.getFinishing_date()) != 0) {
            return ed.getFinishing_date().compareTo(this.getFinishing_date());
        }
        else if ((this.getGrade() - ed.getGrade()) != 0.0) {
            return (int)(ed.getGrade() - this.getGrade());
        }
        else if (this.getFinishing_date() == null || ed.getFinishing_date() == null) {
            return this.getStarting_date().compareTo(ed.getStarting_date());
        }
        return 0;
    }
}
