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
public class PortaContentores extends Navio{

    private int contentores;
    
    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     * @return the contentores
     */
    public int getContentores() {
        return contentores;
    }

    /**
     * @param contentores the contentores to set
     */
    public void setContentores(int contentores) {
        this.contentores = contentores;
    }
    
}
