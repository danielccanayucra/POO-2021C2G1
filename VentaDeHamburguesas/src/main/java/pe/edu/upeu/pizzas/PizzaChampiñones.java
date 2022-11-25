
package pe.edu.upeu.pizzas;

import pe.edu.upeu.modelo.PedidoPizza;

/**
 *
 * @author Usuario
 */
public class PizzaChampiñones extends PedidoPizza{

    @Override
    public void descripcionPedido() {
        System.out.println("------PIZZA DE CHAMPIÑONES------");
        System.out.println("     contiene:     ");
        System.out.println("      1° Champiñones------");
        System.out.println("      2° Queso mozzarella------");
        System.out.println("      3° un poco de pepperoni------");
        System.out.println("      4° Cebolla------");
        System.out.println("     PRECIO: s/30");
        
    }
    
}
