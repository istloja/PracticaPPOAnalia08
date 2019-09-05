/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author IST- LOJA
 */
public class Libro {
    private String Autor;
    private String Nombre;
    private String Pagina;
    private String FechaEdicion;
    private String Genero;
    

    public Libro() {
    }

    public Libro(String Autor, String Nombre, String Pagina, String FechaEdicion, String Genero) {
        this.Autor = Autor;
        this.Nombre = Nombre;
        this.Pagina = Pagina;
        this.FechaEdicion = FechaEdicion;
        this.Genero = Genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPagina() {
        return Pagina;
    }

    public void setPagina(String Pagina) {
        this.Pagina = Pagina;
    }

    public String getFechaEdicion() {
        return FechaEdicion;
    }

    public void setFechaEdicion(String FechaEdicion) {
        this.FechaEdicion = FechaEdicion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    boolean getAsistencias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getDiapublicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
