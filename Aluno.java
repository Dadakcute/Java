class Aluno extends Pessoa {

    String matricula;

    Aluno(String nome, String fone, String cpf, String matricula) {
        super(nome, fone, cpf);
        this.matricula = matricula;
    }

    @Override
    void saudacao() {
        System.out.println("Oi! Eu sou o aluno " + getNome());
    }

    void aprende() {
        System.out.println(getNome() + " está aprendendo.");
    }
}
