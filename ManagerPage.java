import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ManagerPage {
    public ManagerPage() {
        JFrame f=new JFrame();//creating instance of JFrame
        try {
            f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setBackground(new Color(245, 245, 245));
        JPanel container = new JPanel(new GridLayout(3,1));

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Manager Page");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Work Sans", Font.BOLD, 50));
        title.setForeground(new Color(8, 126, 139));
        titlePanel.add(title);
        container.add(titlePanel);

        JPanel requestsPanel = new JPanel();
        Border border = BorderFactory.createTitledBorder("Requests");
        requestsPanel.setBorder(border);
        JList<Request<Job, Consumer>> requestList = new JList<>();
        requestsPanel.add(new JScrollPane(requestList));
        container.add(requestsPanel);

        JPanel buttons = new JPanel();
        GridLayout grid = new GridLayout(4,1);
        grid.setVgap(10);
        buttons.setLayout(grid);
        JButton see_resume = new JButton("See user resume");
        JButton accept = new JButton("Accept request");
        JButton deny = new JButton("Deny request");
        Border line = BorderFactory.createLineBorder(new Color(193, 131, 159), 2, true);
        see_resume.setBorder(line);
        see_resume.setBackground(new Color(245, 245, 245));
        see_resume.setFont(new Font("Work Sans", Font.PLAIN, 16));
        see_resume.setForeground(new Color(8, 126, 139));
        accept.setBorder(line);
        accept.setBackground(new Color(245, 245, 245));
        accept.setFont(new Font("Work Sans", Font.PLAIN, 16));
        accept.setForeground(new Color(8, 126, 139));
        deny.setBorder(line);
        deny.setBackground(new Color(245, 245, 245));
        deny.setFont(new Font("Work Sans", Font.PLAIN, 16));
        deny.setForeground(new Color(8, 126, 139));
        buttons.add(see_resume);
        buttons.add(accept);
        buttons.add(deny);
        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(245, 245, 245));
        backButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        backButton.setForeground(new Color(8, 126, 139));
        backButton.setBorder(line);

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
        buttons.add(backButton);
        container.add(buttons);

        JScrollPane scrPane = new JScrollPane(container);
        f.add(scrPane);
        f.setSize(700,800);
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}