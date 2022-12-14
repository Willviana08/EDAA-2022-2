package com.mycompany.lista6;

import java.util.Random;

/**
 *
 * @author WilkermanVianna
 */
public class vetor {

    public static void main(String[] args) throws Exception {
        
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10000);
        }
        
        array = insertionSort(array);
        int random = array[Math.abs(new Random().nextInt(500)) % array.length];
        
         long startTime = System.nanoTime();
        System.out.println(binarySearch(array, random));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(" Busca binária: " + duration + " nano segundos");

        startTime = System.nanoTime();
        System.out.println(linearSearch(array, random));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(" Busca sequencial: " + duration + " nano segundos");
    }
    
     public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
/*
Atraves dos testes feito no algoritmo se percebe que o tempo de execução do algoritmo de busca binaria e maior que o algoritmo 
de busca sequencial.Em todos os casos de testes de modo geral, dependendo do tamanho do array e da posição de elemento a ser buscado
o algoritmo de busca binária e mais rapido que o algoritmo de busca sequencial. O algoritmo de busca binária é mais rápido quando o
array é grande e o elemento a ser buscado está no meio do array. Já o algoritmo de busca sequencial é mais rápido quando o array é
pequeno ou quando o elemento a ser buscado está no início do array.
*/