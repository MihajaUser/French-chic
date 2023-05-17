package models;
import java.util.ArrayList;
import java.util.List;

public class Produit {
    String nom;
    String description;
    float prix;
    boolean estDuJour;
    List<Produit> produitList = new ArrayList<Produit>();

    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public float getPrix() {
        return prix;
    }



    public void setPrix(float prix) {
        this.prix = prix;
    }



    public boolean isEstDuJour() {
        return estDuJour;
    }



    public void setEstDuJour(boolean estDuJour) {
        this.estDuJour = estDuJour;
    }



    public List<Produit> getProduitList() {
        return produitList;
    }



    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }



    public Produit getProduitDuJour(){
        for (Produit produit : produitList) {
            if(produit.isEstDuJour()){
                return produit;
            }
        }
        return null;
    }
    
    public Produit(){
        
    }
}
