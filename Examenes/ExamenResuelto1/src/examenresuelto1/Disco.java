/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenresuelto1;

import java.util.Date;

/**
 *
 * @author gonza
 */
public class Disco {

    private String titulo = "";
    private String autor = "";
    private String publicacion = "";
    private String genero = "";
    private float precio = 0;
    private int stock = 0;

    public Disco(String titulo, String autor, String publicacion, String genero, float precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
    }

    public void obtenerDisco() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("autor: " + this.getAutor());
        System.out.println("publicacion: " + this.publicacion);
        System.out.println("Genero: " + this.genero);
        System.out.println("Precio: " + this.precio);
        System.out.println("stock: " + this.stock);
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
