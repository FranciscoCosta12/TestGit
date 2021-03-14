/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author Francisco Costa
 */
public class Petroleiro extends Navio{

    private float capacidade;
    
    public Petroleiro(String matricula) {
        super(matricula);
        
    }


    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
