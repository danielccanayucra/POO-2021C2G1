
package pe.edu.upeu.modelo;

import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
public abstract class PedidoPizza {
        public String direccion;
      
        public abstract void descripcionPedido();
}
