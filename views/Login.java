package views;

import java.awt.*;
import javax.swing.*;

public class Login {

  public Login() {
    JFrame frame = new JFrame("French Chick");

    // Create a JPanel
    JPanel panel = new JPanel();

    // Set the layout for the panel
    panel.setLayout(null);

    JLabel FrenchChicLabel = new JLabel("French Chick");
    FrenchChicLabel.setBounds(170, -20, 300, 200);
    FrenchChicLabel.setForeground(Color.MAGENTA);
    // Set the font size of the label
    Font labelFont = FrenchChicLabel.getFont();
    FrenchChicLabel.setFont(new Font(labelFont.getName(), Font.BOLD, 44));
    panel.add(FrenchChicLabel);

    // Create a JLabel for the username
    JLabel usernameLabel = new JLabel("Pseudo:");
    usernameLabel.setBounds(170, 180, 80, 25);

    panel.add(usernameLabel);

    // Create a JTextField for the username
    JTextField usernameTextField = new JTextField(20);
    usernameTextField.setBounds(250, 180, 180, 25);
    panel.add(usernameTextField);

    // Create a JLabel for the password
    JLabel passwordLabel = new JLabel("Mot de passe :");
    passwordLabel.setBounds(150, 220, 180, 25);
    panel.add(passwordLabel);

    // Create a JPasswordField for the password
    JPasswordField passwordField = new JPasswordField(20);
    passwordField.setBounds(250, 220, 180, 25);
    panel.add(passwordField);
    // Create a JButton for the login
    JButton loginButton = new JButton("S' identifier ");
    loginButton.setBounds(60, 260, 150, 25);
    panel.add(loginButton);

    // Add the panel to the frame
    frame.getContentPane().add(panel);

    // Set the size of the frame
    frame.setSize(600, 400);

    // Set the default close operation
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the frame visibility
    frame.setVisible(true);
  }
}
