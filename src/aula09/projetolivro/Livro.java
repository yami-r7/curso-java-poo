package aula09.projetolivro;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", \ntotPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", \naberto=" + aberto +
                ", \nleitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.isAberto() == false) {
            this.setAberto(true);
        } else {
            System.out.println("Já está aberto na página " + this.getPagAtual() + ".");
        }
    }

    @Override
    public void fechar() {
        if (isAberto()) {
            this.setPagAtual(0);
        } else {
            System.out.println("Já estava fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()) {
            System.out.println("Não tem esse tanto de páginas aqui!");
        } else if (this.isAberto() == false) {
            System.out.println("O livro está fechado!");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("O livro está fechado!");
        }

    }

    @Override
    public void voltarPag() {
        if(this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
            if (this.getPagAtual() == 0) {
                this.setAberto(false);
            }
        } else {
            System.out.println("O livro está fechado!");
        }
    }
}
