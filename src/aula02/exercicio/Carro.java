package aula02.exercicio;

public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Está ligado? " + this.ligado);
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }
}
