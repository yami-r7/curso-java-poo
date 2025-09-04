package aula02.exercicio;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "uno";
        c1.ano = 2010;
        c1.ligar();
        c1.status();

        Carro c2 = new Carro();
        c1.marca = "Honda";
        c1.modelo = "Civic";
        c1.ano = 2008;
        c1.desligar();
        c1.status();

        Amizade a1 = new Amizade();
        a1.pessoa1 = "Rayssa";
        a1.pessoa2 = "Manuela";
        a1.nivelConfianca = 80;
        a1.fortalecer();
        a1.situacao();
        a1.status();

        Amizade a2 = new Amizade();
        a1.pessoa1 = "Rian";
        a1.pessoa2 = "Lucas";
        a1.nivelConfianca = 10;
        a1.enfraquecer();
        a1.situacao();
        a1.status();
    }
}
