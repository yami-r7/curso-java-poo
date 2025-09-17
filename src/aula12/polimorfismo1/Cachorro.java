package aula12.polimorfismo1;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    public void enterrarOsso() {
        System.out.println("Enterradno osso...");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo...");
    }
}
