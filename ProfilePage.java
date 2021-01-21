import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

public class ProfilePage {
    public ProfilePage() {
        JFrame f=new JFrame();
        try {
            f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setBackground(new Color(245, 245, 245));
        JPanel container = new JPanel(new GridLayout(11,1));

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Profile");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Work Sans", Font.BOLD, 50));
        title.setForeground(new Color(8, 126, 139));
        titlePanel.add(title);
        container.add(titlePanel);

        // set surname
        JPanel surPanel = new JPanel(new GridLayout(1, 2));
        JLabel surName = new JLabel("Sur Name:");
        surName.setVerticalAlignment(JLabel.CENTER);
        surName.setHorizontalAlignment(JLabel.CENTER);
        surName.setFont(new Font("Work Sans", Font.BOLD, 15));
        surName.setForeground(new Color(8, 126, 139));
        surPanel.add(surName);
        JTextField surName_text_field = new JTextField();
        surPanel.add(surName_text_field);
        Border border8 = BorderFactory.createTitledBorder("");
        surPanel.setBorder(border8);

        //set name
        JPanel namePanel = new JPanel(new GridLayout(1, 2));
        JLabel Name = new JLabel("Name:");
        Name.setVerticalAlignment(JLabel.CENTER);
        Name.setHorizontalAlignment(JLabel.CENTER);
        Name.setFont(new Font("Work Sans", Font.BOLD, 15));
        Name.setForeground(new Color(8, 126, 139));
        namePanel.add(Name);
        JTextField Name_text_field = new JTextField();
        namePanel.add(Name_text_field);
        Border border7 = BorderFactory.createTitledBorder("");
        namePanel.setBorder(border7);

        //set email
        JPanel emailPanel = new JPanel(new GridLayout(1, 2));
        JLabel email = new JLabel("Email:");
        email.setVerticalAlignment(JLabel.CENTER);
        email.setHorizontalAlignment(JLabel.CENTER);
        email.setFont(new Font("Work Sans", Font.BOLD, 15));
        email.setForeground(new Color(8, 126, 139));
        emailPanel.add(email);
        JTextField email_text_field = new JTextField();
        emailPanel.add(email_text_field);
        Border border6 = BorderFactory.createTitledBorder("");
        emailPanel.setBorder(border6);

        //set phone number
        JPanel phonePanel = new JPanel(new GridLayout(1, 2));
        JLabel phone = new JLabel("Phone Number:");
        phone.setVerticalAlignment(JLabel.CENTER);
        phone.setHorizontalAlignment(JLabel.CENTER);
        phone.setFont(new Font("Work Sans", Font.BOLD, 15));
        phone.setForeground(new Color(8, 126, 139));
        phonePanel.add(phone);
        JTextField phone_text_field = new JTextField("000000");
        phonePanel.add(phone_text_field);
        Border border5 = BorderFactory.createTitledBorder("");
        phonePanel.setBorder(border5);

        //set date of birth
        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
        JPanel datePanel = new JPanel(new GridLayout(1, 2));
        JLabel date = new JLabel("Date of birth:");
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Work Sans", Font.BOLD, 15));
        date.setForeground(new Color(8, 126, 139));
        datePanel.add(date);
        JFormattedTextField date_text_field = new JFormattedTextField(df);
        date_text_field.setText("01/Jan/1901");
        date_text_field.setForeground(new Color(60, 60, 60));
        date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        date_text_field.setHorizontalAlignment(JTextField.CENTER);
        datePanel.add(date_text_field);
        Border border4 = BorderFactory.createTitledBorder("");
        datePanel.setBorder(border4);

        //set sex
        JPanel sexPanel = new JPanel(new GridLayout(1, 2));
        JLabel sex = new JLabel("Sex:");
        sex.setVerticalAlignment(JLabel.CENTER);
        sex.setHorizontalAlignment(JLabel.CENTER);
        sex.setFont(new Font("Work Sans", Font.BOLD, 15));
        sex.setForeground(new Color(8, 126, 139));
        sexPanel.add(sex);
        JPanel m_or_f = new JPanel(new GridLayout(1, 2));
        JRadioButton mButton = new JRadioButton("M");
        JRadioButton fButton = new JRadioButton("F");
        ButtonGroup group = new ButtonGroup();
        group.add(mButton);
        group.add(fButton);
        m_or_f.add(mButton);
        m_or_f.add(fButton);
        sexPanel.add(m_or_f);
        Border border3 = BorderFactory.createTitledBorder("");
        sexPanel.setBorder(border3);

        //set languages
        JPanel languagePanel = new JPanel(new GridLayout(1, 2));
        JLabel languages = new JLabel("Languages:");
        languages.setVerticalAlignment(JLabel.CENTER);
        languages.setHorizontalAlignment(JLabel.CENTER);
        languages.setFont(new Font("Work Sans", Font.BOLD, 15));
        languages.setForeground(new Color(8, 126, 139));
        languagePanel.add(languages);
        JPanel languagePanel2 = new JPanel(new GridLayout(3,1));
        JPanel addLanguage = new JPanel(new GridLayout(1,2));
        JTextField language = new JTextField("Latin");
        JTextField level = new JTextField("Beginner");
        language.setForeground(new Color(60, 60, 60));
        language.setFont(new Font("Work Sans", Font.ITALIC, 15));
        language.setHorizontalAlignment(JTextField.CENTER);
        level.setForeground(new Color(60, 60, 60));
        level.setFont(new Font("Work Sans", Font.ITALIC, 15));
        level.setHorizontalAlignment(JTextField.CENTER);
        addLanguage.add(language);
        addLanguage.add(level);
        languagePanel2.add(addLanguage);
        JList<Languages> languageList = new JList<>();
        languagePanel2.add(new JScrollPane(languageList));
        JButton addNewLanguage = new JButton("Add Language");
        addNewLanguage.setBackground(new Color(245, 245, 245));
        addNewLanguage.setFont(new Font("Work Sans", Font.PLAIN, 16));
        addNewLanguage.setForeground(new Color(8, 126, 139));
        languagePanel.add(languagePanel2);
        Border border2 = BorderFactory.createTitledBorder("");
        languagePanel.setBorder(border2);

        //start education
        JPanel ed = new JPanel(new GridLayout(2,1));
        JPanel educationPanel = new JPanel(new GridLayout(1, 2));
        JLabel education = new JLabel("Education:");
        education.setVerticalAlignment(JLabel.CENTER);
        education.setHorizontalAlignment(JLabel.CENTER);
        education.setFont(new Font("Work Sans", Font.BOLD, 15));
        education.setForeground(new Color(8, 126, 139));
        educationPanel.add(education);

        JPanel education_info = new JPanel(new GridLayout(5, 2));
        JLabel institution = new JLabel("Institution:");
        institution.setVerticalAlignment(JLabel.CENTER);
        institution.setHorizontalAlignment(JLabel.CENTER);
        institution.setFont(new Font("Work Sans", Font.BOLD, 15));
        institution.setForeground(new Color(8, 126, 139));
        education_info.add(institution);
        JTextField addInstitution = new JTextField("Add institution");
        addInstitution.setForeground(new Color(60, 60, 60));
        addInstitution.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addInstitution.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(addInstitution);

        JLabel st_date = new JLabel("Starting Date:");
        st_date.setVerticalAlignment(JLabel.CENTER);
        st_date.setHorizontalAlignment(JLabel.CENTER);
        st_date.setFont(new Font("Work Sans", Font.BOLD, 15));
        st_date.setForeground(new Color(8, 126, 139));
        education_info.add(st_date);
        JFormattedTextField st_date_text_field = new JFormattedTextField(df);
        st_date_text_field.setText("dd/MM/yyyy");
        st_date_text_field.setForeground(new Color(60, 60, 60));
        st_date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        st_date_text_field.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(st_date_text_field);

        JLabel fs_date = new JLabel("Finishing Date:");
        fs_date.setVerticalAlignment(JLabel.CENTER);
        fs_date.setHorizontalAlignment(JLabel.CENTER);
        fs_date.setFont(new Font("Work Sans", Font.BOLD, 15));
        fs_date.setForeground(new Color(8, 126, 139));
        education_info.add(fs_date);
        JFormattedTextField fs_date_text_field = new JFormattedTextField(df);
        fs_date_text_field.setText("dd/MM/yyyy");
        fs_date_text_field.setForeground(new Color(60, 60, 60));
        fs_date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        fs_date_text_field.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(fs_date_text_field);

        JLabel degree = new JLabel("Degree:");
        degree.setVerticalAlignment(JLabel.CENTER);
        degree.setHorizontalAlignment(JLabel.CENTER);
        degree.setFont(new Font("Work Sans", Font.BOLD, 15));
        degree.setForeground(new Color(8, 126, 139));
        education_info.add(degree);
        JTextField addDegree = new JTextField("Add degree");
        addDegree.setForeground(new Color(60, 60, 60));
        addDegree.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addDegree.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(addDegree);

        ed.add(education_info);

        JList<Education> educationList = new JList<>();
        ed.add(new JScrollPane(educationList));

        Border border1 = BorderFactory.createTitledBorder("");
        educationPanel.setBorder(border1);
        educationPanel.add(ed);
        //end education

        //start experience
        JPanel exp = new JPanel(new GridLayout(2,1));
        JPanel experiencePanel = new JPanel(new GridLayout(1, 2));
        JLabel experience = new JLabel("Experience:");
        experience.setVerticalAlignment(JLabel.CENTER);
        experience.setHorizontalAlignment(JLabel.CENTER);
        experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        experience.setForeground(new Color(8, 126, 139));
        experiencePanel.add(experience);

        JPanel experience_info = new JPanel(new GridLayout(5, 2));
        JLabel position = new JLabel("Position:");
        position.setVerticalAlignment(JLabel.CENTER);
        position.setHorizontalAlignment(JLabel.CENTER);
        position.setFont(new Font("Work Sans", Font.BOLD, 15));
        position.setForeground(new Color(8, 126, 139));
        experience_info.add(position);
        JTextField addPosition = new JTextField("Add position");
        addPosition.setForeground(new Color(60, 60, 60));
        addPosition.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addPosition.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(addPosition);

        JLabel st_date_experience = new JLabel("Starting Date:");
        st_date_experience.setVerticalAlignment(JLabel.CENTER);
        st_date_experience.setHorizontalAlignment(JLabel.CENTER);
        st_date_experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        st_date_experience.setForeground(new Color(8, 126, 139));
        experience_info.add(st_date_experience);
        JFormattedTextField st_date_experience_text = new JFormattedTextField(df);
        st_date_experience_text.setText("dd/MM/yyyy");
        st_date_experience_text.setForeground(new Color(60, 60, 60));
        st_date_experience_text.setFont(new Font("Work Sans", Font.ITALIC, 15));
        st_date_experience_text.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(st_date_experience_text);

        JLabel fs_date_experience = new JLabel("Finishing Date:");
        fs_date_experience.setVerticalAlignment(JLabel.CENTER);
        fs_date_experience.setHorizontalAlignment(JLabel.CENTER);
        fs_date_experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        fs_date_experience.setForeground(new Color(8, 126, 139));
        experience_info.add(fs_date_experience);
        JFormattedTextField fs_date_experience_text = new JFormattedTextField(df);
        fs_date_experience_text.setText("dd/MM/yyyy");
        fs_date_experience_text.setForeground(new Color(60, 60, 60));
        fs_date_experience_text.setFont(new Font("Work Sans", Font.ITALIC, 15));
        fs_date_experience_text.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(fs_date_experience_text);

        JLabel company = new JLabel("Company:");
        company.setVerticalAlignment(JLabel.CENTER);
        company.setHorizontalAlignment(JLabel.CENTER);
        company.setFont(new Font("Work Sans", Font.BOLD, 15));
        company.setForeground(new Color(8, 126, 139));
        experience_info.add(company);
        JTextField addCompany = new JTextField("Add company");
        addCompany.setForeground(new Color(60, 60, 60));
        addCompany.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addCompany.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(addCompany);

        exp.add(experience_info);

        JList<Education> experienceList = new JList<>();
        exp.add(new JScrollPane(experienceList));

        Border border = BorderFactory.createTitledBorder("");
        experiencePanel.setBorder(border);
        experiencePanel.add(exp);

        //end experience

        //buttons
        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(1,2);
        grid.setVgap(10);
        JButton backButton = new JButton("Back");
        JButton submitButton = new JButton("Submit Changes");
        backButton.setBackground(new Color(245, 245, 245));
        backButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        backButton.setForeground(new Color(8, 126, 139));
        submitButton.setBackground(new Color(245, 245, 245));
        submitButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        submitButton.setForeground(new Color(8, 126, 139));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                try {
                    Menu m = new Menu();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String surname_string = surName_text_field.getText();
                String name_string = Name_text_field.getText();
                String email_string = email_text_field.getText();
                int phonenumber_string = Integer.parseInt(phone_text_field.getText());
                StringTokenizer string = new StringTokenizer(date_text_field.getText(), "/");
                Date dob = new Date();
                int i = 0;
                while (string.hasMoreTokens()) {
                    if (i == 0) {
                        dob.setDate(Integer.parseInt(string.nextToken()));
                    }
                    else if (i == 1) {
                        int month;
                        String s = string.nextToken();
                        switch (s) {
                            case "Jan" -> month = 1;
                            case "Feb" -> month = 2;
                            case "Mar" -> month = 3;
                            case "Apr" -> month = 4;
                            case "May" -> month = 5;
                            case "Jun" -> month = 6;
                            case "Jul" -> month = 7;
                            case "Aug" -> month = 8;
                            case "Sep" -> month = 9;
                            case "Oct" -> month = 10;
                            case "Nov" -> month = 11;
                            case "Dec" -> month = 12;
                            default -> {
                                JOptionPane.showMessageDialog(null,
                                        "Wrong month input!",
                                        "Error",
                                        JOptionPane.WARNING_MESSAGE);
                                month = 1;
                            }
                        }
                        dob.setMonth(month);
                    }
                    else if (i == 2) {
                        dob.setYear(Integer.parseInt(string.nextToken()));
                    }
                    i++;
                }
                String gender;
                if (mButton.isSelected()) {
                    gender = "male";
                }
                else if (fButton.isSelected()) {
                    gender = "female";
                }
                else {
                    gender = "unknown";
                }
                Languages l = new Languages(language.getText(), level.getText());
                ArrayList<Languages> languagesArrayList = new ArrayList<>();
                languagesArrayList.add(l);
                Information info = new Information.Builder().setSur_name(surname_string)
                        .setName(name_string).setEmail(email_string).setDate_of_birth(dob)
                        .setPhone_number(phonenumber_string).setSex(gender).setLanguages(languagesArrayList).build();
                Consumer.Resume r = new Consumer.Resume.ResumeBuilder().setInformation(info).build();
                User u = new User(r, Application.getInstance().getNo_users());
                Application.getInstance().add(u);
                JOptionPane.showMessageDialog(null,
                        "User added",
                        "",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        buttonPanel.setLayout(grid);
        buttonPanel.add(backButton);
        buttonPanel.add(submitButton);

        container.add(surPanel);
        container.add(namePanel);
        container.add(emailPanel);
        container.add(phonePanel);
        container.add(datePanel);
        container.add(sexPanel);
        container.add(languagePanel);
        container.add(educationPanel);
        container.add(experiencePanel);
        container.add(buttonPanel);
        JScrollPane scrPane = new JScrollPane(container);
        f.add(scrPane);
        f.setSize(700,800);
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ProfilePage(User u) {
        JFrame f=new JFrame();
        try {
            f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setBackground(new Color(245, 245, 245));
        JPanel container = new JPanel(new GridLayout(11,1));

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Profile");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Work Sans", Font.BOLD, 50));
        title.setForeground(new Color(8, 126, 139));
        titlePanel.add(title);
        container.add(titlePanel);

        // set surname
        JPanel surPanel = new JPanel(new GridLayout(1, 2));
        JLabel surName = new JLabel("Sur Name:");
        surName.setVerticalAlignment(JLabel.CENTER);
        surName.setHorizontalAlignment(JLabel.CENTER);
        surName.setFont(new Font("Work Sans", Font.BOLD, 15));
        surName.setForeground(new Color(8, 126, 139));
        surPanel.add(surName);
        JTextField surName_text_field = new JTextField();
        surPanel.add(surName_text_field);
        Border border8 = BorderFactory.createTitledBorder("");
        surPanel.setBorder(border8);
        surName_text_field.setText(u.getResume().getInformation().getSur_name());

        //set name
        JPanel namePanel = new JPanel(new GridLayout(1, 2));
        JLabel Name = new JLabel("Name:");
        Name.setVerticalAlignment(JLabel.CENTER);
        Name.setHorizontalAlignment(JLabel.CENTER);
        Name.setFont(new Font("Work Sans", Font.BOLD, 15));
        Name.setForeground(new Color(8, 126, 139));
        namePanel.add(Name);
        JTextField Name_text_field = new JTextField();
        namePanel.add(Name_text_field);
        Border border7 = BorderFactory.createTitledBorder("");
        namePanel.setBorder(border7);
        Name_text_field.setText(u.getResume().getInformation().getName());

        //set email
        JPanel emailPanel = new JPanel(new GridLayout(1, 2));
        JLabel email = new JLabel("Email:");
        email.setVerticalAlignment(JLabel.CENTER);
        email.setHorizontalAlignment(JLabel.CENTER);
        email.setFont(new Font("Work Sans", Font.BOLD, 15));
        email.setForeground(new Color(8, 126, 139));
        emailPanel.add(email);
        JTextField email_text_field = new JTextField();
        emailPanel.add(email_text_field);
        Border border6 = BorderFactory.createTitledBorder("");
        emailPanel.setBorder(border6);
        email_text_field.setText(u.getResume().getInformation().getEmail());

        //set phone number
        JPanel phonePanel = new JPanel(new GridLayout(1, 2));
        JLabel phone = new JLabel("Phone Number:");
        phone.setVerticalAlignment(JLabel.CENTER);
        phone.setHorizontalAlignment(JLabel.CENTER);
        phone.setFont(new Font("Work Sans", Font.BOLD, 15));
        phone.setForeground(new Color(8, 126, 139));
        phonePanel.add(phone);
        JTextField phone_text_field = new JTextField("000000");
        phonePanel.add(phone_text_field);
        Border border5 = BorderFactory.createTitledBorder("");
        phonePanel.setBorder(border5);
        phone_text_field.setText(Integer.toString(u.getResume().getInformation().getPhone_number()));

        //set date of birth
        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
        JPanel datePanel = new JPanel(new GridLayout(1, 2));
        JLabel date = new JLabel("Date of birth:");
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Work Sans", Font.BOLD, 15));
        date.setForeground(new Color(8, 126, 139));
        datePanel.add(date);
        JFormattedTextField date_text_field = new JFormattedTextField(df);
        date_text_field.setText("01/Jan/1901");
        date_text_field.setForeground(new Color(60, 60, 60));
        date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        date_text_field.setHorizontalAlignment(JTextField.CENTER);
        datePanel.add(date_text_field);
        Border border4 = BorderFactory.createTitledBorder("");
        datePanel.setBorder(border4);
        date_text_field.setText(u.getResume().getInformation().getDate_of_birth().toString());

        //set sex
        JPanel sexPanel = new JPanel(new GridLayout(1, 2));
        JLabel sex = new JLabel("Sex:");
        sex.setVerticalAlignment(JLabel.CENTER);
        sex.setHorizontalAlignment(JLabel.CENTER);
        sex.setFont(new Font("Work Sans", Font.BOLD, 15));
        sex.setForeground(new Color(8, 126, 139));
        sexPanel.add(sex);
        JPanel m_or_f = new JPanel(new GridLayout(1, 2));
        JRadioButton mButton = new JRadioButton("M");
        JRadioButton fButton = new JRadioButton("F");
        ButtonGroup group = new ButtonGroup();
        group.add(mButton);
        group.add(fButton);
        m_or_f.add(mButton);
        m_or_f.add(fButton);
        sexPanel.add(m_or_f);
        Border border3 = BorderFactory.createTitledBorder("");
        sexPanel.setBorder(border3);

        //set languages
        JPanel languagePanel = new JPanel(new GridLayout(1, 2));
        JLabel languages = new JLabel("Languages:");
        languages.setVerticalAlignment(JLabel.CENTER);
        languages.setHorizontalAlignment(JLabel.CENTER);
        languages.setFont(new Font("Work Sans", Font.BOLD, 15));
        languages.setForeground(new Color(8, 126, 139));
        languagePanel.add(languages);
        JPanel languagePanel2 = new JPanel(new GridLayout(3,1));
        JPanel addLanguage = new JPanel(new GridLayout(1,2));
        JTextField language = new JTextField("Latin");
        JTextField level = new JTextField("Beginner");
        language.setForeground(new Color(60, 60, 60));
        language.setFont(new Font("Work Sans", Font.ITALIC, 15));
        language.setHorizontalAlignment(JTextField.CENTER);
        level.setForeground(new Color(60, 60, 60));
        level.setFont(new Font("Work Sans", Font.ITALIC, 15));
        level.setHorizontalAlignment(JTextField.CENTER);
        addLanguage.add(language);
        addLanguage.add(level);
        languagePanel2.add(addLanguage);
        JList<Languages> languageList = new JList<>();
        languagePanel2.add(new JScrollPane(languageList));
        JButton addNewLanguage = new JButton("Add Language");
        addNewLanguage.setBackground(new Color(245, 245, 245));
        addNewLanguage.setFont(new Font("Work Sans", Font.PLAIN, 16));
        addNewLanguage.setForeground(new Color(8, 126, 139));
        languagePanel.add(languagePanel2);
        Border border2 = BorderFactory.createTitledBorder("");
        languagePanel.setBorder(border2);
        languageList.setListData((Languages[]) u.getResume().getInformation().getLanguages().toArray());

        //start education
        JPanel ed = new JPanel(new GridLayout(2,1));
        JPanel educationPanel = new JPanel(new GridLayout(1, 2));
        JLabel education = new JLabel("Education:");
        education.setVerticalAlignment(JLabel.CENTER);
        education.setHorizontalAlignment(JLabel.CENTER);
        education.setFont(new Font("Work Sans", Font.BOLD, 15));
        education.setForeground(new Color(8, 126, 139));
        educationPanel.add(education);

        JPanel education_info = new JPanel(new GridLayout(5, 2));
        JLabel institution = new JLabel("Institution:");
        institution.setVerticalAlignment(JLabel.CENTER);
        institution.setHorizontalAlignment(JLabel.CENTER);
        institution.setFont(new Font("Work Sans", Font.BOLD, 15));
        institution.setForeground(new Color(8, 126, 139));
        education_info.add(institution);
        JTextField addInstitution = new JTextField("Add institution");
        addInstitution.setForeground(new Color(60, 60, 60));
        addInstitution.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addInstitution.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(addInstitution);

        JLabel st_date = new JLabel("Starting Date:");
        st_date.setVerticalAlignment(JLabel.CENTER);
        st_date.setHorizontalAlignment(JLabel.CENTER);
        st_date.setFont(new Font("Work Sans", Font.BOLD, 15));
        st_date.setForeground(new Color(8, 126, 139));
        education_info.add(st_date);
        JFormattedTextField st_date_text_field = new JFormattedTextField(df);
        st_date_text_field.setText("dd/MM/yyyy");
        st_date_text_field.setForeground(new Color(60, 60, 60));
        st_date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        st_date_text_field.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(st_date_text_field);

        JLabel fs_date = new JLabel("Finishing Date:");
        fs_date.setVerticalAlignment(JLabel.CENTER);
        fs_date.setHorizontalAlignment(JLabel.CENTER);
        fs_date.setFont(new Font("Work Sans", Font.BOLD, 15));
        fs_date.setForeground(new Color(8, 126, 139));
        education_info.add(fs_date);
        JFormattedTextField fs_date_text_field = new JFormattedTextField(df);
        fs_date_text_field.setText("dd/MM/yyyy");
        fs_date_text_field.setForeground(new Color(60, 60, 60));
        fs_date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        fs_date_text_field.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(fs_date_text_field);

        JLabel degree = new JLabel("Degree:");
        degree.setVerticalAlignment(JLabel.CENTER);
        degree.setHorizontalAlignment(JLabel.CENTER);
        degree.setFont(new Font("Work Sans", Font.BOLD, 15));
        degree.setForeground(new Color(8, 126, 139));
        education_info.add(degree);
        JTextField addDegree = new JTextField("Add degree");
        addDegree.setForeground(new Color(60, 60, 60));
        addDegree.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addDegree.setHorizontalAlignment(JTextField.CENTER);
        education_info.add(addDegree);

        ed.add(education_info);

        JList<Education> educationList = new JList<>();
        ed.add(new JScrollPane(educationList));

        Border border1 = BorderFactory.createTitledBorder("");
        educationPanel.setBorder(border1);
        educationPanel.add(ed);
        //end education

        //start experience
        JPanel exp = new JPanel(new GridLayout(2,1));
        JPanel experiencePanel = new JPanel(new GridLayout(1, 2));
        JLabel experience = new JLabel("Experience:");
        experience.setVerticalAlignment(JLabel.CENTER);
        experience.setHorizontalAlignment(JLabel.CENTER);
        experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        experience.setForeground(new Color(8, 126, 139));
        experiencePanel.add(experience);

        JPanel experience_info = new JPanel(new GridLayout(5, 2));
        JLabel position = new JLabel("Position:");
        position.setVerticalAlignment(JLabel.CENTER);
        position.setHorizontalAlignment(JLabel.CENTER);
        position.setFont(new Font("Work Sans", Font.BOLD, 15));
        position.setForeground(new Color(8, 126, 139));
        experience_info.add(position);
        JTextField addPosition = new JTextField("Add position");
        addPosition.setForeground(new Color(60, 60, 60));
        addPosition.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addPosition.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(addPosition);

        JLabel st_date_experience = new JLabel("Starting Date:");
        st_date_experience.setVerticalAlignment(JLabel.CENTER);
        st_date_experience.setHorizontalAlignment(JLabel.CENTER);
        st_date_experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        st_date_experience.setForeground(new Color(8, 126, 139));
        experience_info.add(st_date_experience);
        JFormattedTextField st_date_experience_text = new JFormattedTextField(df);
        st_date_experience_text.setText("dd/MM/yyyy");
        st_date_experience_text.setForeground(new Color(60, 60, 60));
        st_date_experience_text.setFont(new Font("Work Sans", Font.ITALIC, 15));
        st_date_experience_text.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(st_date_experience_text);

        JLabel fs_date_experience = new JLabel("Finishing Date:");
        fs_date_experience.setVerticalAlignment(JLabel.CENTER);
        fs_date_experience.setHorizontalAlignment(JLabel.CENTER);
        fs_date_experience.setFont(new Font("Work Sans", Font.BOLD, 15));
        fs_date_experience.setForeground(new Color(8, 126, 139));
        experience_info.add(fs_date_experience);
        JFormattedTextField fs_date_experience_text = new JFormattedTextField(df);
        fs_date_experience_text.setText("dd/MM/yyyy");
        fs_date_experience_text.setForeground(new Color(60, 60, 60));
        fs_date_experience_text.setFont(new Font("Work Sans", Font.ITALIC, 15));
        fs_date_experience_text.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(fs_date_experience_text);

        JLabel company = new JLabel("Company:");
        company.setVerticalAlignment(JLabel.CENTER);
        company.setHorizontalAlignment(JLabel.CENTER);
        company.setFont(new Font("Work Sans", Font.BOLD, 15));
        company.setForeground(new Color(8, 126, 139));
        experience_info.add(company);
        JTextField addCompany = new JTextField("Add company");
        addCompany.setForeground(new Color(60, 60, 60));
        addCompany.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addCompany.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(addCompany);

        exp.add(experience_info);

        JList<Education> experienceList = new JList<>();
        exp.add(new JScrollPane(experienceList));

        Border border = BorderFactory.createTitledBorder("");
        experiencePanel.setBorder(border);
        experiencePanel.add(exp);

        //end experience

        //buttons
        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(1,2);
        grid.setVgap(10);
        JButton backButton = new JButton("Back");
        JButton submitButton = new JButton("Submit Changes");
        backButton.setBackground(new Color(245, 245, 245));
        backButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        backButton.setForeground(new Color(8, 126, 139));
        submitButton.setBackground(new Color(245, 245, 245));
        submitButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        submitButton.setForeground(new Color(8, 126, 139));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                try {
                    Menu m = new Menu();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String surname_string = surName_text_field.getText();
                String name_string = Name_text_field.getText();
                String email_string = email_text_field.getText();
                int phonenumber_string = Integer.parseInt(phone_text_field.getText());
                StringTokenizer string = new StringTokenizer(date_text_field.getText(), "/");
                Date dob = new Date();
                int i = 0;
                while (string.hasMoreTokens()) {
                    if (i == 0) {
                        dob.setDate(Integer.parseInt(string.nextToken()));
                    }
                    else if (i == 1) {
                        int month;
                        String s = string.nextToken();
                        switch (s) {
                            case "Jan" -> month = 1;
                            case "Feb" -> month = 2;
                            case "Mar" -> month = 3;
                            case "Apr" -> month = 4;
                            case "May" -> month = 5;
                            case "Jun" -> month = 6;
                            case "Jul" -> month = 7;
                            case "Aug" -> month = 8;
                            case "Sep" -> month = 9;
                            case "Oct" -> month = 10;
                            case "Nov" -> month = 11;
                            case "Dec" -> month = 12;
                            default -> {
                                JOptionPane.showMessageDialog(null,
                                        "Wrong month input!",
                                        "Error",
                                        JOptionPane.WARNING_MESSAGE);
                                month = 1;
                            }
                        }
                        dob.setMonth(month);
                    }
                    else if (i == 2) {
                        dob.setYear(Integer.parseInt(string.nextToken()));
                    }
                    i++;
                }
                String gender;
                if (mButton.isSelected()) {
                    gender = "male";
                }
                else if (fButton.isSelected()) {
                    gender = "female";
                }
                else {
                    gender = "unknown";
                }
                Languages l = new Languages(language.getText(), level.getText());
                ArrayList<Languages> languagesArrayList = new ArrayList<>();
                languagesArrayList.add(l);
                Information info = new Information.Builder().setSur_name(surname_string)
                        .setName(name_string).setEmail(email_string).setDate_of_birth(dob)
                        .setPhone_number(phonenumber_string).setSex(gender).setLanguages(languagesArrayList).build();
                u.getResume().modifyInformation(info);
                JOptionPane.showMessageDialog(null,
                        "User modified",
                        "",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        buttonPanel.setLayout(grid);
        buttonPanel.add(backButton);
        buttonPanel.add(submitButton);

        container.add(surPanel);
        container.add(namePanel);
        container.add(emailPanel);
        container.add(phonePanel);
        container.add(datePanel);
        container.add(sexPanel);
        container.add(languagePanel);
        container.add(educationPanel);
        container.add(experiencePanel);
        container.add(buttonPanel);
        JScrollPane scrPane = new JScrollPane(container);
        f.add(scrPane);
        f.setSize(700,800);
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
