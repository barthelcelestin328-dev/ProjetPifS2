/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author cbarthel01
 */
public class Piece {
    private int idPiece;
    private String forme, usage ;
    private Plafond plafond;
    private Mur mur;
    private Sol sol;
    private float hauteur;

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Plafond getPlafond() {
        return plafond;
    }

    public void setPlafond(Plafond plafond) {
        this.plafond = plafond;
    }

    public Mur getMur() {
        return mur;
    }

    public void setMur(Mur mur) {
        this.mur = mur;
    }

    public Sol getSol() {
        return sol;
    }

    public void setSol(Sol sol) {
        this.sol = sol;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public Piece(int idPiece, String forme, String usage, Plafond plafond, Mur mur, Sol sol, float hauteur) {
        this.idPiece = idPiece;
        this.forme = forme;
        this.usage = usage;
        this.plafond = plafond;
        this.mur = mur;
        this.sol = sol;
        this.hauteur = hauteur;
    }
    
    
    
}
