class Funcionario extends Pessoa {

    int cod;
    String funcao;

    Funcionario(String nome, String fone, String cpf, int cod, String funcao) {
        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    @Override
    void saudacao() {
        System.out.println("Olá! Funcionário " + getNome());
    }

    void desempenhaFuncao() {
        System.out.println(getNome() + " exerce a função de " + funcao);
    }
}
