import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Menu {

    public static void main(String[] args) throws IOException {
        JFrame f=new JFrame();//creating instance of JFrame
        f.setIconImage(ImageIO.read(new File("./src/logo.png")));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5,1));
        mainPanel.setBackground(new Color(245, 245, 245));

        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(new Color(245, 245, 245));
        emptyPanel.setPreferredSize( new Dimension( 400, 10 ) );
        mainPanel.add(emptyPanel);

        ImageIcon icon = new ImageIcon(new ImageIcon("./src/logo.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel logo = new JLabel(icon, JLabel.CENTER);
        mainPanel.add(logo);

        JLabel login = new JLabel("Log in as:");
        login.setFont(new Font("Work Sans", Font.BOLD, 20));
        login.setForeground(new Color(8, 126, 139));
        login.setBorder(new EmptyBorder(0,15,0,0));
        mainPanel.add(login);

        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(3,1);
        grid.setVgap(10);
        buttonPanel.setLayout(grid);
        JButton adminButton = new JButton("Admin");
        JButton managerButton = new JButton("Manager");
        JButton userButton = new JButton("User");
        Border line = BorderFactory.createLineBorder(new Color(193, 131, 159), 2, true);
        adminButton.setBorder(line);
        adminButton.setBackground(new Color(245, 245, 245));
        adminButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        adminButton.setForeground(new Color(8, 126, 139));
        managerButton.setBorder(line);
        managerButton.setBackground(new Color(245, 245, 245));
        managerButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        managerButton.setForeground(new Color(8, 126, 139));
        userButton.setBorder(line);
        userButton.setBackground(new Color(245, 245, 245));
        userButton.setFont(new Font("Work Sans", Font.PLAIN, 16));
        userButton.setForeground(new Color(8, 126, 139));
        adminButton.setSize(300, 20);
        buttonPanel.add(adminButton);
        buttonPanel.add(managerButton);
        buttonPanel.add(userButton);
        mainPanel.add(buttonPanel);

        f.add(mainPanel);
        f.setSize(400,550);//400 width and 500 height
        f.setResizable(false);
        f.setVisible(true);//making the frame visible
        f.setLayout(null);//using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
