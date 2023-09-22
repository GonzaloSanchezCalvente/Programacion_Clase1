/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examenprogramacion;

/**
 *
 * @author gonza
 */
public interface ExamenProgramacion {

    public int[] sumaColumnasMatriz(int m[][]);

    public void SqlToCsv(String sql, String fichero);

    public int insertaMediaTrabajos(Alumno a);

    public int secuenciaMayor(int[] v);

    public int mediaImparesDesdePrimerPar(int[] v);

    public String mayorEdad(ArrayList<Mascota> mascotas)
}
