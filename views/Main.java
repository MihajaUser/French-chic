package views;

import java.awt.*;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
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
    ////////////////////////////////////////////////////////////////
    JLabel salutationLabel = new JLabel("Bonjour Marie Dupond");
    salutationLabel.setBounds(180, 130, 280, 25);
    panel.add(salutationLabel);

    JLabel produitLabel = new JLabel(
      "Le produit du jour est le ''pantalon zouk'' "
    );
    produitLabel.setBounds(180, 160, 480, 25);
    panel.add(produitLabel);

    JLabel stockLabel = new JLabel("Quantité de stock : 34");
    stockLabel.setBounds(180, 180, 280, 25);
    panel.add(stockLabel);

    ////////////////////////////////////////////////////////////////

    // Create a JLabel for the username
    JLabel usernameLabel = new JLabel("Quantité");
    usernameLabel.setBounds(180, 220, 80, 25);
    panel.add(usernameLabel);

    // Create a JTextField for the username
    JTextField usernameTextField = new JTextField(20);
    usernameTextField.setBounds(260, 220, 30, 25);
    panel.add(usernameTextField);

    // Create a JButton for the login
    JButton loginButton = new JButton("Ajouter le produit du jour au panier");
    loginButton.setBounds(180, 260, 250, 25);
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
