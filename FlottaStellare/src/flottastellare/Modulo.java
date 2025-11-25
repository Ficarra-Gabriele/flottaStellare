/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

/**
 *
 * @author ironm
 */
public class Modulo {
    private boolean funzionante;
    private String nomeModulo;
    private int integrità;
    
    public Modulo(String nomeModulo, int integrità){
        this.nomeModulo = nomeModulo;
        this.integrità = integrità;
        this.funzionante = integrità > 0;
    }
    
    public String getName() {
    return nomeModulo;
}

public int getSalute() {
    return integrità;
}
    
    public void danneggia(int danno) {
        
        this.integrità -= danno;
        
        if (this.integrità <= 0) {
            this.integrità = 0;
            this.funzionante = false;
        }
    }
    
    public void ripara(int riparazione) {
        
        this.integrità += riparazione;
        
        if (this.integrità > 100) {
            this.integrità = 100;
        }
        
        if (this.integrità > 0) {
            this.funzionante = true;
        }
    }
    
    @Override
    public String toString() {
        String stato = funzionante ? "funzionante" : "danneggiato/distrutto";
        return "stato: " + stato + " nome: " + nomeModulo + " integrita': " + integrità ;
    }
}
