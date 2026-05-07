public class ClasseTeste {

    public static void main(String[] args) {

        Aluno a = new Aluno(
                "Carlos",
                "99999-9999",
                "111.111.111-11",
                "2025001"
        );

        Professor p = new Professor(
                "Ana",
                "88888-8888",
                "222.222.222-22",
                "Mestre"
        );

        Funcionario f = new Funcionario(
                "João",
                "77777-7777",
                "333.333.333-33",
                10,
                "Secretário"
        );

        Responsavel r = new Responsavel(
                "Maria",
                "66666-6666",
                "444.444.444-44",
                new Aluno[]{a}
        );

        a.saudacao();
        p.saudacao();
        f.saudacao();
        r.saudacao();
    }
}
