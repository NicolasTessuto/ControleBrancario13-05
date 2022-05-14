import java.util.Scanner;

public class ContaPJ implements Conta {


    private String nomeTitular;
    private double saldo;
    private Agencia agencia;
    private int numeroConta;


    public void cadastrarCliente() {
        Agencia agencia = new Agencia();
        agencia.setnAgencia("974-X");
        setNomeTitular("Nícolas Tessuto");
        setSaldo(0.0);
        setAgencia(agencia);
        setNumeroConta(17122001);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


}
