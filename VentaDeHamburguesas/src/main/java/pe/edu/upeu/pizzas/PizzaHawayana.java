
package pe.edu.upeu.pizzas;

import pe.edu.upeu.modelo.PedidoPizza;

/**
 *
 * @author Usuario
 */
public class PizzaHawayana extends PedidoPizza{

    @Override
    public void descripcionPedido() {
        System.out.println("--------PIZZA HAWAYANA------");
        System.out.println("      Contenido:-----");
        System.out.println("     1° Piña y durazno embazado------");
        System.out.println("     2° Jamon------");
        System.out.println("     3° Queso mozzarella------");
        System.out.println("     4° Salsa pomodoro------");
        System.out.println("     5° Leche condensada------");
        System.out.println("     PRECIO: s/20------");
        
    }
    
}
