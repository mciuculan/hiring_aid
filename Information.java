import java.lang.reflect.Array;
import java.util.*;

public class Information {

    private String sur_name;
    private String name;
    private String email;
    private int phone_number;
    private Date date_of_birth;
    private String sex;
    private ArrayList<Languages> languages;

    private Information(Builder builder) {
        this.sur_name = builder.sur_name;
        this.name = builder.name;
        this.email = builder.email;
        this.phone_number = builder.phone_number;
        this.date_of_birth = builder.date_of_birth;
        this.sex = builder.sex;
        this.languages = builder.languages;
    }
    static class Builder {
        private String sur_name;
        private String name;
        private String email;
        private int phone_number;
        private Date date_of_birth;
        private String sex;
        private ArrayList<Languages> languages;

        Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        Builder setSur_name(String sur_name) {
            this.sur_name = sur_name;
            return this;
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        Builder setPhone_number(int phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        Builder setDate_of_birth(Date date) {
            this.date_of_birth = date;
            return this;
        }

        Builder setLanguages(ArrayList<Languages> languages) {
            this.languages = languages;
            return this;
        }
        Information build() {
            return new Information(this);
        }
    }

    public String getSur_name() {
        return sur_name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Languages> getLanguages() {
        return languages;
    }

    public void modifySur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public void modifyName(String name) {
        this.name = name;
    }

    public void modifyEmail(String email) {
        this.email = email;
    }

    public void modifyPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void modifyDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void modifySex(String sex) {
        this.sex = sex;
    }

    public void modifyLanguages(ArrayList<Languages> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Information{" +
                "sur_name='" + sur_name + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number +
                ", date_of_birth=" + date_of_birth +
                ", sex='" + sex + '\'' +
                ", languages=" + languages +
                '}';
    }
}
