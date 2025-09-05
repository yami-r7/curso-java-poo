package aula06.encapsulamento;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto() {
        this.volume = volume;
        this.tocando = tocando;
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos abstratos
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i=0; i<=this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    public void maisVolume() {
        if(this.isLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    public void menosVolume() {
        if(this.isLigado()) {
            setVolume(getVolume() - 1);
        }
    }

    public void ligarMudo() {
        if(this.isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    public void desligarMudo() {
        if(this.isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }

    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }else {
            System.out.println("Não consegui pausar");
        }
    }
}
