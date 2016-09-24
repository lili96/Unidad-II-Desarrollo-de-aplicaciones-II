/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.disco.model;

/**
 *
 * @author LIILY´S
 */
public class Disco {
      private int  idDisco;
   private String titulo;
   private String fecha;
   private String tipoGrabacion;
   private int canciones;

   public Disco() {
        this(0,"","","",0);
    }
    public Disco(int idDisco, String titulo, String fecha, String tipoGrabacion, int canciones) {
        this.idDisco = idDisco;
        this.titulo = titulo;
        this.fecha = fecha;
        this.tipoGrabacion = tipoGrabacion;
        this.canciones = canciones;
    }

    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoGrabacion() {
        return tipoGrabacion;
    }

    public void setTipoGrabacion(String tipoGrabacion) {
        this.tipoGrabacion = tipoGrabacion;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Disco{" + "idDisco=" + idDisco + ", titulo=" + titulo + ", fecha=" + fecha + ", tipoGrabacion=" + tipoGrabacion + ", canciones=" + canciones + '}';
    }

    public void add(Disco disco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
