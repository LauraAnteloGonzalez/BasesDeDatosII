/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VUsuarios.java
 *
 * Created on 16-feb-2011, 18:17:07
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import aplicacion.Libro;
import aplicacion.Ejemplar;
import aplicacion.Categoria;
/**
 *
 * @author basesdatos
 */
public class VCategorías extends javax.swing.JDialog {

     private VPrincipal padre;
     private aplicacion.FachadaAplicacion fa;
     private ModeloListaCategorias mLC;

    /** Creates new form VLibro */
    public VCategorías(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa=fa;
        initComponents();
        mLC = new ModeloListaCategorias();
        mLC.setContent(fa.obtenerCategorias());
        jList1.setModel(mLC);
        btnBorrar.setEnabled(false);
        jTextField1.setEnabled(true);

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
        btnAñadir = new JButton();
        btnSalir = new JButton();
        btnBorrar = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jList1 = new JList<>();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gesti\u00f3n de categor\u00edas");
        setResizable(false);
        var contentPane = getContentPane();

        //---- btnAñadir ----
        btnAñadir.setText("A\u00f1adir");
        btnAñadir.addActionListener(e -> btnAñadirActionPerformed(e));

        //---- btnSalir ----
        btnSalir.setText("Salir");
        btnSalir.addActionListener(e -> btnSalirActionPerformed(e));

        //---- btnBorrar ----
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(e -> btnBorrarActionPerformed(e));

        //======== jScrollPane1 ========
        {

            //---- jTextPane1 ----
            jTextPane1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    jTextPane1KeyTyped(e);
                }
            });
            jScrollPane1.setViewportView(jTextPane1);
        }

        //---- jTextField1 ----
        jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jTextField1KeyTyped(e);
            }
        });

        //---- jLabel1 ----
        jLabel1.setText("Nombre");

        //---- jLabel2 ----
        jLabel2.setFont(new Font("sansserif", Font.BOLD, 13));
        jLabel2.setText("Descripci\u00f3n");

        //---- jLabel3 ----
        jLabel3.setFont(new Font("sansserif", Font.BOLD, 13));
        jLabel3.setText("Categor\u00edas");

        //======== jScrollPane2 ========
        {

            //---- jList1 ----
            jList1.setModel(new ModeloListaCategorias());
            jList1.setFont(new Font("sansserif", Font.PLAIN, 14));
            jList1.setToolTipText("");
            jList1.setAlignmentX(5.0F);
            jList1.addListSelectionListener(e -> jList1ValueChanged(e));
            jScrollPane2.setViewportView(jList1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jScrollPane2)
                            .addGap(18, 18, 18))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(btnAñadir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrar))
                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
                            .addGap(12, 12, 12))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAñadir)
                                .addComponent(btnBorrar))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir)))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        //re.buscarLibros();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        btnBorrar.setEnabled(false);

        if (jTextField1.getText()!=null){
            System.out.println(jTextField1.getText());
            if (jList1.getSelectedIndex() == -1){
            fa.nuevaCategoria(new Categoria(jTextField1.getText(),jTextPane1.getText()));
            mLC.setContent(fa.obtenerCategorias());
            }
        }
        btnAñadir.setText("Añadir");
        jTextPane1.setText("");
        jTextPane1.setEditable(true);
        jTextField1.setEditable(true);
        jTextField1.setText("");
        
        mLC = new ModeloListaCategorias(); //Recarga la tabla
        mLC.setContent(fa.obtenerCategorias());
        jList1.setModel(mLC);
        btnAñadir.setEnabled(false);
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (jList1.getSelectedIndex() != -1){
            fa.borrarCategoria(jList1.getSelectedValue());
            
            btnAñadir.setText("Añadir");
            jTextPane1.setText("");
            jTextPane1.setEditable(true);
            jTextField1.setEditable(true);
            jTextField1.setText("");

            mLC = new ModeloListaCategorias(); //Recarga la tabla
            mLC.setContent(fa.obtenerCategorias());
            jList1.setModel(mLC);
            
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        jTextPane1.setText(jList1.getSelectedValue().getDescripcion());
        jTextField1.setText(jList1.getSelectedValue().getNombre());
        btnAñadir.setText("Añadir Nuevo");
        jTextPane1.setEditable(false);
        jTextField1.setEditable(false);
        btnBorrar.setEnabled(true);
        btnAñadir.setEnabled(true);
    }//GEN-LAST:event_jList1ValueChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        /*// TODO add your handling code here:*/
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') btnAñadirActionPerformed(null);
    }//GEN-LAST:event_jTextPane1KeyTyped

      
   
    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mateo Bodenlle Villarino
    private JButton btnAñadir;
    private JButton btnSalir;
    private JButton btnBorrar;
    private JScrollPane jScrollPane1;
    private JTextPane jTextPane1;
    private JTextField jTextField1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane2;
    private JList<Categoria> jList1;
    // End of variables declaration//GEN-END:variables

}
