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
    JLabel nomProduit = new JLabel(" Redmin note 7");
    JLabel prixProduit = new JLabel("100 Euro");
    nomProduit.setBounds(100, 10, 200, 100);
    prixProduit.setBounds(450, 10, 200, 100);
    panelGauche.add(nomProduit);
    panelGauche.add(prixProduit);
    ///PARTIE DROIT/////////////////////////////////////////////////////////////
    JLabel panier = new JLabel("Panier");
    JLabel prixPanier =new JLabel("249 Euro");
    JLabel frais = new JLabel("Frais de livraison estimé");
    JLabel prixFrais =new JLabel("Gratuit");
    JLabel total = new JLabel("Total");
    JLabel prixTotal = new JLabel("249 Euro");
    JLabel tva = new JLabel("(TVA incluse)");
    JLabel economie = new JLabel("Vous écomisez 30 Eur");
    Font totalFont = total.getFont();
    total.setFont(new Font(totalFont.getName(), Font.BOLD, 20));
    Font economieFont = economie.getFont();
    JButton boutonDroit = new JButton("Valider mon panier");
    economie.setForeground(Color.GREEN);
    economie.setFont(new Font(economieFont.getName(), Font.BOLD, 14));
    panier.setBounds(10, 40, 100, 100);
    prixPanier.setBounds(225, 40, 100, 100);
    frais.setBounds(10, 90, 300, 100);
    prixFrais.setBounds(235, 90, 300, 100);
    total.setBounds(10, 150, 100, 100);
    prixTotal.setBounds(223, 150, 100, 100);
    tva.setBounds(70, 150, 100, 100);
    economie.setBounds(115, 200, 300, 100);
    boutonDroit.setBounds(40, 315, 230, 35);
    boutonDroit.setForeground(Color.WHITE);
    boutonDroit.setBackground(Color.YELLOW);
    boutonDroit.setBorder(null);
    panelDroit.add(boutonDroit);
    panelDroit.add(panier);
    panelDroit.add(prixPanier);
    panelDroit.add(frais);
    panelDroit.add(prixFrais);
    panelDroit.add(total);
    panelDroit.add(prixTotal);
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
