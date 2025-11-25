/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ficarra.gabriele
 */
public class FlottaDiNavi {
    
    private String nome;
    ArrayList<Astronave> navi = new ArrayList<>();
    private Random rdn = new Random();
        
        public FlottaDiNavi(String nome, ArrayList<Astronave> navi){
            this.nome = nome;
            this.navi = new ArrayList<Astronave>();
            
        }
        
        void aggiungiAstronave(Astronave a){
            if(!navi.contains(a)){
                navi.add(a);
            }
        }
    
        void cercaAstronave(Astronave a){
            for(int i = 0; i < navi.size(); i++ ){
                if (navi.get(i).equals(a)) {
                    System.out.println("Astronave " + a + " trovata in posizione: " + i);
                    return;
                }   
            }
        }
       public void simulaEventoCasuale() {
           
        if (navi.isEmpty()) {
            System.out.println("Nessuna nave nella flotta. Impossibile simulare l'evento.");
            return;
        }
        
        Astronave naveScelta = navi.get(rdn.nextInt(navi.size()));
        int tipoEvento = rdn.nextInt(4);
        
        System.out.println("\n--- Evento Casuale sulla Nave: " + naveScelta.getName() + " ---");
        
        switch (tipoEvento) {
            case 0: // Danno Casuale Modulo
                if (naveScelta.getModuli().isEmpty()) { System.out.println("Nessun modulo. Evento annullato."); break; }
                
                Modulo m = naveScelta.getModuli().get(rdn.nextInt(naveScelta.getModuli().size()));
                int danno = rdn.nextInt(16) + 5; 
                System.out.println("RISULTATO: Danno a Modulo " + m.getName() + " (-" + danno + ")");
                m.danneggia(danno);
                break;
                
            case 1: // Alieni a Bordo (Danno Membro)
                if (naveScelta.getMembri().isEmpty()) { System.out.println("Nessun membro. Evento annullato."); break; }

                Membro e = naveScelta.getMembri().get(rdn.nextInt(naveScelta.getMembri().size()));
                danno = rdn.nextInt(21) + 10; 
                System.out.println("RISULTATO: Alieni a Bordo! Membro " + e.getNome() + " riceve danno (-" + danno + ")");
                e.riceviDanno(danno);
                break;
                
            case 2: // Riparazione Casuale Modulo
                if (naveScelta.getModuli().isEmpty()) { System.out.println("Nessun modulo. Evento annullato."); break; }

                m = naveScelta.getModuli().get(rdn.nextInt(naveScelta.getModuli().size()));
                int cura = rdn.nextInt(16) + 5; 
                System.out.println("RISULTATO: Riparazione su Modulo " + m.getName() + " (+" + cura + ")");
                m.ripara(cura);
                break;
                
            case 3: // Cura Casuale Membro
                if (naveScelta.getMembri().isEmpty()) { System.out.println("Nessun membro. Evento annullato."); break; }

                e = naveScelta.getMembri().get(rdn.nextInt(naveScelta.getMembri().size()));
                cura = rdn.nextInt(21) + 10; 
                System.out.println("RISULTATO: Cura su Membro " + e.getNome() + " (+" + cura + ")");
                e.cura(cura);
                break;
            
        }
        System.out.println("Stato Aggiornato: " + naveScelta.visualizzaStatoIntegrita());
    }
       
    @Override
        public String toString() {
        return "nome flotta: " + nome;
    }    
        
}