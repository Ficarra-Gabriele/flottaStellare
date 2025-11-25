/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flottastellare;
import java.util.ArrayList;

/**
 *
 * @author ironm
 */
public class FlottaStellare {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        ArrayList<Astronave> navi = new ArrayList<>();
        
        Modulo modulo1 = new Modulo("motore", 100);
        Astronave nave1 = new Astronave("nave1");
        Membro membro1 = new Membro("Federico", "Medico", 10, nave1);
        
        FlottaDiNavi flotta1 = new FlottaDiNavi("flotta1",  navi);
        flotta1.aggiungiAstronave(nave1);
        flotta1.cercaAstronave(nave1);
        
        nave1.aggiungiModulo(modulo1);
        nave1.aggiungiMembro(membro1);
        
        System.out.println(modulo1);
        System.out.println(membro1);
        System.out.println(nave1);
    }
    
}
