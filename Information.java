import java.util.*;

public class Information {

    private String sur_name;
    private String name;
    private String email;
    private int phone_number;
    private Date date_of_birth;
    private String sex;
    private List<Languages> languages;

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setDate_of_birth(int monthDay, int month, int year) {
        this.date_of_birth.setMonth(month);
        this.date_of_birth.setYear((year));
        this.date_of_birth.setDate(monthDay);
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
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

    public List<Languages> getLanguages() {
        return languages;
    }
}
