/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
/**
 *
 * @author cbarthel01
 */
public class Niveau {
    private int idNiveau;
    private int nbreAppartements;
    private float hauteurPlafond;
    private ArrayList<Appartement> appartements = new ArrayList<Appartement>();
    private Immeuble parentImmeuble;

    public Niveau(int idNiveau, int nbreAppartements, float hauteurPlafond, Immeuble parentImmeuble) {
        this.idNiveau = idNiveau;
        this.nbreAppartements = nbreAppartements;
        this.hauteurPlafond = hauteurPlafond;
        this.parentImmeuble = parentImmeuble;
    }

    public int getIdNiveau() {return idNiveau;}
    public void setIdNiveau(int idNiveau) {this.idNiveau = idNiveau;}
    public int getnbreAppartements() {return nbreAppartements;}
    public void set(int nbreAppartements) {this.nbreAppartements = nbreAppartements;}
    public float getHauteurPlafond() {return hauteurPlafond;}
    public void setHauteurPlafond(float hauteurPlafond) {this.hauteurPlafond = hauteurPlafond;}
    
    
    
}
