package aula06.encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.menosVolume();
        c.play();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
        c.desligar();
    }
}
