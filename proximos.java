import java.util.Scanner;

public class proximos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(numero + i);
        }
        sc.close();
    }
}
