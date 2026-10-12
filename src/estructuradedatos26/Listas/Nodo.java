/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26.Listas;

/**
 *
 * @author rafay
 */
public class Nodo {
    
    String valor;
    Nodo siguiente;
    
    public Nodo(String v) {
    this.valor = v;
    this.siguiente = null;
    }
    
    public Nodo(String v, Nodo sig) {
        this.valor = v;
        this.siguiente = null;
    }
    
}
