/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenresuelto1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ExamenResuelto1 {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    static int numDiscos = 0;
    static int numPeliculas = 0;
    static int numClientes = 0;
    static Disco discos[] = new Disco[10];
    static Pelicula peliculas[] = new Pelicula[10];
    static Cliente clientes[] = new Cliente[10];

    public static void main(String[] args) {

        //Arrays de discos y peliculas;
        boolean exit = false;

        clientes[numClientes] = new Cliente();

        System.out.println("Introduzca nombre del cliente: ");
        clientes[numClientes].setNombre(input.next());
        System.out.println("Apellidos: ");
        clientes[numClientes].setApellidos(input.next());
        System.out.println("DNI: ");
        clientes[numClientes].setDni(input.next());
        System.out.println("Telefono: ");
        clientes[numClientes].setTelefono(input.nextInt());
        System.out.println("saldo: ");
        clientes[numClientes].setSaldo(input.nextFloat());
        numClientes++;

        while (exit == false) {

            System.out.println("Aplicacion de peliculas y discos");
            System.out.println("Opciones:"
                    + "\n1: Insertar"
                    + "\n2: Obtener Informacion"
                    + "\n3: Comprar"
                    + "\n4: Salir");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1: Insertar disco");
                    System.out.println("2: Insertar Pelicula");
                    opcion = input.nextInt();
                    if (opcion == 1) {
                        insertarDisco();
                    }
                    if (opcion == 2) {
                        insertarPelicula();
                    }
                    break;

                case 2:
                    System.out.println("1: Obtener informacion Disco");
                    System.out.println("2: Obtener informacion pelicula");
                    System.out.println("3: Obtener informacion Cliente");
                    opcion = input.nextInt();

                    if (opcion == 1) {
                        System.out.println("Indice del disco: ");
                        int i = input.nextInt();
                        discos[i].obtenerDisco();
                    }

                    if (opcion == 2) {
                        System.out.println("Indice de la pelicula: ");
                        int i = input.nextInt();
                        peliculas[i].obtenerPelicula();

                    }

                    if (opcion == 3) {
                        clientes[0].obtenerCliente();
                    }
                    break;
                case 3:
                    System.out.println("1: Comprar Disco");
                    System.out.println("2: Comprar Pelicula");
                    opcion = input.nextInt();

                    if (opcion == 1) {
                        System.out.println("Introduce indice del disco");
                        int i = input.nextInt();
                        comprarDisco(i);
                    }
                    if (opcion == 2){
                        System.out.println("Introduce el indice de la pelicula");
                        int i = input.nextInt();
                        comprarPelicula(i);
                    }

                    break;
                case 4:
                    exit = true;
                    break;
            }

        }

    }

    public static void insertarDisco() {
        System.out.println("titulo: ");
        String titulo = input.next();
        System.out.println("autor: ");
        String autor = input.next();
        System.out.println("publicacion: ");
        String publicacion = input.next();
        System.out.println("genero: ");
        String genero = input.next();
        System.out.println("precio: ");
        float precio = input.nextFloat();
        System.out.println("stock: ");
        int stock = input.nextInt();
        discos[numDiscos] = new Disco(titulo, autor, publicacion, genero, precio, stock);
        numDiscos = numDiscos + 1;

    }

    public static void insertarPelicula() {
        System.out.println("titulo: ");
        String titulo = input.next();
        System.out.println("director: ");
        String director = input.next();
        System.out.println("publicacion: ");
        String publicacion = input.next();
        System.out.println("genero: ");
        String genero = input.next();
        System.out.println("precio: ");
        float precio = input.nextFloat();

        peliculas[numDiscos] = new Pelicula(titulo, director, publicacion, genero, precio);
        numPeliculas = numPeliculas + 1;
    }

    public static void comprarDisco(int i) {
        if (clientes[0].getSaldo() >= discos[i].getPrecio()) {
            clientes[0].setSaldo(clientes[0].getSaldo() - discos[i].getPrecio());
            discos[i].setStock(discos[i].getStock() - 1);
        } else {
            System.out.println("No tienes suficiente saldo");
        }
    }

    public static void comprarPelicula(int i) {
        if (clientes[0].getSaldo() >= peliculas[i].getPrecio()) {
            clientes[0].setSaldo(clientes[0].getSaldo() - peliculas[i].getPrecio());
        } else {
            System.out.println("No tienes suficiente saldo");
        }

    }

}
