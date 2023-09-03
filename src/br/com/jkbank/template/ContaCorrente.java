package br.com.jkbank.template;

public class ContaCorrente extends Conta {

    private final double taxa = this.saldo * 0.05;

    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public ContaCorrente(Cliente cliente, double saldo, int numeroAgencia, int numeroConta) {
        super(cliente, saldo, numeroAgencia, numeroConta);

    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public void saque(double valorDoSaque) {
        if (this.saldo < valorDoSaque) {
            System.out.println("Impossível efetuar saque, saldo insuficiente" +
                    "\n saldo em conta: " + getSaldo());
        } else {
            this.saldo -= valorDoSaque + taxa;
        }
    }
}
