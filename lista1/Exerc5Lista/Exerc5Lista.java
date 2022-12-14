package Exerc5Lista;

import java.util.Scanner;

/**
 *
 * @author WilkermanVianna
 */
public class Exerc5Lista {
    
    public static void main(String[] args) {
        ElementoModif[] num = new ElementoModif[6];
        Scanner scanner = new Scanner(System.in);
        String opcoes = "sim";
        for (int i = 0; i < num.length; i++) {
            num[i] = new ElementoModif();
            
        }
        while (opcoes.matches("sim")) {
            for(int j = 0; j < num.length; j++) {
                System.out.println("alterar " + (j + 1) + "° do número ? [sim] ou [nao]");
                String opc = scanner.nextLine();
                if (opc.matches("sim")) {
                    System.out.println("Digite o valor a ser inserido");
                    num[j].setValor(scanner.nextDouble());
                    scanner.nextLine();
                
                }
            }
            System.out.println("Continuar [sim] ou [nao]");
            opcoes = scanner.nextLine();
        }
    
    }
}
