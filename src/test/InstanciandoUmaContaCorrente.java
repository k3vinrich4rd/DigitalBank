package test;

import br.com.jkbank.template.Cliente;
import br.com.jkbank.template.ContaCorrente;

public class InstanciandoUmaContaCorrente {
    public static void main(String[] args) {

        //Caso um: O valor do saque é menor que o saldo
        Cliente cliente1 = new Cliente();
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, 500);
        contaCorrente1.saque(100);
        System.out.println(contaCorrente1.getSaldo() + "\n");

        //Caso dois: O valor do saque é maior que o saldo
        Cliente cliente2 = new Cliente();
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, 50);
        contaCorrente2.saque(200);

    }
}
