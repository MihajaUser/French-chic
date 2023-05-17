package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controllers.Session;
import models.Produit;
import models.User;
import models.enums.EnumTypeEcran;

public class VueJetable {

    static Session session;
    static JFrame frame;

    public static void main(String[] args) {
        session = new Session();
        
        
        String reponse = session.traiterConnexion(EnumTypeEcran.Bureau);
        if (reponse == "ECRAN_ACCUEIL") {
            afficherEcranAccueil();
        }
        
       
    }

    private static void afficherEcranAccueil() {
        frame = new JFrame();
        frame.setTitle("French Chic - Accueil");
        frame.setSize(650, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JPanel accueilPanel = new JPanel();
        accueilPanel.setBackground(Color.WHITE);
        frame.setContentPane(accueilPanel);
        frame.setLayout(null);
        // initialiserPanel();

        JLabel title = new JLabel("French Chic");
        title.setLocation(150, 50);
        title.setSize(1000, 100);
        Font f = new Font("", Font.PLAIN, 70);
        title.setFont(f);
        title.setForeground(Color.MAGENTA);

        JLabel pseudoLabel = null;
        JLabel mdpLabel = null;

        pseudoLabel = new JLabel("Pseudo");
        pseudoLabel.setSize(120, 20);
        pseudoLabel.setLocation(150, 200);
        mdpLabel = new JLabel("Mot de passe");
        mdpLabel.setSize(120, 20);
        mdpLabel.setLocation(150, 250);

        int longueur = 200;
        int largeur = 30;

        final JTextField pseudoField;
        final JPasswordField mdpField;

        pseudoField = new JTextField();
        pseudoField.setSize(longueur, largeur);
        pseudoField.setLocation(250, 200);
        mdpField = new JPasswordField();
        mdpField.setSize(longueur, largeur);
        mdpField.setLocation(250, 250);
        JButton login = new JButton("S'identifier");
        login.setLocation(250, 300);
        login.setSize(longueur, largeur);

        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String reponse = session.identification(EnumTypeEcran.Bureau, pseudoField.getText(), mdpField.getText());
                if(reponse == "ECRAN_ACCUEIL_PERSO"){
                    frame.setVisible(false);
                    afficherAccueilPerso();
                }
            }
        });

        frame.add(title);
        frame.add(pseudoLabel);
        frame.add(mdpLabel);
        frame.add(pseudoField);
        frame.add(mdpField);
        frame.add(login);
        frame.setVisible(true);

    }
    
    
    public static void afficherAccueilPerso(){
    frame = new JFrame("French Chick");
    frame.setLocationRelativeTo(null);

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
    JLabel salutationLabel = new JLabel("Bonjour "+session.getEncours().getUsername());
    salutationLabel.setBounds(180, 130, 280, 25);
    panel.add(salutationLabel);

    JLabel produitLabel = new JLabel(
      "Le produit du jour est le " + session.getDujour().getNom()
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