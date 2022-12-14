package com.mycompany.lista5;

/**
 *
 * @author WilkermanVianna
 */
public class exercicio1Recursividade {
    
    public static void main (String[] args) {
    
    }
    
    public static int soma (int n) {
        if (n == 1) {
            return 1;
        
        } else {
            return n + soma(n - 1);
        }
    }
    
}
