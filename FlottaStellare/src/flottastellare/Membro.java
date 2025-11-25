/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

/**
 *
 * @author ironm
 */
public class Membro {
     private String nome;
    private String ruolo;
    private int salute;
    private boolean operativo;
    private Astronave astronaveDiAppartenenza;
    
    public Membro(String nome, String ruolo, int salute, Astronave astronaveDiAppartenenza){
        this.nome = nome;
        this.ruolo = ruolo;
        this.salute = salute;
        this.astronaveDiAppartenenza = astronaveDiAppartenenza;
        this.operativo = salute > 0; 
    }

    public String getNome() {
    return nome;
}

public int getSalute() {
    return salute;
}

    public void riceviDanno(int danno) {
        this.salute -= danno;
        
        if (this.salute <= 0) {
            this.salute = 0;
            this.operativo = false;
        }
    }

    public void cura(int cura) {
        this.salute += cura;
   
        if (this.salute > 10) {
            this.salute = 10;
        }
        
        if (this.salute > 0) {
            this.operativo = true;
        }
    }
   
    public void setAstronave(Astronave a) {
        this.astronaveDiAppartenenza = a;
    }
    
    @Override
    public String toString() {
        String stato = operativo ? "operativo" : "non operativo";
        return "nome: " + nome + " | ruolo: " + ruolo + " | salute: " + salute + " | stato: " + stato;
    }
}