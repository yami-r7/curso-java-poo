package aula10.heranca1;

public class Aluno extends Pessoa {
    private String matr;
    private String curso;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr() {
        this.setMatr("");
        this.setCurso("");
    }
}
