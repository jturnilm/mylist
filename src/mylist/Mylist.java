/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

/**
 *
 * @author ubuntu
 */
public class Mylist {

    /**
     * @param args the command line arguments
     */
    
    //
    public static void main(String[] args) {
        // TODO code application logic here
      
        lista a = new lista();
        a.insertar(0, 0);
        a.imprimir();
        a.insertar(1, 1);//insertar( int, int)
       
        a.imprimir();
        a.insertar(2, 2);//insertar( int, int)
       
        a.imprimir();
        a.insertar(3, 3);//insertar( int, int)
       
        a.imprimir();
        
        a.insertar(4, 4);
        
        a.insertar(5,5);
        
        a.eliminar(5);
        
         a.imprimir();
    }
    
}
