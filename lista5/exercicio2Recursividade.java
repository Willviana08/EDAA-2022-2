package com.mycompany.lista5;

/**
 *
 * @author WilkermanVianna
 */
public class exercicio2Recursividade {
    
    public static void main(String[] args) {
        
        imprimir(10);
    
    }
    
    public static void imprimir(int n) {
    
        if (n == 0) {
            System.out.println(n);
        }
        else {
            imprimir(n - 1);
            System.out.println(n);
        }
        
    }
}
