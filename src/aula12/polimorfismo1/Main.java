package aula12.polimorfismo1;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal();
        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();*/

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra p = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara a = new Arara();

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
