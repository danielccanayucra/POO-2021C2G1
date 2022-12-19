package calculadora;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraDerivada().setVisible(true);
            }
        });
    }
    
}
