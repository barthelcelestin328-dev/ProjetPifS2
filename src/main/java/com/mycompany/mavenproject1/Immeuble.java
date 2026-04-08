/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author cbarthel01
 */
public class Immeuble {
    private int idImmeuble;
    private ArrayListe niveau;
    private int maxX;
    private int maxY;

    public Immeuble(int idImmeuble, ArrayListe niveau, int maxX, int maxY) {
        this.idImmeuble = idImmeuble;
        this.niveau = niveau;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getIdImmeuble() {
        return idImmeuble;
    }

    public void setIdImmeuble(int idImmeuble) {
        this.idImmeuble = idImmeuble;
    }

    public ArrayListe getNiveau() {
        return niveau;
    }

    public void setNiveau(ArrayListe niveau) {
        this.niveau = niveau;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
    
    
}
