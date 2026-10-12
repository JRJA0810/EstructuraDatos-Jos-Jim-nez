
package estructuradedatos26;

import java.util.ArrayList;

/**
 *
 * @author rafay
 */
public class ListaFrutas {


    public static void main(String[] args) {
        
        //ArrayList: se utiliza para listas
        ArrayList<String> lista= new ArrayList<>();
        
        //add(valor):agregar un elemento al final
        lista.add("Manzana");
        lista.add("Fresa");
        lista.add("Mango");
        lista.add("Durazno");
        //add(inder, valor): agrega un elemento en cualquier posicion
        lista.add(2, "Pera");
        
        //get(): Obtener un elemento segun su indice
        System.out.println("futa: "+lista.get(1));
        
        //set(): Cambiar el valor de un elemento
        lista.set(1,"Mango Manila");
        
        //remove(): Quita elementos por indice o por objeto
        lista.remove(3);
        lista.remove("Pera");
        System.out.println(lista);
        
        if( lista.contains("Manzana")){
            System.out.println("Si hay la Manzana");
        }else{
            System.out.println("No hay la Manzana");                    
        }
        //Size(): Tamaño del arraylist
        System.out.println("Hay "+lista.size()+ "frutas");
                
        //empty(): Verifica si el arraylist esta vacio
        System.out.println(lista.isEmpty());
        
        //foreach
        for(String fruta : lista){
            System.out.println(fruta);
        }
        
        //foreach moderno
        lista.forEach( (f)->{ System.out.println(f);} );
        
        //foreach clasico
        for(int i=0; i> lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //clear(): Limpia el arraylist
        lista.clear();
        System.out.println(lista);
    
    }
    
}
