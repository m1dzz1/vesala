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
   
    public MojPanel() {
        initComponents();
        
    }
    
    @Override
    public void paint(Graphics g){ 
        int x1=10,x2=30,y1=10,y2=10;
        for(int i=0;i<brojSlova;i++){
            x1+=50;
            x2+=50;
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public void setBrojSlova(int brojSlova) {
        this.brojSlova = brojSlova;
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
