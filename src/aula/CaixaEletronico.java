package aula;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado...\nSaldo atual: " + saldo);
        } else {
            System.out.println("Seu saldo não é suficiente para este saque...\nSaldo atual: " + saldo);
        }
    }
}
