
package Exerc3Lista;

/**
 *
 * @author WilkermanVianna
 */
public class Carros {
    private float consumo;
    private String nomeCarro;
    
    public Carros(float consumo, String nomeCarro) {
        this.consumo = consumo;
        this.nomeCarro = nomeCarro;
    }
    public float calculaGastoCombustivel(float km) {
        if (consumo != 0) {
            return km / consumo;

        } else {
            return -1;
        }
    }

    public void setConsumo(float _consumo) {
        this.consumo = consumo;
    }

    public float getConsumo() {
        return this.consumo;
    }

    public void setNomeCarro(String NomeCarro) {
        this.nomeCarro = NomeCarro;
    }

    public String getNomeCarro() {
        return this.nomeCarro;
    }

    
}
