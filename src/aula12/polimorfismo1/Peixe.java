package aula12.polimorfismo1;

public class Peixe extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolhas() {
        System.out.println("Soltando bolhas...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alga");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem som");
    }
}
