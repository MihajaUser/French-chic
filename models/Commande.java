import java.util.Date;
import java.util.List;

public class Commande {
    Date dateCommande;
    float total;
    List<LigneCommande> ligne;
    List<Commande> commandeList;

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }



    public float getTotal() {
        return total;
    }



    public void setTotal(float total) {
        this.total = total;
    }



    public List<LigneCommande> getLigne() {
        return ligne;
    }



    public void setLigne(List<LigneCommande> ligne) {
        this.ligne = ligne;
    }



    public List<Commande> getCommandeList() {
        return commandeList;
    }



    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }



    public void addProduit(Produit produit, float quantite){
        
    }
}
