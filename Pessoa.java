class Pessoa {
    private String nome;
    private String fone;
    private String cpf;

    Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
