package com.mycompany.lista5;

import java.util.Scanner;

/**
 *
 * @author WilkermanVianna
 */
public class exercicio3Recursividade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(funcaoPotencia(k,n));
    
    }
    
    public static int funcaoPotencia(int k, int n) {
    
        if (k <= 0) {
            
            return 0;
        
        } else if (n <= 0) {
            
            return 1;
        
        } else {
            return k * funcaoPotencia(k, n - 1);
        }
    
    }
    
}
