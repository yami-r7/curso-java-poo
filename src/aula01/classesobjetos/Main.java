package aula01.classesobjetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c1.modelo = "Compactor";
        c1.cor = "Preta";
        c1.ponta = 0.7f;
        c1.carga = 45;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}