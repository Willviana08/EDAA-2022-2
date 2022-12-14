package Exerc5Lista;

/**
 *
 * @author WilkermanVianna
 */
public class ElementoModif {
    private boolean elemento;
    private double valor;
    
    public ElementoModif() {
        this.elemento = false;
        
}
    public void setValor(double valor) {
        
        if (this.elemento) {
            this.valor = valor;
            this.elemento = true;
        }
        else {
            System.out.println("O valor do elemento foi alterado antes");
        }
    }
    
}
