package model;
//Proximas atualizacoes....

public class ContaBanco {

    private String Titular;
    private double Saldo;
    private int NumeroConta;

    public ContaBanco(int NumeroConta, String Titular, double Saldo) {
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.NumeroConta = NumeroConta;

    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operacao negada: valor invalido.");
        } else {
            Saldo += valor;
            System.out.println("Deposito realizado!");
            System.out.println("Novo saldo: " + Saldo);
        }
    }

    public void sacar(double resgatar) {
        if (resgatar > 0 && resgatar <= Saldo) {
            Saldo -= resgatar;
            System.out.println("Voce sacou: " + resgatar);
            System.out.println("Seu saldo agora e: " + Saldo);
        } else {
            System.out.println("Saque invalido ou saldo insuficiente!");
        }
    }

    public void mostrarDados() {
        System.out.println("\n===== DADOS DA CONTA =====");
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Número da conta: " + NumeroConta);
        System.out.println("==========================\n");
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumeroConta() {
        return NumeroConta;

    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;

    }

    public void MostrarConta() {
        System.out.println("Número da conta é:" + NumeroConta);
    }
}
