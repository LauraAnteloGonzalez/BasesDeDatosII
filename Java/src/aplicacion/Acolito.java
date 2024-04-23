package aplicacion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author basesdatos
 */
public class Acolito {
    private String alias;
    private String contraseña;
    private String fechaingreso;
    private String nombreCompleto;
    private Integer dinero;
    private Integer telefono;
    private String direccion;
    private int influencia;
    private TipoAcolito tipo;
    private boolean primeraEntrada;

   public Acolito(String alias, String contraseña, String nombreCompleto, String direccion, int influencia, TipoAcolito tipo){
    this.alias = alias;
    this.contraseña = contraseña;
    this.nombreCompleto = nombreCompleto;
    this.direccion=direccion;
    this.influencia = influencia;
    this.tipo=tipo;
   }

    public String getAlias() {
        return alias;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getInfluencia() {
        return influencia;
    }

    public TipoAcolito getTipo() {
        return tipo;
    }

    public Integer getDinero() {
        return dinero;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public boolean isPrimeraEntrada() {
        return primeraEntrada;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setInfluencia(int influencia) {
        this.influencia = influencia;
    }

    public void setTipo(TipoAcolito tipo) {
        this.tipo = tipo;
    }

    public void setPrimeraEntrada(boolean primeraEntrada) {
        this.primeraEntrada = primeraEntrada;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setFechaingreso(String fechaingreso){
       this.fechaingreso = fechaingreso;
    }

}
