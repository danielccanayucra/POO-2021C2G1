
package pe.edu.upeu.pizzas;

import pe.edu.upeu.modelo.PedidoPizza;

/**
 *
 * @author Usuario
 */
public class PizzaTropical extends PedidoPizza{

    @Override
    public void descripcionPedido() {
        System.out.println("------PIZZA TROPICAL---------");
        System.out.println("       Contenido:     ");
        System.out.println("       1° Piña------");
        System.out.println("       2° Tomates------");
        System.out.println("       3° Jamon------");
        System.out.println("       4° Queso mozzarella------");
        System.out.println("     PRECIO: s/25");
    }
    
}
