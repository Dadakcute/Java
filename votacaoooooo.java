public class Votacao {

    public static void podeVotar(int idade) {
        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }

    public static void main(String[] args) {
        podeVotar(15);
    }
}