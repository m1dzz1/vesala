/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Comp
 */
public class Rec {
    private String r; //potencijalni problem ovde
    private int kID;

    public Rec(String word, int katID) {
        this.r = word;
        this.kID = katID ;
    }

    

    public String getRec() {
        return r;
    }

    public int getKategorijaID() {
        return kID;
    }
}
