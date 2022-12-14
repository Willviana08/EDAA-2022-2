package com.mycompany.lista5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author WilkermanVianna
 */
public class exercicio1 {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Queue<Character> uppercase = new LinkedList<>();
        Queue<Character> lowercase = new LinkedList<>();
        String linha = scanner.nextLine();
        
        for (int i = 0; i < linha.length(); i++) {
            char caracter = linha.charAt(i);
            if (Character.isUpperCase(caracter)) {
                uppercase.add(caracter);
            
            } else if (Character.isLowerCase(caracter)) {
                lowercase.add(caracter);
            
            }
        }
        
        System.out.println("Maiúsculas: ");
        
        while (!uppercase.isEmpty()) {
            System.out.println(uppercase.poll());
        
        }
        
        System.out.println("Minúsculas: ");
        
        while (!lowercase.isEmpty()) {
            System.out.println(lowercase.poll());
        
        }
        
        scanner.close();
        
    }
}
