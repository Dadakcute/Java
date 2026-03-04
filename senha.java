import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;
        int digitado;

        do {
            System.out.print("Digite a senha: ");
            digitado = sc.nextInt();
        } while (digitado != senhaCorreta);

        System.out.println("Senha correta!");
        sc.close();
    }
}