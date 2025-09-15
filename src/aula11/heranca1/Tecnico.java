package aula11.heranca1;

public class Tecnico extends Aluno{
    private float registroProfissional;

    public float getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(float registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Praticando...");
    }
}
