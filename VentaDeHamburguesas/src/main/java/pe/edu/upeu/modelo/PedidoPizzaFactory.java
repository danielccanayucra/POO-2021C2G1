
package pe.edu.upeu.modelo;

import pe.edu.upeu.pizzas.PizzaChampiñones;
import pe.edu.upeu.pizzas.PizzaHawayana;
import pe.edu.upeu.pizzas.PizzaPepperoni;
import pe.edu.upeu.pizzas.PizzaTropical;

/**
 *
 * @author Usuario
 */
public class PedidoPizzaFactory {
    public PedidoPizza getPizza(int tipoPizza){
    if(tipoPizza==1){
        return new PizzaChampiñones();
    }
    if(tipoPizza==2){
        return new PizzaHawayana();
    }
    if(tipoPizza==3){
        return new PizzaPepperoni();
    }
    if(tipoPizza==4){
        return new PizzaTropical();
    }
        return null;
  }

  
}
