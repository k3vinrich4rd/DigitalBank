package br.com.jkbank.template;

public abstract class Conta {

    private Cliente cliente;
    protected double saldo;
    private int numeroAgencia;
    private int numeroConta;

    public Conta() {
    }

    public Conta(Cliente cliente, double saldo, int numeroAgencia, int numeroConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }


    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract void saque(double valorDoSaque);


    public void deposito(double valorDoDeposito) {
        this.saldo += valorDoDeposito;
    }
}



