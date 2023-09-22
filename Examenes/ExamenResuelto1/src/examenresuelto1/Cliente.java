/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenresuelto1;

import static examenresuelto1.ExamenResuelto1.clientes;
import static examenresuelto1.ExamenResuelto1.input;
import static examenresuelto1.ExamenResuelto1.numClientes;

/**
 *
 * @author gonza
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private int telefono;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String dni, int telefono, float saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public void obtenerCliente() {
        System.out.println("nombre del cliente: " + this.getNombre());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("DNI: " + this.dni);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("saldo: " + this.saldo);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
