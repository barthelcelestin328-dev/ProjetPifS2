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
public class Coin {
    private int idCoin;
    private double cx;
    private double cy;
    
    private static ArrayList<Coin> coins = new ArrayList<>();

    public Coin(int idCoin, double cx, double cy) {
        this.idCoin = idCoin;
        this.cx = cx;
        this.cy = cy;
    }

    public int getIdCoin() {
        return idCoin;
    }

    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public static ArrayList<Coin> getCoins() {
        return coins;
    }

    public static void setCoins(ArrayList<Coin> coins) {
        Coin.coins = coins;
    }
    
    
           
}
