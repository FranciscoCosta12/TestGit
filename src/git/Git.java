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
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porto p = new Porto();
        Navio n = new Navio("1");
        Petroleiro pt = new Petroleiro("2");
        PortaContentores pc = new PortaContentores("3");
        n.setNome("N1");
        pt.setNome("Pt1");pt.setCapacidade(450);
        pc.setNome("pc1");pc.setContentores(100);
        p.addNavio(n);
        p.addNavio(pt);
        p.addNavio(pc);
        p.addNavio(n);
        
        System.out.println(pc.getContentores());
        
        System.out.println(pt.getCapacidade());
        
    }
    
}
