/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

import java.util.ArrayList;

/**
 *
 * @author ficarra.gabriele
 */
public class Astronave {
    
    private String name;
    ArrayList<Modulo> moduli = new ArrayList<>();
    ArrayList<Membro> membri = new ArrayList<>(); 
    private Modulo primoModulo;
    
    public Astronave(String nome){
        this.name = nome;
        this.moduli = new ArrayList<Modulo>();
    }
    
    public String getName() { return name; }
    public ArrayList<Modulo> getModuli() { return moduli; }
    public ArrayList<Membro> getMembri() { return membri; }
    
    void aggiungiModulo(Modulo m){
        
            if(!moduli.contains(m)){
                moduli.add(m);
            }
        }
    void aggiungiMembro(Membro e){
        if(!membri.contains(e)){
            membri.add(e);
            e.setAstronave(this);
        }
    }
    
    public String visualizzaStatoIntegrita() {
    return "Stato integrità: " + membri.size() + " membri e " + moduli.size() + " moduli a bordo.";
}
    
    @Override
        public String toString() {
        return "nome: " + name + " personale: " + membri  + " moduli: " + moduli;
    }
    
}