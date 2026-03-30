/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author cbarthel01
 */
public class Appartement {
    private int idAppart;
    private Piece piece;

    public Appartement(int idAppart, Piece piece) {
        this.idAppart = idAppart;
        this.piece = piece;
    }

    public int getIdAppart() {
        return idAppart;
    }

    public void setIdAppart(int idAppart) {
        this.idAppart = idAppart;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    
}
