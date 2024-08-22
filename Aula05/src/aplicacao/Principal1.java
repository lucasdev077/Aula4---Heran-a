package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta1;
import entidade.ContaComercial1;
import entidade.enums.Cores;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
ma
        List<Conta1> lista = new ArrayList<>();
        String resposta;

        do {
            // Capturando os dados da conta
            System.out.print("Digite o nome do titular da conta: ");
            String nome = sc.nextLine();
            System.out.print("Digite o número da conta: ");
            int numero = sc.nextInt();
            System.out.print("Digite o saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Digite a cor da conta (BLACK, RED, etc.): ");
            Cores cor = Cores.valueOf(sc.next().toUpperCase());
            System.out.print("Digite o limite de crédito: ");
            double limiteCredito = sc.nextDouble();

            // Criando uma nova conta comercial e adicionando à lista
            Conta1 cc = new ContaComercial1(nome, numero, saldo, cor, limiteCredito);
            lista.add(cc);

            // Depósito opcional
            System.out.print("Deseja depositar um valor adicional? (s/n): ");
            if (sc.next().equalsIgnoreCase("s")) {
                System.out.print("Digite o valor a ser depositado: ");
                double valorDeposito = sc.nextDouble();
                cc.depositar(valorDeposito);
            }

            // Perguntando se o usuário quer criar outra conta
            System.out.print("Deseja criar outra conta? (s/n): ");
            resposta = sc.next();
            sc.nextLine();  // Consumir a quebra de linha restante

        } while (resposta.equalsIgnoreCase("s"));

        // Exibindo todas as contas criadas
        System.out.println("\nContas criadas:");
        for (Conta1 conta : lista) {
            System.out.println(conta);
        }

        sc.close();


	}

}
