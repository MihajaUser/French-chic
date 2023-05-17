package controllers;

import models.Produit;
import models.User;
import models.enums.EnumTypeEcran;
import static models.enums.EnumTypeEcran.Bureau;
import views.VueJetable;

public class Session {
    User encours = new User();
    Produit dujour = new Produit();
    
    
    static User user;
    static Produit produit;

    public User getEncours() {
        return encours;
    }

    public void setEncours(User encours) {
        this.encours = encours;
    }

    public Produit getDujour() {
        return dujour;
    }

    public void setDujour(Produit dujour) {
        this.dujour = dujour;
    }
    
    
    
    public Session() {
        user = new User();
        produit = new Produit();
        
        Produit champooing = new Produit();
        champooing.setDescription("Ceci est un champooing");
        champooing.setNom("CHAMPS");
        champooing.setEstDuJour(true);
        champooing.setPrix(0);
        
        produit.getProduitList().add(champooing);
        
        User tommy = new User();
        tommy.setNom("ZAFITSIARENDRIKA");
        tommy.setPrenom("Tommy");
        tommy.setUsername("Tommy");
        tommy.setPassword("1234");
        
        user.getUserList().add(tommy);
    }

    public String traiterConnexion(EnumTypeEcran ecranCourant) {
        switch (ecranCourant) {
            case Bureau:
                return "ECRAN_ACCUEIL";
            default:
                return "";
        }
    }
    
    public String identification(EnumTypeEcran ecranCourant, String username, String password){
        encours = user.findUsername(username, password);
        if(encours != null && ecranCourant == Bureau){
            dujour = produit.getProduitDuJour();
            return "ECRAN_ACCUEIL_PERSO";
        }
      
        return "";
        
    }
    
    
    public void ajoutPanier(Produit produit, int quantite){
        
    }
}
