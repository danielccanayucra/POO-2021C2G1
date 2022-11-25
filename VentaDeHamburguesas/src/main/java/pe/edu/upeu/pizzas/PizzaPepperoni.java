
package pe.edu.upeu.pizzas;

import pe.edu.upeu.modelo.PedidoPizza;

/**
 *
 * @author Usuario
 */
public class PizzaPepperoni extends PedidoPizza{

    @Override
    public void descripcionPedido() {
        System.out.println("-----PIZZA DE PEPPERONI------");
        System.out.println("     Contenido:     ");
        System.out.println("     1° Salsa a base de carne de cerdo");
        System.out.println("     2° Salsa de tomate----");
        System.out.println("     3° Pepperoni----");
        System.out.println("     2° Queso mozzarella----");
        System.out.println("     PRECIO: s/18");
    }
    
}
