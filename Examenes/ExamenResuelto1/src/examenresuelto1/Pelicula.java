/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenresuelto1;

import static examenresuelto1.ExamenResuelto1.peliculas;

/**
 *
 * @author gonza
 */
public class Pelicula {
    private String titulo;
    private String director;
    private String publicacion;
    private String genero;
    private float precio;

    public Pelicula(String titulo, String director, String publicacion, String genero, float precio) {
        this.titulo = titulo;
        this.director = director;
        this.publicacion = publicacion;
        this.genero = genero;
        this.precio = precio;
    }
    
    
    
    public  void obtenerPelicula(){
        System.out.println("Titulo: "+ this.getTitulo());
        System.out.println("Director: " + this.getDirector());
        System.out.println("publicacion: " + this.getPublicacion());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Precio: " + this.getPrecio());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the publicacion
     */
    public String getPublicacion() {
        return publicacion;
    }

    /**
     * @param publicacion the publicacion to set
     */
    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
