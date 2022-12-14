package com.mycompany.banco;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WilkermanVianna
 */
public class Banco {

    public static void main(String[] args) throws Exception {
        
        TContaBancaria[] contas = new TContaBancaria[0];
        TContaBancaria contaAcess;
        String menu = "";
        Scanner scanner = new Scanner(System.in);
        
        contas = criarConta(inicio(), contas);
        contaAcess = contas[0];
        
        while (!menu.equalsIgnoreCase("S")) {
            
            if (menu.equalsIgnoreCase("C")) {
                
                contas = criarConta(inicio(), contas);
                if (contas.length > 1) {
                    
                    System.out.println("Selecione uma conta: ");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        System.out.println("[" + i + "] - " + contas[i].toString());
                    }
                    
                    int selected = scanner.nextInt();
                    
                    if (selected < contas.length && selected >= 0) {
                        
                        contaAcess = contas[selected];
                    
                    }
                
                }
            
            } else if (menu.equalsIgnoreCase("T")) {
                if (contas.length > 1) {
                    System.out.println("Selecione uma conta para transferir: ");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        if (contaAcess != contas[i]) {
                            System.out.println("[" + i + "] - " + contas[i].toString());
                        
                        }
                    
                    }
                    int selected = scanner.nextInt();
                    System.out.println("Digite o valor que a conta desejada ira receber: ");
                    double value = scanner.nextDouble();
                    
                    if (selected < contas.length && selected >= 0 && value > 0) {
                        if (contaAcess.saque(value) == 1) {
                            contas[selected].deposito(value);
                        
                        } else {
                            System.out.println("Erro de operação! Pressione qualquer tecla para continuar");
                            scanner.nextLine();
                        }
                    
                    } else {
                        System.out.println("Erro de operação! Pressione qualquer tecla para continuar");
                        scanner.nextLine();
                    }
                
                }
            
            } else if (menu.equalsIgnoreCase("E")) {
                contaAcess.exibirSaldo();
                System.out.println("Pressione qualquer tecla para continuar");
                scanner.nextLine();
            
            } else if (menu.equalsIgnoreCase("R")) {
                
                System.out.println("Digite o valor de retirada");
                contaAcess.saque(scanner.nextDouble());
            
            } else if (menu.equalsIgnoreCase("D")) {
                
                System.out.println("Qual valor do deposito ?");
                contaAcess.deposito(scanner.nextDouble());
            
            } else if (menu.equalsIgnoreCase("A")) {
                clrscr();
                
                if (contas.length > 1) {
                    System.out.println("Selecione uma conta para entrar: ");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        
                        System.out.println("[" + i + "] - " + contas[i].toString());
                    
                    }
                    int selected = scanner.nextInt();
                    if (selected < contas.length && selected >= 0) {
                        
                        contaAcess = contas[selected];
                    
                    }
                
                }
            
            }
            
            clrscr();
            
            System.out.println("Conta de acesso: " + contaAcess.toString());
            operacoes();
            menu = scanner.nextLine();
        
        }
        
        scanner.close();
        
    }
    
    public static void operacoes() {
        
        System.out.println();
        System.out.println("[S] - Sair ");
        System.out.println("[C] - Criar nova conta ");
        System.out.println("[T] - Transferir valor em contas ");
        System.out.println("[E] - Exibir Saldo ");
        System.out.println("[R] - Saque ");
        System.out.println("[D] - Depósito ");
        System.out.println("[A] - Alterar conta ");
    
    }
    
    public static TContaBancaria inicio() {
    
        Scanner scanner = new Scanner(System.in);
        Random rend = new Random();
        clrscr();
        System.out.println("Criar nova conta");
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Informe o saldo inicial de deposito: ");
        double saldo = scanner.nextDouble();
        int numero = rend.nextInt(99999999);
        System.out.println("Dados da nova conta, pressione enter para continuar: ");
        System.out.println("Agência: 735 | Conta: " + numero);
        System.out.println();
        scanner.nextLine();
        clrscr();
        
        return new TContaBancaria (numero, 725, cpf, nome, saldo);
    
    }
    
    public static TContaBancaria[] criarConta(TContaBancaria novaConta, TContaBancaria[] contas) {
        
        TContaBancaria[] auxiliarContas = new TContaBancaria[contas.length + 1];
        for (int i = 0; i < contas.length; i++) {
            
            auxiliarContas[i] = contas[i];
            
        }
        auxiliarContas[auxiliarContas.length - 1] = novaConta;
        return auxiliarContas;
        
    }
   
    
    // limpar tela 
    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
