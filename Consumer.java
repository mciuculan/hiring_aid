import java.util.*;

public abstract class Consumer implements Comparable<Consumer> {

    static class Resume {
        private Information information;
        private TreeSet<Education> education;
        private TreeSet<Experience> experience;

        private Resume(ResumeBuilder builder) {
            this.information = builder.information;
            this.education = builder.education;
            this.experience = builder.experience;
        }
        static class ResumeBuilder {
            private Information information;
            private TreeSet<Education> education = new TreeSet<>();
            private TreeSet<Experience> experience = new TreeSet<>();

            ResumeBuilder setEducation(TreeSet<Education> education) {
                this.education = education;
                return this;
            }

            ResumeBuilder setExperience(TreeSet<Experience> experience) {
                this.experience = experience;
                return this;
            }

            ResumeBuilder setInformation(Information information) {
                this.information = information;
                return this;
            }

            Resume build() {
                return new Resume(this);
            }
        }
        public void addEducation(Education ed) {
            education.add(ed);
        }

        public void addExperience(Experience exp) {
            experience.add(exp);
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
    private int unique_id;

    public Consumer(Resume r, int unique_id) {
        this.unique_id = unique_id;
        this.r = r; //il pun din clasa test
    }
    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

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

    public void add(Education education) {
        r.addEducation(education);
    }

    public void add(Experience experience) {
        r.addExperience(experience);
    }

    public void add(Consumer consumer) {
        consumerList.add(consumer);
    }

    public int getDegreeInFriendship(Consumer consumer) {
        return Application.getInstance().getUsersGraph().getDistance(this, consumer);
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
