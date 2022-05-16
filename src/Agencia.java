import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {

    private String nAgencia = "9110-x";
    private int nConta = 1;
    ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return nAgencia;
    }

    public boolean tipoDeConta(int auxNumConta) {
        boolean retorno = false;
        for(Conta c : listaDeContas){
            if (auxNumConta == c.getnConta()){
                if (c instanceof ContaCorrente){
                    retorno = true;
                    break;
                }
            }
        }
        return retorno;
    }

    public void saqueEmConta(int auxNumConta, double auxValor) {
        for (Conta c : listaDeContas){
            if (tipoDeConta(auxNumConta)) {
                c.setSaldo(c.getSaldo() - auxValor);
            }
            else{
                System.out.println("ESSA CONTA É POUPANCA, NAO PERMITE SAQUES");
            }
        }
    }

    public void exibeContasCadastradas() {
        if (listaDeContas.isEmpty()) {
            System.out.println("Lista de contas esta vazia...");
        } else {
            for (Conta c : listaDeContas) {
                System.out.println(c);
            }
        }
    }

    public void cadastrarCorrentista() {
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.print("Informe o nome: ");
        contaCorrente.setTitular(sc.nextLine());
        contaCorrente.setnConta(nConta);
        System.out.print("Informe o CPF: ");
        contaCorrente.setCpf(sc.nextLine());
        contaCorrente.setSaldo(0.0);
        contaCorrente.setAgencia(this);
        System.out.print("\nOs dados da sua conta sao: ");
        System.out.print(contaCorrente);
        listaDeContas.add(contaCorrente);
        nConta++;
    }

    public void cadastrarPoupador() {
        ContaPoupança contaPoupador = new ContaPoupança();
        System.out.print("Informe o nome: ");
        contaPoupador.setTitular(sc.nextLine());
        contaPoupador.setnConta(nConta);
        System.out.print("Informe o CPF: ");
        contaPoupador.setCpf(sc.nextLine());
        contaPoupador.setSaldo(0.0);
        contaPoupador.setAgencia(this);
        System.out.print("\nOs dados da sua conta sao: ");
        System.out.print(contaPoupador);
        listaDeContas.add(contaPoupador);
        nConta++;
    }

    public void depositoEmConta(int contaDigitada, double auxValor) {
        if (verificaContaNaLista(contaDigitada)) {
            for (Conta c : listaDeContas) {
                if (c.getnConta() == contaDigitada) {
                    c.setSaldo(c.getSaldo() + auxValor);
                }
            }
        } else {
            System.out.println("NAO TEMOS ESSA CONTA NESSA AGENCIA");
        }
    }

    public boolean verificaContaNaLista(int contaDigitada) {
        boolean retorno = false;
        for (Conta c : listaDeContas) {
            if (c.getnConta() == contaDigitada) {
                retorno = true;
                break;
            }
        }
        return retorno;
    }

    public String getnAgencia() {
        return nAgencia;
    }

    public void setnAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }


}
