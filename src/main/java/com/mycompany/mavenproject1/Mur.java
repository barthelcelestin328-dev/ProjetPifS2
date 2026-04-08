/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author cbarthel01
 */
public class Mur {
    private int idMur,nbMur;
    private Coin coin;

    public Mur(int idMur, Coin coin) {
        this.idMur = idMur;
        this.nbMur = nbMur;
        this.coin = coin;
    }

    
    
    public int getIdMur() {
        return idMur;
    }

    public void setIdMur(int idMur) {
        this.idMur = idMur;
    }

    public int getNbMur() {
        return nbMur;
    }

    public void setNbMur(int nbMur) {
        this.nbMur = nbMur;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }
    
    
    
}
