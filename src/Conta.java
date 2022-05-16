public abstract class Conta {

    private String titular;
    private double saldo;
    private String cpf;
    private int nConta;
    private Agencia agencia;


    @Override
    public String toString() {
        return "Conta: " + nConta + "\n" +
                "Titular: " + titular + "\n" +
                "Agencia: " + agencia + "\n" +
                "Saldo: " + saldo;

    }


    public String getTitular(String s) {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nAgencia) {
        this.nConta = nAgencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
}
