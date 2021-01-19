import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class AdminPage {
    public AdminPage() {
        JFrame f=new JFrame();//creating instance of JFrame
        try {
            f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setBackground(new Color(245, 245, 245));
        JPanel container = new JPanel(new GridLayout(6,1));

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Admin Page");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Work Sans", Font.BOLD, 50));
        title.setForeground(new Color(8, 126, 139));
        titlePanel.add(title);
        container.add(titlePanel);

        JPanel usersPanel = new JPanel();
        Border border = BorderFactory.createTitledBorder("Users");
        usersPanel.setBorder(border);
        JList<User> usersList = new JList<>();
        usersPanel.add(new JScrollPane(usersList));
        container.add(usersPanel);

        JPanel companiesPanel = new JPanel();
        Border border1 = BorderFactory.createTitledBorder("Companies");
        companiesPanel.setBorder(border1);
        JList<Company> compList = new JList<>();
        companiesPanel.add(new JScrollPane(compList));
        container.add(companiesPanel);

        JPanel departmentPanel = new JPanel(new GridLayout(1,2));
        departmentPanel.setVisible(false);
        Border border2 = BorderFactory.createTitledBorder("Department");
        departmentPanel.setBorder(border2);
        JList<Department> depList = new JList<>();
        departmentPanel.add(depList);
        container.add(departmentPanel);

        compList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    JList<Company> target = (JList<Company>) me.getSource();
                    int index = target.locationToIndex(me.getPoint());
                    if (index >= 0) {
                        Company item = (Company)target.getModel().getElementAt(index);
                        departmentPanel.setVisible(true);
                        depList.setListData((Department[]) item.getDepartment_list().toArray());
                    }
                }
            }
        });
        
        JPanel container2 = new JPanel(new GridLayout(1,3));
        JPanel jobs = new JPanel();
        jobs.setVisible(false);
        Border border3 = BorderFactory.createTitledBorder("Jobs");
        jobs.setBorder(border3);
        JList<Job> jobList = new JList<>();
        jobs.add(jobList);
        container2.add(jobs);
        container.add(container2);

        depList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    JList<Department> target = (JList<Department>) me.getSource();
                    int index = target.locationToIndex(me.getPoint());
                    if (index >= 0) {
                        Department item = (Department) target.getModel().getElementAt(index);
                        jobs.setVisible(true);
                        jobList.setListData((Job[]) item.getAllJobList().toArray());
                    }
                }
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(245, 245, 245));
        backButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        backButton.setForeground(new Color(8, 126, 139));

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
        container.add(backButton);

        JScrollPane scrPane = new JScrollPane(container);
        f.add(scrPane);
        f.setSize(700,800);
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
