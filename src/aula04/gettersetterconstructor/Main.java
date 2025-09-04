package aula04.gettersetterconstructor;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", 0.7f, "Preta");
        c1.status();
        Caneta c2 = new Caneta("Compactor", 0.5f, "Vermelha");
        c2.status();
    }
}
