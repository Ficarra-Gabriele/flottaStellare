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
        
        FlottaDiNavi adeptusmechanicus = new FlottaDiNavi("adeptusmechanicus" ,navi);
        
        Astronave arkmechanicus = new Astronave("arkmechanicus");
        Astronave mechanicuscruiser = new Astronave("mechanicuscruiser");
        Astronave lathecruiser = new Astronave("lathecruiser");
        
        Modulo scudi = new Modulo("scudo", 200);
        Modulo ponteDiBordo = new Modulo("ponteDiBordo", 50);
        Modulo motore = new Modulo("motore", 100);
        
        adeptusmechanicus.aggiungiAstronave(arkmechanicus);
        adeptusmechanicus.aggiungiAstronave(mechanicuscruiser);
        adeptusmechanicus.aggiungiAstronave(lathecruiser);
       
        arkmechanicus.aggiungiModulo(scudi);
        mechanicuscruiser.aggiungiModulo(ponteDiBordo);
        lathecruiser.aggiungiModulo(motore);
        
        Membro ludovico = new Membro("Ludovico", "capitano", 10, arkmechanicus );
        
        System.out.println(scudi);
        System.out.println(ponteDiBordo);
        System.out.println(motore);
        System.out.println(arkmechanicus);
        System.out.println(mechanicuscruiser);
        System.out.println(lathecruiser);
        System.out.println(ludovico);
        
        adeptusmechanicus.simulaEventoCasuale();
        
        System.out.println();
    }
    
}
