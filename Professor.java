class Professor extends Pessoa {

    String titulo;

    Professor(String nome, String fone, String cpf, String titulo) {
        super(nome, fone, cpf);
        this.titulo = titulo;
    }

    @Override
    void saudacao() {
        System.out.println("Olá! Eu sou o professor " + getNome());
    }

    void ensina() {
        System.out.println(getNome() + " está ensinando.");
    }
}
