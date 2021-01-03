import java.time.*;
import java.util.*;

public class User extends Consumer {
    private List<String> companies;

    public Employee convert() {
        Employee e = new Employee(this.getResume().getExperience().last().getCompany(), 0);
        Resume r = new Resume();
        r.setEducation(this.getResume().getEducation());
        r.setInformation(this.getResume().getInformation());
        r.setExperience(this.getResume().getExperience());
        e.setResume(r);
        return e;
    }

    //scor = numar_ani_experienta * 1.5 + medie_academica
    //pt o luna se considera un an
    public Double getTotalScore() {
        int experience = 0;
        TreeSet<Experience> exp = this.getResume().getExperience();
        for (Experience e : exp) {
            Period p = Period.between(e.getFinishing_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    e.getStarting_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            experience += p.getYears();
            if (p.getMonths() > 0 || p.getDays() > 0) {
                experience += 1;
            }
        }
        return experience * 1.5 + this.meanGPA();
    }
}
