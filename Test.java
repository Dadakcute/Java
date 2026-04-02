class aluno {

    private String nome;
    private int matricula;
    private String dtNascimento;
    private String telefone;
    private String nomeResponsavel;

    public aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String apresentar() {
        return "Olá eu sou " + this.nome +
               ", nasc: " + dtNascimento +
               ", tel: " + telefone +
               ", resp: " + nomeResponsavel;
    }

    public String saudacao() {
        int hora = java.time.LocalTime.now().getHour();

        if (hora < 12) {
            return "Bom dia " + nome;
        } else if (hora < 18) {
            return "Boa tarde " + nome;
        } else {
            return "Boa noite " + nome;
        }
    }
}

public class Test {

    public static void main(String[] args) {

        aluno aluno = new aluno("Isack", 6);

        System.out.println(aluno.apresentar());
        System.out.println(aluno.saudacao());
    }
}
