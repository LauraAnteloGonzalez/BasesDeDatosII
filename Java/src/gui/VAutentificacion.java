/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VAutentificacion.java
 *
 * Created on 16-feb-2011, 17:52:08
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author basesdatos
 */
public class VAutentificacion extends javax.swing.JDialog {

    aplicacion.FachadaAplicacion fa;
    
    /** Creates new form VAutentificacion */
    public VAutentificacion(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa=fa;
        initComponents();
        etiquetaFallo.setVisible(false);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Mateo Bodenlle Villarino
    private void initComponents() {
        textoUsuario = new JTextField();
        btnAceptar = new JButton();
        btnCancelar = new JButton();
        etiquetaFallo = new JLabel();
        textoClave = new JTextField();
        textPane1 = new JTextPane();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autentificaci\u00f3n de usuarios");
        setModal(true);
        setName("VAutentificacion");
        setResizable(false);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                formKeyPressed(e);
            }
            @Override
            public void keyTyped(KeyEvent e) {
                formKeyTyped(e);
            }
        });
        var contentPane = getContentPane();

        //---- textoUsuario ----
        textoUsuario.setText("Usuario...");
        textoUsuario.setForeground(Color.gray);
        textoUsuario.addActionListener(e -> textoUsuarioActionPerformed(e));

        //---- btnAceptar ----
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(e -> btnAceptarActionPerformed(e));

        //---- btnCancelar ----
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(e -> btnCancelarActionPerformed(e));

        //---- etiquetaFallo ----
        etiquetaFallo.setForeground(new Color(0xff3333));
        etiquetaFallo.setText("Autentificaci\u00f3n incorrecta!");

        //---- textoClave ----
        textoClave.setText("Contrase\u00f1a...");
        textoClave.setForeground(Color.gray);
        textoClave.addActionListener(e -> textoUsuarioActionPerformed(e));

        //---- textPane1 ----
        textPane1.setFont(textPane1.getFont().deriveFont(textPane1.getFont().getStyle() | Font.ITALIC));
        textPane1.setBackground(Color.red);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(etiquetaFallo)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(textoClave, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoUsuario, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 55, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(textPane1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(textPane1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(textoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(textoClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(etiquetaFallo))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        etiquetaFallo.setVisible(false);
        if (fa.comprobarAutentificacion(textoUsuario.getText(), textoClave.getText()))
           this.dispose();
        else etiquetaFallo.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyCode()==10) System.out.printf("ENTER");
    }//GEN-LAST:event_formKeyTyped

    private void textoClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoClaveKeyTyped
        // TODO add your handling code here:
        //System.out.println(evt.getKeyChar());
        //if (evt.getKeyChar() == '\n') System.out.println("BARRAN");
        if (evt.getKeyChar() == '\n') //btnAceptarActionPerformed(null); //todo, devolver al original
            this.dispose();
    }//GEN-LAST:event_textoClaveKeyTyped

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mateo Bodenlle Villarino
    private JTextField textoUsuario;
    private JButton btnAceptar;
    private JButton btnCancelar;
    private JLabel etiquetaFallo;
    private JTextField textoClave;
    private JTextPane textPane1;
    // End of variables declaration//GEN-END:variables

}
