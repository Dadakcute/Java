// Classe mãe
class Pessoa {
    String nome;
    String fone;
    String cpf;

    public Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    public void saudar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}


// Herda de Pessoa
class Aluno extends Pessoa {

    String matricula;

    public Aluno(String nome, String fone, String cpf, String matricula) {
        super(nome, fone, cpf);
        this.matricula = matricula;
    }

    public void aprender() {
        System.out.println(nome + " está aprendendo.");
    }
}


// Aluno também é Pessoa
class Professor extends Aluno {

    String titulo;

    public Professor(String nome, String fone, String cpf,
                     String matricula, String titulo) {

        super(nome, fone, cpf, matricula);
        this.titulo = titulo;
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando.");
    }
}


class Funcionario extends Pessoa {

    int cod;
    String funcao;

    public Funcionario(String nome, String fone, String cpf,
                       int cod, String funcao) {

        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    public void desempenharFuncao() {
        System.out.println(nome + " exerce a função de " + funcao);
    }
}


class Responsavel extends Pessoa {

    String aluno;

    public Responsavel(String nome, String fone, String cpf, String aluno) {
        super(nome, fone, cpf);
        this.aluno = aluno;
    }
}


public class Main {

    public static void main(String[] args) {

        Aluno a = new Aluno(
                "Carlos",
                "9999-1111",
                "123456",
                "2025001"
        );

        Professor p = new Professor(
                "Maria",
                "9888-2222",
                "654321",
                "PROF01",
                "Mestre"
        );

        Funcionario f = new Funcionario(
                "João",
                "9777-3333",
                "111222",
                10,
                "Secretário"
        );

        a.saudar();
        a.aprender();

        p.ensinar();

        f.desempenharFuncao();
    }
}