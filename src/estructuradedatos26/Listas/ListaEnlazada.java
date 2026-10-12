/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26.Listas;

/**
 *
 * @author rafay
 */
public class ListaEnlazada {
    private Nodo inicio;
    private Nodo fin;
    
    
    public ListaEnlazada() {
        this.fin = null;
        this.inicio = null;
    }
    
    public void agregarInicio( String val) {
        
        if(inicio == null && fin == null ) {
            inicio = new Nodo(val,inicio);
            fin = inicio;
        }else{
            inicio = new Nodo(val,inicio);        
        }   
        }
    
    public void mostrarLista() {
    Nodo aux = this.inicio;
    while(aux != null) {
        System.out.print("["+aux.valor+"]-->");
        aux = aux.siguiente;
        
        }
    }
    
    
public int cantidadNodos() {
    Nodo aux = this.inicio;
    int cantidad =0;
    while(aux != null) {
        cantidad++;
        aux= aux.siguiente;
    }
    return cantidad;
}

public void agregarFinal(String val){
    if(inicio==null && fin==null) {
        inicio = new Nodo(val);
        fin = inicio;
    }else{
        fin.siguiente = new Nodo(val);
        fin = fin.siguiente;
    }
}
    
    
}