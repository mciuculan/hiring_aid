import com.sun.tools.javac.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Search {
    public Search() throws IOException {
        JFrame f=new JFrame();//creating instance of JFrame
        f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5,1));
        mainPanel.setBackground(new Color(245, 245, 245));

        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(new Color(245, 245, 245));
        emptyPanel.setPreferredSize( new Dimension( 400, 10 ) );
        mainPanel.add(emptyPanel);

        JPanel emptyPanel2 = new JPanel();
        emptyPanel2.setBackground(new Color(245, 245, 245));
        emptyPanel2.setPreferredSize( new Dimension( 400, 10 ) );
        mainPanel.add(emptyPanel2);

        JLabel label = new JLabel("Search for user surname or create new user:");
        label.setFont(new Font("Work Sans", Font.BOLD, 15));
        label.setForeground(new Color(8, 126, 139));
        label.setBorder(new EmptyBorder(0,15,0,0));
        mainPanel.add(label);

        JTextField search = new JTextField();
        search.setForeground(new Color(60, 60, 60));
        search.setFont(new Font("Work Sans", Font.ITALIC, 10));
        search.setHorizontalAlignment(JTextField.CENTER);
        search.setSize(400, 10);
        mainPanel.add(search);

        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(3,1);
        grid.setVgap(10);
        buttonPanel.setLayout(grid);
        JButton searchB = new JButton("Search");
        JButton newUserB = new JButton("New User");
        JButton backB = new JButton("Back");
        Border line = BorderFactory.createLineBorder(new Color(193, 131, 159), 2, true);
        searchB.setBorder(line);
        searchB.setBackground(new Color(245, 245, 245));
        searchB.setFont(new Font("Work Sans", Font.PLAIN, 16));
        searchB.setForeground(new Color(8, 126, 139));
        newUserB.setBorder(line);
        newUserB.setBackground(new Color(245, 245, 245));
        newUserB.setFont(new Font("Work Sans", Font.PLAIN, 16));
        newUserB.setForeground(new Color(8, 126, 139));
        backB.setBorder(line);
        backB.setBackground(new Color(245, 245, 245));
        backB.setFont(new Font("Work Sans", Font.PLAIN, 16));
        backB.setForeground(new Color(8, 126, 139));
        buttonPanel.add(searchB);
        buttonPanel.add(newUserB);
        buttonPanel.add(backB);
        mainPanel.add(buttonPanel);

        searchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    for (Map.Entry<User, Integer> u : Application.getInstance().getUsers().entrySet()) {
                        if (u.getKey().getResume().getInformation().getSur_name().compareTo(search.getText()) == 0) {
                            f.dispose();
                            ProfilePage p = new ProfilePage(u.getKey());
                        }
                    }
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,
                            "User does not exist! Try adding new user.",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        newUserB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                ProfilePage p = new ProfilePage();
            }
        });
        backB.addActionListener(new ActionListener() {
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

        f.add(mainPanel);
        f.setSize(400,550);//400 width and 500 height
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setLayout(null);//using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
