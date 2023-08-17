package org.example;

import org.example.app.ContaTerminal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        try {
            System.out.println("Bem vindo ao seu novo banco. Vamocs criar sua conta.");
            System.out.println("Por favor, digite o número da sua Conta!");
            conta.numero = scan.nextInt();
            System.out.println("Por favor, digite o número da Agência!");
            conta.agencia = scan.next();
            System.out.println("Por favor, digite agora o seu Nome Completo!");
            conta.nomeCliente = scan.next();
            System.out.println("E por último, digite o seu Saldo!");
            conta.saldo = scan.nextFloat();

            System.out.println("\nOlá " +conta.nomeCliente
                    +", obrigado por criar uma conta em nosso banco, sua agência é " +conta.agencia
                    +", conta "+conta.numero
                    +" e seu saldo de R$: "+conta.saldo+" já está disponível para saque.");

        } catch (Exception e){
            System.out.println("Erro: "+ e);
            System.out.println("Não foi possível criar a sua conta, tente novamente mais tarde!");
        }
    }
}
