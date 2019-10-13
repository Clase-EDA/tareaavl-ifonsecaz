/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

/**
 *
 * @author ifons
 */
public class AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedBSTAVL a= new LinkedBSTAVL();
        
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(10);
        a.add(5);
        a.add(4);
        a.add(50);
        a.add(110);
        a.add(115);
        a.add(37);
        a.add(12);
        a.add(29);
        a.add(1000);
        a.add(73);
        a.add(666);
        a.add(1);
        a.add(82);
        a.add(2);
        
        
        System.out.println(a.imprimeIzqDerNivel());
        
        System.out.println(a.remove(1));
        
        System.out.println(a.imprimeIzqDerNivel());
    }
    
}
