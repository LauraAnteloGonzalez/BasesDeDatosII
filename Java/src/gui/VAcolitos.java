/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VLibro.java
 *
 * Created on 16-feb-2011, 18:17:07
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import java.util.ArrayList;

/**
 *
 * @author basesdatos
 */
public class VAcolitos extends javax.swing.JDialog {

    private VPrincipal padre;
    private aplicacion.FachadaAplicacion fa;

    public VAcolitos(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa=fa;
        initComponents();
        padre=(VPrincipal) parent;

        /*ModeloListaStrings mListaRC=new ModeloListaStrings();
        lstRestoCategorias.setModel(mListaRC);
        mListaRC.setElementos(restoCategorias);
        if (mListaRC.getSize()>0) {
            lstRestoCategorias.setSelectedIndex(0);
            btnDerecha.setEnabled(true);
        } else btnDerecha.setEnabled(false); */
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Sara Castro
    private void initComponents() {
        txtAlias = new JTextField();
        txtInfluencia = new JTextField();
        txtNombre = new JTextField();
        txtTelefono = new JTextField();
        txtNombreDivision = new JTextField();
        txtJefe = new JTextField();
        imagenAcolito = new JLabel();
        txtDireccion = new JTextField();
        txtAltaDivision = new JTextField();
        labelAcolitos = new JLabel();
        scrollDescripcion = new JScrollPane();
        txtDescripcion = new JTextArea();
        btnGuardar = new JButton();
        scrollPane3 = new JScrollPane();
        tablaEventos = new JTable();
        btnAnadir = new JButton();
        bntEliminar = new JButton();
        btnVolver = new JButton();
        scrollAcolitos = new JScrollPane();
        listaAcolitos = new JList();
        btnGuardar2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ac\u00f3litos");
        setResizable(false);
        var contentPane = getContentPane();

        //---- txtAlias ----
        txtAlias.setText("Alias...");

        //---- txtInfluencia ----
        txtInfluencia.setEditable(false);
        txtInfluencia.setText("Influencia...");

        //---- txtNombre ----
        txtNombre.setEditable(false);
        txtNombre.setText("Nombre completo...");

        //---- txtTelefono ----
        txtTelefono.setEditable(false);
        txtTelefono.setText("Tel\u00e9fono...");

        //---- txtNombreDivision ----
        txtNombreDivision.setEditable(false);
        txtNombreDivision.setText("Nombre divisi\u00f3n...");

        //---- txtJefe ----
        txtJefe.setEditable(false);
        txtJefe.setText("Jefe a cargo...");

        //---- imagenAcolito ----
        imagenAcolito.setText("(Imagen del ac\u00f3lito)");

        //---- txtDireccion ----
        txtDireccion.setEditable(false);
        txtDireccion.setText("Direcci\u00f3n...");

        //---- txtAltaDivision ----
        txtAltaDivision.setText("Alta divisi\u00f3n...");

        //---- labelAcolitos ----
        labelAcolitos.setText("LISTA DE AC\u00d3LITOS");
        labelAcolitos.setFont(new Font("Inter", Font.BOLD, 14));

        //======== scrollDescripcion ========
        {

            //---- txtDescripcion ----
            txtDescripcion.setText("Descripci\u00f3n...");
            txtDescripcion.setFont(new Font("Inter", Font.PLAIN, 13));
            scrollDescripcion.setViewportView(txtDescripcion);
        }

        //---- btnGuardar ----
        btnGuardar.setText("Guardar edici\u00f3n");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(tablaEventos);
        }

        //---- btnAnadir ----
        btnAnadir.setText("A\u00d1ADIR AC\u00d3LITO");
        btnAnadir.setBackground(new Color(0x00cc66));

        //---- bntEliminar ----
        bntEliminar.setText("ELIMINAR");
        bntEliminar.setBackground(new Color(0x990000));

        //---- btnVolver ----
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(e -> btnVolver(e));

        //======== scrollAcolitos ========
        {
            scrollAcolitos.setViewportView(listaAcolitos);
        }

        //---- btnGuardar2 ----
        btnGuardar2.setText("Guardar edici\u00f3n");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addComponent(txtInfluencia)
                                                                        .addComponent(txtAlias))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addComponent(txtTelefono, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                                                        .addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(scrollDescripcion, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(imagenAcolito, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtNombreDivision, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                        .addComponent(txtDireccion, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtAltaDivision, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                                                        .addComponent(txtJefe, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                                                .addGap(25, 25, 25)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(scrollAcolitos, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                .addComponent(labelAcolitos)
                                                                .addGap(63, 63, 63))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(btnVolver)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(bntEliminar, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(btnGuardar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnGuardar2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnAnadir, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(28, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(imagenAcolito, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAlias, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtInfluencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtNombreDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtJefe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAltaDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(scrollDescripcion, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addContainerGap(62, Short.MAX_VALUE)
                                                .addComponent(labelAcolitos)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scrollAcolitos, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bntEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGuardar2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAnadir))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    /*private void btnNuevoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAutorActionPerformed
        // TODO add your handling code here:
     ModeloListaStrings ma;
     ma=(ModeloListaStrings) lstAutores.getModel();

     if ((textoNuevoAutor.getText()!=null) && !(textoNuevoAutor.getText().isEmpty())) {
         ma.nuevoElemento(textoNuevoAutor.getText());
         lstAutores.setSelectedIndex(ma.getSize()-1);
         btnBorrarAutor.setEnabled(true);
     }
    }//GEN-LAST:event_btnNuevoAutorActionPerformed

    private void btnBorrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAutorActionPerformed
        // TODO add your handling code here:
     ModeloListaStrings ma;
     ma=(ModeloListaStrings) lstAutores.getModel();

     ma.borrarElemento(lstAutores.getSelectedIndex());
     if (ma.getSize()==0) btnBorrarAutor.setEnabled(false);
     else lstAutores.setSelectedIndex(0);
    }//GEN-LAST:event_btnBorrarAutorActionPerformed

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
        // TODO add your handling code here:
        Libro l;
        l=new Libro(idLibro, textoTitulo.getText(), textoIsbn.getText(), textoEditorial.getText(),
                    Integer.parseInt(textoPaginas.getText()), textoAno.getText());
        ModeloListaStrings ma= (ModeloListaStrings)lstAutores.getModel();
        l.setAutores(ma.getElementos());
        idLibro=fa.actualizarLibro(l);
        textoId.setText(idLibro.toString());
        btnActualizarCategoriasLibro.setEnabled(true);
        btnActualizarEjemplaresLibro.setEnabled(true);
        btnBorrarLibro.setEnabled(true);
    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void btnActualizarCategoriasLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCategoriasLibroActionPerformed
        // TODO add your handling code here:
      ModeloListaStrings ma= (ModeloListaStrings)lstCategoriasLibro.getModel();
      fa.actualizarCategoriasLibro(idLibro, ma.getElementos());
    }//GEN-LAST:event_btnActualizarCategoriasLibroActionPerformed

    private void btnDevolverEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverEjemplarActionPerformed
        // TODO add your handling code here:
        fa.devolver(((ModeloTablaEjemplares)tablaEjemplares.getModel()).obtenerEjemplar(tablaEjemplares.getSelectedRow()));
        ((ModeloTablaEjemplares)tablaEjemplares.getModel()).setFilas(libro.getEjemplares());
    }//GEN-LAST:event_btnDevolverEjemplarActionPerformed*/

    /////////////////////// FUNCIONES DE LOS BOTONES ///////////////////////

    /* btnVolver: Vuelve a la ventana principal del programa */
    private void btnVolver(ActionEvent e) {
        // TODO add your code here
        this.dispose();
    }

    /* btnEliminar: Elimina a un acólito de la base de datos */
    private void btnEliminar(ActionEvent e) {
        // TODO add your code here
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sara Castro
    private JTextField txtAlias;
    private JTextField txtInfluencia;
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtNombreDivision;
    private JTextField txtJefe;
    private JLabel imagenAcolito;
    private JTextField txtDireccion;
    private JTextField txtAltaDivision;
    private JLabel labelAcolitos;
    private JScrollPane scrollDescripcion;
    private JTextArea txtDescripcion;
    private JButton btnGuardar;
    private JScrollPane scrollPane3;
    private JTable tablaEventos;
    private JButton btnAnadir;
    private JButton bntEliminar;
    private JButton btnVolver;
    private JScrollPane scrollAcolitos;
    private JList listaAcolitos;
    private JButton btnGuardar2;
    // End of variables declaration//GEN-END:variables

}