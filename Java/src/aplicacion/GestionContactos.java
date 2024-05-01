/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGui;
import gui.VContactos;

import java.util.ArrayList;

/**
 *
 * @author basesdatos
 */
public class GestionContactos {

    FachadaGui fgui;
    FachadaBaseDatos fbd;


    public GestionContactos(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }

/*
    public java.util.List<Contacto>  consultarContactos(String pseudonimo, String nombre){
        return fbd.consultarContacto(pseudonimo,nombre);
    }
 */

    /**
     * Obtener una lista de todos los contactos de un acólito (con y sin tratos)
     */
    public ArrayList<Contacto> obtenerContactos(Acolito acolito){
        return fbd.obtenerContactos(acolito);
    }

    public void rellenarDatos(VContactos vc){
        fgui.rellenarDatos(vc);
    }

    public void actualizarContacto(String pseudonimo, String nombre, String telefono, String descripcion){
        fbd.actualizarContacto(pseudonimo, nombre, telefono, descripcion);
    }

    public void eliminarContacto(String pseudonimo){
        fbd.eliminarContacto(pseudonimo);
    }

    public ArrayList<Trato> obtenerTratos(Acolito acolito, Contacto contacto){
        return fbd.obtenerTratos(acolito, contacto);
    }

    public boolean hayTratos(String acolito, String contacto){
        return fbd.hayTratos(acolito, contacto);
    }
}
