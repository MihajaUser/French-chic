package models;
import java.util.ArrayList;
import java.util.List;

public class User{
    String nom;
    String prenom;
    String username;
    String password;
    List<User> userList = new ArrayList<User>();

    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getPrenom() {
        return prenom;
    }



    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public List<User> getUserList() {
        return userList;
    }



    public void setUserList(List<User> userList) {
        this.userList = userList;
    }



    public User findUsername(String username, String password){
        for (User user : userList) {
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)){
                return user;
            }
        }
        return null;
    }
}