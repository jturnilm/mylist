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
public class lista {
    private Nodo header;
    private Nodo aux;
    
    public void insertar(int numero, int llave)
    {
        if(header==null)
        {
        header= new Nodo(numero, llave);
        
        }
        else
        {
        insertar_siguiente(numero,llave);
        }
    }
    private void insertar_siguiente(int numero, int llave)
    {
        System.out.println("metodo insertar ");
        if(this.header.get_siguiente()==null)
        {
         //   Nodo temp= new Nodo(numero,llave);
         //   this.header.set_siguiente(temp);
            this.header.set_siguiente(new Nodo(numero,llave));
            
        }
        else
        {
            aux=this.header.get_siguiente();
            while(aux!=null)
            {
            aux=aux.get_siguiente();
            }
            aux.set_siguiente(new Nodo(numero,llave));
        }
    }
 public   void imprimir()
    {
        Nodo a=this.header;
        System.out.println("imprimiendo");
    while(a!=null)
    {
        System.out.println("numero:"+a.get_numero());
        System.out.println("llave:"+a.get_llave());
    a=a.get_siguiente();
    }
    }
    
}
