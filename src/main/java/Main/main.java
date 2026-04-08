package Main;

import model.ContaBanco;

public class main {

    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco("Derek", 400);
        pessoa1.depositar(300);
        pessoa1.sacar(338);
        pessoa1.mostrarDados();

        ContaBanco pessoa2 = new ContaBanco("Bruno", 568);
        pessoa2.depositar(443);
        pessoa2.depositar(33);
        pessoa2.mostrarDados();
    }
}