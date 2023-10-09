import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Employee Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(true);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.setBackground(Color.WHITE); // Set the background color of the panel

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.addActionListener(e->JOptionPane.showMessageDialog(null, "Accessing the database. Are you sure to proceed?", "Submited",JOptionPane.INFORMATION_MESSAGE));

       // ;

        panel1.add(usernameLabel);
        panel1.add(usernameField);
        panel1.add(passwordLabel);
        panel1.add(passwordField);
        panel1.add(submitButton);

        add(panel1, BorderLayout.CENTER);
    }


}
