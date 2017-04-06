/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveisdeclasse;

/**
 *
 * @author aluno
 */
public class VariaveisDeClasse {
    static int count = 0;
    private String nome;
    
    void incrementa (){
        count++;
    }
    
    void setNome(String nomeParametro){
        nome = nomeParametro;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    
    public static void main(String[] args) {
        
        VariaveisDeClasse objeto1 = new VariaveisDeClasse();
        VariaveisDeClasse objeto2 = new VariaveisDeClasse();
        
        objeto1.setNome("Marcelo");
        objeto1.incrementa();
        
        objeto2.setNome("João");
        objeto2.incrementa();
        
        System.out.println("Objeto 1 count: " + objeto1.count);
        System.out.println("Objeto 2 count: " + objeto2.count);
        
        System.out.println("Objeto 1 count: " + objeto1.getNome());
        System.out.println("Objeto 2 count: " + objeto2.getNome());
    }
    
}
