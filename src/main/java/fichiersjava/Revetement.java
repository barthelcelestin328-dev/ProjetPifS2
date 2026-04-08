/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichiersjava;

/**
 *
 * @author cbarthel01
 */
public class Revetement {
    private int idRevetement;
    private String typeRevetement;
    private double prix;

    public Revetement(int idRevetement, String typeRevetement, double prix) {
        this.idRevetement = idRevetement;
        this.typeRevetement = typeRevetement;
        this.prix = prix;
    }

    public int getIdRevetement() {
        return idRevetement;
    }

    public void setIdRevetement(int idRevetement) {
        this.idRevetement = idRevetement;
    }

    public String getTypeRevetement() {
        return typeRevetement;
    }

    public void setTypeRevetement(String typeRevetement) {
        this.typeRevetement = typeRevetement;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
