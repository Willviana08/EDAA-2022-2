
package Exerc3Lista;
import java.util.Scanner;
/**
 *
 * @author WilkermanVianna
 */
public class Exerc3Lista {
    public static void main(String[] args) {
        int i;
        Carros[] carros = new Carros[5];
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            String modelo;

            float consumo;
            System.out.print("Digite o modelo do " + (i + 1) + "º carro: \n");
            modelo = scanner.nextLine();
            System.out.print("Digite o consumo do " + (i + 1) + "º carro (km/L): \n");
            consumo = scanner.nextFloat();
            scanner.nextLine();
            Carros carroAtual = new Carros(consumo, modelo);
            carros[i] = carroAtual;
        }
        scanner.close();

        int maior = 0;
        for (i = 0; i < 4; i++) {

            if (carros[i].getConsumo() > carros[maior].getConsumo()) {
                maior = i;
            }
        }
        System.out.print("Para percorrer 1000km, os veículos gastam, respectivamente:\n");
        for (int j = 0; j < carros.length; j++) {
            System.out.println(carros[j].getNomeCarro() + " -> " + carros[j].calculaGastoCombustivel(1000) + " L");
        }

        System.out.print("O modelo mais econômico é: " + carros[maior].getNomeCarro() + " \n");
    }
}
