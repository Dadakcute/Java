public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Aluno();
        Pessoa p2 = new Professor();

        p1.setNome("Carlos");
        p2.setNome("Ana");

        System.out.println(p1.getNome());
        p1.saudacao();

        System.out.println(p2.getNome());
        p2.saudacao();
    }
}