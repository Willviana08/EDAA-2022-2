package Exerc1Exerc2e4;


import java.util.Random;

/**
 *
 * @author WilkermanVianna
 */
public class Exerc2Lista {
    
    public static void main(String[] args) {
        Random vet = new Random();
        int[] array = new int[10];
        boolean[] primos = new boolean[10];
        int count_primos = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = vet.nextInt(100);
            primos[i] = true;
            for (int j = (array[i]-1); j > 1; j--){
                if (array[i]%j == 0) {
                    primos[i] = false;
                }
            }
        }
        for (int i = 0; i < primos.length; i++) {
            if(primos[i]) {
                System.out.println(i + "->" + array[i] + "\n");
            }
        }
    }
    
}
