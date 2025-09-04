package aula05.exemplopratico;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Rafael");
        c1.abrirConta("CC");
        c1.depositar(300);
        c1.sacar(350);
        c1.fecharConta();
        c1.dados();

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Lara");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.dados();
    }
}
