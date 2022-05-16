import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        Scanner sc = new Scanner(System.in);
        int selecUser;
        int auxNumConta;
        double auxValor;

        do {
            System.out.println("\nSELECIONE A OPCAO DESEJADA: ");
            System.out.println("[1] - CADASTRAR NOVA CONTA CONTA CORRENTE");
            System.out.println("[2] - CADASTRAR NOVA CONTA CONTA POUPANCA");
            System.out.println("[3] - DEPOSITO EM CONTA PELO NÚMERO");
            System.out.println("[4] - SAQUE EM CONTA PELO NÚMERO (APENAS CONTA CORRENTE)");
            System.out.println("[5] - EXIBIR CONTAS E SALDOS");
            System.out.println("[6] - SAIR DO PROGRAMA");
            selecUser = sc.nextInt();
            switch (selecUser) {
                case 1:
                    agencia.cadastrarCorrentista();
                    break;
                case 2:
                    agencia.cadastrarPoupador();
                    break;
                case 3:
                    System.out.print("NUMERO DA CONTA: ");
                    auxNumConta = sc.nextInt();
                    System.out.print("VALOR DO DEPOSITO: ");
                    auxValor = sc.nextDouble();
                    agencia.depositoEmConta(auxNumConta, auxValor);
                    break;
                case 4:
                    System.out.print("NUMERO DA CONTA: ");
                    auxNumConta = sc.nextInt();
                    System.out.print("VALOR DO SAQUE: ");
                    auxValor = sc.nextDouble();
                    agencia.saqueEmConta(auxNumConta, auxValor);
                    break;
                case 5:
                    agencia.exibeContasCadastradas();
                    break;

            }
        } while (selecUser != 6);
    }
}
