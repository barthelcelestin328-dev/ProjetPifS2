/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author cbarthel01
 */
public class Niveau {
    private int idNiveau;
    private int nbreBatiments;
    private float hauteurPlafond;

    public Niveau(int idNiveau, int nbreBatiments, float hauteurPlafond) {
        this.idNiveau = idNiveau;
        this.nbreBatiments = nbreBatiments;
        this.hauteurPlafond = hauteurPlafond;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public int getNbreBatiments() {
        return nbreBatiments;
    }

    public void setNbreBatiments(int nbreBatiments) {
        this.nbreBatiments = nbreBatiments;
    }

    public float getHauteurPlafond() {
        return hauteurPlafond;
    }

    public void setHauteurPlafond(float hauteurPlafond) {
        this.hauteurPlafond = hauteurPlafond;
    }
    
    
    
}
