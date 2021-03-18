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
        Porto p = new Porto();                                  //Inicia um Porto
        Navio n = new Navio("1");                               //Inicia um Navio com matricula 1
        Petroleiro pt = new Petroleiro("2");                    //Inicia um Petroleiro com matricula 2
        PortaContentores pc = new PortaContentores("3");        //Inicia um Porta Contentores com matricula 3
        n.setNome("N1");                                        //Define o nome do Porto para N1
        pt.setNome("Pt1");pt.setCapacidade(450);                //Define o nome do Petroleiro para Pt1 e a sua capacidade para 450
        pc.setNome("pc1");pc.setContentores(100);               //Define o nome do Porta Contentores para Pc1 e os seus contentores para 100
        p.addNavio(n);                                          //Adiciona o Navio ao Porto
        p.addNavio(pt);                                         //Adiciona o Petroleiro ao Porto
        p.addNavio(pc);                                         //Adiciona o Porta Contentores ao Porto                                          
        
        System.out.println(pc.getContentores());                //Mostra o número de contentores do Porta Contentores
        
        System.out.println(pt.getCapacidade());                 //Mostra a capacidade da carga do Petroleiro
        
    }
    
}
