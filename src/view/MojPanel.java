/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Graphics;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseUpravljac;
import model.Rec;

/**
 *
 * @author User
 */
public class MojPanel extends javax.swing.JPanel {

    private int brojSlova;

    /**
     * Creates new form MojPanel
     */
    private int brojPogresnihPokusaja;
    
    
    public MojPanel() {
        initComponents();       
    brojPogresnihPokusaja = 0;        
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
        int x1=10,x2=30,y1=10,y2=10;
        for(int i=0;i<brojSlova;i++){
            x1+=50;
            x2+=50;
            g.drawLine(x1, y1, x2, y2); 
            
            g.drawLine(50, 50, 50, 10); // vertikalna linija
        g.drawLine(45, 50, 125, 50); // horizontalna linija
        g.drawLine(125, 50, 125, 100); // linija za vrat
        g.drawLine(90, 100, 160, 100); // linija za gornji deo tela
        
        if (brojPogresnihPokusaja >= 1)
            g.drawOval(115, 100, 50, 50); // glava
        if (brojPogresnihPokusaja >= 2)
            g.drawLine(140, 150, 140, 230); // telo
        if (brojPogresnihPokusaja >= 3)
            g.drawLine(140, 160, 100, 190); // leva ruka
        if (brojPogresnihPokusaja >= 4)
            g.drawLine(140, 160, 180, 190); // desna ruka
        if (brojPogresnihPokusaja >= 5)
            g.drawLine(140, 230, 100, 260); // leva noga
        if (brojPogresnihPokusaja >= 6)
            g.drawLine(140, 230, 180, 260); // desna noga
        }
    }

    public void setBrojSlova(int brojSlova) {
        this.brojSlova = brojSlova;
    }
    
    public void povecajPogresnePokusaje() {
        brojPogresnihPokusaja++;
        repaint(); // Ponovno iscrtaj komponentu kako bi se prikazale promene
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    void updateWordDisplay(char foundChar, char slovo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
