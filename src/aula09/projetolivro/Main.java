package aula09.projetolivro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Rafael", 23, "M");
        p[1] = new Pessoa("Érick", 26, "M");

        l[0] = new Livro("Dom Casmurro", "Machado de Assis", 288, p[0]);
        l[1] = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", 576, p[1]);
        l[2] = new Livro("1984", "George Orwell", 416, p[0]);

        l[0].abrir();
        l[0].folhear(3);
        //l[0].avancarPag();
        l[0].voltarPag();
        l[0].voltarPag();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
}
