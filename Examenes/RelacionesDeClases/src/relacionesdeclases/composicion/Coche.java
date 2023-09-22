/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesdeclases.composicion;

/**
 *
 * @author gonza
 */
public class Coche {

    private String matricula = "0000AAA";
    private String marca = "Default";
    private String modelo = "Default";
    private int num_piezas = 0;
    private Pieza[] piezas;

    public Coche(String matricula, String marca, String modelo, Pieza[] piezas) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = new Pieza[num_piezas];
        this.piezas = piezas;
        
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

}
