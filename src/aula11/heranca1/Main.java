package aula11.heranca1;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); //Não pode instanciar pois é abstrata

        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        /*Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();*/

        /*Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();*/

        /*Professor p1 = new Professor();
        p1.setNome("Rômulo");
        p1.setIdade(44);
        p1.setSexo("M");
        p1.setEspecialidade("TI");
        p1.setSalario(3500);
        p1.receberAumento(1800);

        System.out.println(p1.toString());*/

        Tecnico t1 = new Tecnico();
        t1.setNome("Rafael");
        t1.setIdade(24);
        t1.setSexo("M");
        t1.setRegistroProfissional(7777);
        t1.praticar();
    }
}
