import java.util.Scanner;

public class Multiplosde3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
            sc.close();
        }
    }
}