 /**
 * @author ISC Humberto Pinelo Rivera
 * Book: Desarrollo de Sofware con NetBeans 7.1
 * Pages: 55 - 56
 */
package ejemplopolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        clsPolimorfismo aux = new clsPolimorfismo();
        
        System.out.println("Suma de enteros: " + aux.sumar(2, 4));
        System.out.println("Suma de Doubles: " + aux.sumar(2.5, 4.9));
        System.out.println("Suma de Cadenas: " + aux.sumar("Beto", "Rivera"));
        
    }
    
}
