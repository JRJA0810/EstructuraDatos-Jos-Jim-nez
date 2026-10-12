/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos26;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rafay
 */
public class MiFila {

    public static void main(String[] args) {
    //Cola oxxo instanciada e inicializada
   Queue<String> colaOXXO = new LinkedList<>();
   
   //Offer: agregar un elemento a la cola
   colaOXXO.offer("Maria");
   colaOXXO.offer("Pepe");
   colaOXXO.offer("Juan");
   colaOXXO.offer("Ana");
   colaOXXO.offer("Carlos");
   
    //peek: muestra el siguiente en la cola
        System.out.println("Siguiente: ");
        System.out.println(colaOXXO.peek());
    //poll: Saca a el siguiente en la cola    
        System.out.println("Atendido: ");
        System.out.println(colaOXXO.poll());
    //Size: cantidad de elementos en la cola    
        System.out.println("\nQuedan: "+colaOXXO.size());
        System.out.println(colaOXXO.size());
    //isEmpty: verifica si la cola esta vacia
        System.out.println("\nesta vacia?: "+colaOXXO.isEmpty());
        System.out.println(colaOXXO);
        
        
    }
    
}
