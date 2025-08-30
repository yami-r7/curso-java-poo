package aula01.exercicio;

public class Amizade {
    String pessoa1;
    String pessoa2;
    int nivelConfianca;
    boolean ativa;

    void status() {
        System.out.println("Pessoa 1: " + this.pessoa1);
        System.out.println("Pessoa 2: " + this.pessoa2);
        System.out.println("Nível de confiança: " + this.nivelConfianca);
        System.out.println("Ativa? " + this.ativa);
    }

    void fortalecer() {
        this.nivelConfianca += 10;
    }

    void enfraquecer() {
        this.nivelConfianca -= 10;
    }

    void situacao() {
        if(this.nivelConfianca <= 0) {
            this.ativa = false;
        }else {
            this.ativa = true;
        }
    }
}
