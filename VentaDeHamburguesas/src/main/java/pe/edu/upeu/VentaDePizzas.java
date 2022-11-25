

package pe.edu.upeu;

import pe.edu.upeu.modelo.PedidoPizza;
import pe.edu.upeu.modelo.PedidoPizzaFactory;

/**
 *
 * @author Usuario
 */
public class VentaDePizzas {

    public static void main(String[] args) {
        int tipoPizza = 1;
        PedidoPizza pizza = new PedidoPizzaFactory().getPizza(tipoPizza);
        pizza.setDireccion("residencia Universitaria de Varones UPeU");
        String Direccion = pizza.getDireccion();
        System.out.println("su pedido sera enviado a la siguiente direccion:"+Direccion);
        System.out.println("Descripcion de su pedido:");
        pizza.descripcionPedido();
    }
}
