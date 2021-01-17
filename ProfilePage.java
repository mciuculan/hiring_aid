import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProfilePage {
    public static void main(String[] args) throws IOException {
        JFrame f=new JFrame();//creating instance of JFrame
        f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        f.setBackground(new Color(245, 245, 245));
        f.setLayout(new GridLayout(10,1));

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Profile", SwingConstants.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("Work Sans", Font.BOLD, 20));
        title.setForeground(new Color(8, 126, 139));
        titlePanel.add(title);
        f.add(title);

        JPanel surPanel = new JPanel(new GridLayout(1, 2));
        JLabel surName = new JLabel("Sur Name:");
        surName.setVerticalAlignment(JLabel.CENTER);
        surName.setHorizontalAlignment(JLabel.CENTER);
        surName.setFont(new Font("Work Sans", Font.BOLD, 15));
        surName.setForeground(new Color(8, 126, 139));
        surPanel.add(surName);

        JTextField surName_text_field = new JTextField();
        surPanel.add(surName_text_field);

        JPanel namePanel = new JPanel(new GridLayout(1, 2));
        JLabel Name = new JLabel("Name:");
        Name.setVerticalAlignment(JLabel.CENTER);
        Name.setHorizontalAlignment(JLabel.CENTER);
        Name.setFont(new Font("Work Sans", Font.BOLD, 15));
        Name.setForeground(new Color(8, 126, 139));
        namePanel.add(Name);
        JTextField Name_text_field = new JTextField();
        namePanel.add(Name_text_field);

        JPanel emailPanel = new JPanel(new GridLayout(1, 2));
        JLabel email = new JLabel("Email:");
        email.setVerticalAlignment(JLabel.CENTER);
        email.setHorizontalAlignment(JLabel.CENTER);
        email.setFont(new Font("Work Sans", Font.BOLD, 15));
        email.setForeground(new Color(8, 126, 139));
        emailPanel.add(email);
        JTextField email_text_field = new JTextField();
        emailPanel.add(email_text_field);

        JPanel phonePanel = new JPanel(new GridLayout(1, 2));
        JLabel phone = new JLabel("Phone Number:");
        phone.setVerticalAlignment(JLabel.CENTER);
        phone.setHorizontalAlignment(JLabel.CENTER);
        phone.setFont(new Font("Work Sans", Font.BOLD, 15));
        phone.setForeground(new Color(8, 126, 139));
        phonePanel.add(phone);
        JTextField phone_text_field = new JTextField();
        phonePanel.add(phone_text_field);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JPanel datePanel = new JPanel(new GridLayout(1, 2));
        JLabel date = new JLabel("Date of birth:");
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Work Sans", Font.BOLD, 15));
        date.setForeground(new Color(8, 126, 139));
        datePanel.add(date);
        JFormattedTextField date_text_field = new JFormattedTextField(df);
        date_text_field.setText("dd/MM/yyyy");
        date_text_field.setForeground(new Color(60, 60, 60));
        date_text_field.setFont(new Font("Work Sans", Font.ITALIC, 15));
        date_text_field.setHorizontalAlignment(JTextField.CENTER);
        datePanel.add(date_text_field);

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

        JPanel languagePanel = new JPanel(new GridLayout(1, 2));
        JLabel languages = new JLabel("Languages:");
        languages.setVerticalAlignment(JLabel.CENTER);
        languages.setHorizontalAlignment(JLabel.CENTER);
        languages.setFont(new Font("Work Sans", Font.BOLD, 15));
        languages.setForeground(new Color(8, 126, 139));
        languagePanel.add(languages);
        JPanel languagePanel2 = new JPanel(new GridLayout(2,1));
        JPanel addLanguage = new JPanel(new GridLayout(1,2));
        JTextField language = new JTextField("Add language");
        JTextField level = new JTextField("Add level");
        language.setForeground(new Color(60, 60, 60));
        language.setFont(new Font("Work Sans", Font.ITALIC, 15));
        language.setHorizontalAlignment(JTextField.CENTER);
        level.setForeground(new Color(60, 60, 60));
        level.setFont(new Font("Work Sans", Font.ITALIC, 15));
        level.setHorizontalAlignment(JTextField.CENTER);
        addLanguage.add(language);
        addLanguage.add(level);
        languagePanel2.add(addLanguage);
        JList languageList = new JList();
        languagePanel2.add(languageList);
        languagePanel.add(languagePanel2);

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

        educationPanel.add(education_info);

        //start experience
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
        experience_info.add(degree);
        JTextField addCompany = new JTextField("Add company");
        addCompany.setForeground(new Color(60, 60, 60));
        addCompany.setFont(new Font("Work Sans", Font.ITALIC, 15));
        addCompany.setHorizontalAlignment(JTextField.CENTER);
        experience_info.add(addCompany);

        experiencePanel.add(experience_info);
        //end experience

        f.add(surPanel);
        f.add(namePanel);
        f.add(emailPanel);
        f.add(phonePanel);
        f.add(datePanel);
        f.add(sexPanel);
        f.add(languagePanel);
        f.add(educationPanel);
        f.add(experiencePanel);
        f.setSize(700,800);
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
