package views;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

  public Main() {
    // Configurer la fenêtre principale
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 800);
    setLocationRelativeTo(null); // Centrer la fenêtre
    setBackground(Color.GRAY);
    setLayout(new BorderLayout());
    setResizable(false);

    // Créer les deux panneaux
    JPanel panelGauche = new JPanel();
    panelGauche.setPreferredSize(new Dimension(630, 300));
    panelGauche.setBackground(Color.BLUE);

    JPanel panelDroit = new JPanel();
    panelDroit.setPreferredSize(new Dimension(300, 300));
    panelDroit.setBackground(Color.RED);

    // Ajouter les panneaux à la fenêtre
    add(panelGauche, BorderLayout.WEST);
    add(panelDroit, BorderLayout.EAST);

    // Ajouter des marges/padding autour des panneaux
    Insets insets = new Insets(20, 20, 20, 20);
    panelGauche.setBorder(BorderFactory.createEmptyBorder());
    panelDroit.setBorder(BorderFactory.createEmptyBorder());
    ((JPanel) getContentPane()).setBorder(
        BorderFactory.createEmptyBorder(
          insets.top,
          insets.left,
          insets.bottom,
          insets.right
        )
      );

    // Ajouter un bouton et une zone de saisie à chaque panneau
    JButton boutonGauche = new JButton("Bouton Gauche");
   boutonGauche.setBounds(250, 400, 180, 25);
    JTextField saisieGauche = new JTextField(20);
    panelGauche.add(boutonGauche);
    panelGauche.add(saisieGauche);

    JButton boutonDroit = new JButton("Bouton Droit");
    JTextField saisieDroit = new JTextField(20);
    panelDroit.add(boutonDroit);
    panelDroit.add(saisieDroit);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Main fenetre = new Main();
      fenetre.setVisible(true);
    });
  }
}
