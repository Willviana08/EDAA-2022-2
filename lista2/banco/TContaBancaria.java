package com.mycompany.banco;

/**
 *
 * @author WilkermanVianna
 */
public class TContaBancaria {
    
    private int numero, agencia;
    public String cpf, nome;
    private double saldo;
    
    TContaBancaria (int number, int agenciaBanco, String cpfUnic, String name, double saldoConta ) {
        
        numero = number;
        agencia = agenciaBanco;
        cpf = cpfUnic;
        saldo = saldoConta;
    
    }
    
    public void deposito (double valorDeposito) {
        
        if (valorDeposito > 0) {
            
            saldo+= valorDeposito;
        
        } else {
            
            System.out.println("Operação não realizada, valor invalido");
        }
    }
    
    public int saque (double valorSaque) {
        
        if (valorSaque > 0) {
            if (saldo - valorSaque >= 0) {
                saldo -= valorSaque;
                return 1;
            
            } else {
                
                System.out.println("Saldo insuficiente para essa operação");
                return 0;
            }
        } else {
            System.out.println("Operação não realizada, valor inválido");
            return -1;
        }
    }
    
    public void exibirSaldo() {
    
        System.out.println("Seu saldo é de R$ " + saldo);
    }
    
    public String toString() {
    
        return Integer.toString(agencia) + '-' + Integer.toString(numero) + " (" + nome + ")";
    }
    
}
