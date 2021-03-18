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
    
    /**
     *
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
        
    }

    /**
     *
     * @return the capacidade
     */
    public float getCapacidade() {
        return capacidade;
    }

    /**
     *
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
