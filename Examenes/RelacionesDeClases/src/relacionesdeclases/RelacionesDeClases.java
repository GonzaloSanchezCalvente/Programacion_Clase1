/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesdeclases;
import relacionesdeclases.composicion.Coche;
import relacionesdeclases.composicion.Pieza;
        
/**
 *
 * @author gonza
 */
public class RelacionesDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Coche coche1 = new Coche("3333dlv", "Citroen", "C3");
        
        System.out.println(coche1.getMatricula());
        
    }
    
}
