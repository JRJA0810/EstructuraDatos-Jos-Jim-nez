/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos26;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * @author rafay
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deque pila0 = new ArrayDeque(); //Pila de objetos Object
        Deque<String> pila = new ArrayDeque(); //Pila de Strings
        
        //push: apilar elementos
        pila.push("Fresa");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Mango");
        pila.push("Ciruela");
        pila.push("Tamarindo");
        
        //peek: Ver la cima sin retirarlo
        System.out.println("Cima: " + pila.peek());
        //pop: Desapilar
        System.out.println("retirado: " +pila.pop());
        System.out.println("Nueva cima: "+pila.peek());
        
        System.out.println("---- hay "+pila.size()+" Frutas en la pila ----");
        while (pila.isEmpty()) { //pila.isEmpty()!=true
            System.out.println("procesado: "+pila.pop());
            
            
        }
        
        System.out.println("Ya no hay nada en la pila!!!");
    }
    
}
