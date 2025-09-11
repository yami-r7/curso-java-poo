package aula10.heranca;

public class Professor extends Pessoa {
    private String esecialidade;
    private int salario;

    public String getEsecialidade() {
        return esecialidade;
    }

    public void setEsecialidade(String esecialidade) {
        this.esecialidade = esecialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberAum(int aum) {
        this.setSalario(this.getSalario() + aum);
    }
}
