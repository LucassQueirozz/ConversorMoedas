package ConversorDeMoedas;
import java.util.Scanner;
import static ConversorDeMoedas.Cotacao.*;

public class Main {
    public static void main(String[] args) {

        int escolha;
        Scanner sc;

        do {
            System.out.println("TABELA DE CONVERSÃO DE MOEDAS_v0.1");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Real (BRL)");
            System.out.println("2 - Dólar Americano (USD)");
            System.out.println("3 - Euro (EUR)");
            System.out.println("4 - Libra Esterlina (GBP)");
            System.out.println("5 - Bitcoin (BTC)");
            System.out.println("0 - Sair");

            sc = new Scanner(System.in);
            System.out.println("Digite o número correspondente: ");
            escolha = sc.nextInt();
            System.out.println("Digite a quantia em formato 'double -> 00.00': ");
            double qtd = sc.nextDouble();


            switch (escolha) {
                case 1:
                    Real_troca(qtd);
                    break;
                case 2:
                    Dolar_troca(qtd);
                    break;
                case 3:
                    Euro_troca(qtd);
                    break;
                case 4:
                    Libra_troca(qtd);
                    break;
                case 5:
                    Bitcoin_troca(qtd);
                    break;
                default:
                    System.out.println("Resposta Inválida");
            }
            System.out.println("Deseja fazer outra conversão? (1 - Sim / 0 - Não)");
            escolha = sc.nextInt();

        } while (escolha != 0);

        sc.close();
        System.out.println("Obrigado por usar o conversor!");

    }
}