package views;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

  public Main() {
    // Configurer la fenêtre principale
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 500);
    setLocationRelativeTo(null); // Centrer la fenêtre
    setBackground(Color.GRAY);
    setTitle("French chick");
    setLayout(new BorderLayout());
    setResizable(false);

    // Créer les deux panneaux
    JPanel panelGauche = new JPanel(null); // Utiliser null pour le gestionnaire de disposition
    panelGauche.setPreferredSize(new Dimension(630, 300));
    panelGauche.setBackground(Color.WHITE);

    JPanel panelDroit = new JPanel(null);
    panelDroit.setPreferredSize(new Dimension(300, 300));
    panelDroit.setBackground(Color.WHITE);

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
    ///PARTIE GAUCHE /////////////////////////////////////////////////////////////
    // Ajouter un bouton et une zone de saisie à chaque panneau
    JButton boutonGauche = new JButton("Bouton Gauche");
    boutonGauche.setBounds(250, 400, 180, 25);
    JTextField saisieGauche = new JTextField(20);
    panelGauche.add(boutonGauche);
    panelGauche.add(saisieGauche);

    ///PARTIE DROIT/////////////////////////////////////////////////////////////
    JLabel panier = new JLabel("Panier");
    JLabel frais = new JLabel("Frais de livraison estimé");
    JLabel total = new JLabel("Total");
    JLabel tva = new JLabel("(TVA incluse)");
    JLabel economie = new JLabel("Vous écomisez 30 Eur");
    Font totalFont = total.getFont();
    total.setFont(new Font(totalFont.getName(), Font.BOLD, 20));
    Font economieFont = economie.getFont();
    JButton boutonDroit = new JButton("Valider mon panier");
    economie.setFont(new Font(economieFont.getName(), Font.BOLD, 14));
    panier.setBounds(10, 40, 100, 100);
    frais.setBounds(10, 90, 300, 100);
    total.setBounds(10, 150, 100, 100);
    tva.setBounds(70, 150, 100, 100);
    economie.setBounds(115, 200, 300, 100);
    boutonDroit.setBounds(40, 315, 230, 35);
    boutonDroit.setForeground(Color.WHITE);
    boutonDroit.setBackground(Color.YELLOW);
    boutonDroit.setBorder(null);
    panelDroit.add(boutonDroit);
    panelDroit.add(panier);
    panelDroit.add(frais);
    panelDroit.add(total);
    panelDroit.add(tva);
    panelDroit.add(economie);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Main fenetre = new Main();
      fenetre.setVisible(true);
    });
  }
}
