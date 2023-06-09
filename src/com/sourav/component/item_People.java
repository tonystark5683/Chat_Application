/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sourav.component;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

/**
 *
 * @author Procastinator
 */
public class item_People extends javax.swing.JPanel {

    /**
     * Creates new form item_People
     * @param name
     */
    public item_People(String name) {
        initComponents();
        lb.setText(name);
        init();
    }
    private void init(){
        addMouseListener(new MouseAdapter(){
            public void mouseEnetered(MouseEvent me){
                setBackground(new Color(230,230,230));
            }
            @Override
            public void mouseExited(MouseEvent me){
                setBackground(new Color(242,242,242));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new com.sourav.swing.ImageAvatar();
        imageAvatar2 = new com.sourav.swing.ImageAvatar();
        imageAvatar3 = new com.sourav.swing.ImageAvatar();
        lb = new javax.swing.JLabel();

        imageAvatar3.setBorderSize(0);
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/sourav/icon/profile.png"))); // NOI18N

        lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.sourav.swing.ImageAvatar imageAvatar1;
    private com.sourav.swing.ImageAvatar imageAvatar2;
    private com.sourav.swing.ImageAvatar imageAvatar3;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
