/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Costa
 */
public class Porto {
    private List<Navio> navios;
    
    public Porto(){
        navios = new ArrayList<>();
    }
    
    public void addNavio(Navio n){
        if(!procura(n)){
            navios.add(n);
        }else{
            System.out.println("A matricula "+ n.getMatricula() + "já existe!");
        }
    }

    private boolean procura(Navio n) {
        for(Navio nv : navios)
            if(nv.getMatricula().equals(n.getMatricula())) return true;
        return false;
    }
    
    public void listNavios(){
        for(Navio n:navios)
        System.out.println(n);
    }
}
