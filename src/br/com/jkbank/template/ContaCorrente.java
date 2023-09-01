package br.com.jkbank.template;

public class ContaCorrente extends Conta {

    private double taxa;

    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, double saldo, int numeroAgencia, int numeroConta) {
        super(cliente, saldo, numeroAgencia, numeroConta);

    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public void saque(double valorDoSaque) {
        if (this.saldo < valorDoSaque){
            taxa = this.saldo * 0.05;
            this.saldo -= valorDoSaque + taxa;
        }
    }
}
