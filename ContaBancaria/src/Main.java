import models.Conta;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1, "Elder Cesar");

        conta.depositar(50.0);

        conta.imprimirSaldo();

        conta.sacar(100.0);

        conta.imprimirSaldo();

        conta.imprimirExtrato();

    }
}