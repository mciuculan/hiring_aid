import java.time.*;
import java.util.*;

public abstract class Consumer {
    class Resume {
        private Information information;
        private TreeSet<Education> education = new TreeSet<>();
        private TreeSet<Experience> experience = new TreeSet<>();

        public void addEducation(Education ed) {
            education.add(ed);
        }

        public void addExperience(Experience exp) {
            experience.add(exp);
        }

        public void setEducation(TreeSet<Education> education) {
            this.education = education;
        }

        public void setExperience(TreeSet<Experience> experience) {
            this.experience = experience;
        }

        public void setInformation(Information information) {
            this.information = information;
        }

        public Information getInformation() {
            return information;
        }

        public TreeSet<Education> getEducation() {
            return education;
        }

        public TreeSet<Experience> getExperience() {
            return experience;
        }
    }
    private Resume r;
    private List <Consumer> consumerList;

    public Resume getResume() {
        return r;
    }

    public void setResume(Resume r) {
        this.r = r;
    }

    public List<Consumer> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(List<Consumer> consumerList) {
        this.consumerList = consumerList;
    }

    public void editName(String name, String sur_name) {
        r.information.setName(name);
        r.information.setSur_name(sur_name);
    }

    public void editEMAIL(String email) {
        r.information.setEmail(email);
    }

    public void editPhoneNumber(int number) {
        r.information.setPhone_number(number);
    }

    public void editDateOfBirth(int year, int month, int date) {
        r.information.setDate_of_birth(date, month, year);
    }

    public void editLanguages(List<Languages> l) {
        r.information.setLanguages(l);
    }

    public void add(Education education) {
        r.addEducation(education);
    }

    public void add(Experience experience) {
        r.addExperience(experience);
    }

    public void add(Consumer consumer) {
        consumerList.add(consumer);
    }
//todo
    public int getDegreeInFriendship(Consumer consumer) {
        return 0;
    }

    public void remove(Consumer consumer) {
        consumerList.remove(consumer);
    }

    public Integer getGraduationYear() {
        return r.education.last().getFinishing_date().getYear();
    }

    public Double meanGPA() {
        double sum = 0.0;
        int i = 0;
        for (Education e : r.education) {
            sum += e.getGrade();
            i += 1;
        }
        if (i != 0)
            return sum/i;
        else
            return 0.0;
    }
}
