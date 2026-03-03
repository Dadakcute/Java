import java.util.Scanner;
public class casedeoperações {
    static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = tc.nextDouble();

        System.out.print("Digite um segundo número: ");
        double num2 = tc.nextDouble();

        System.out.print("Escolha uma operação: ");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Divisão");
        System.out.println("4-Multiplicação");
        int escolha = tc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A soma desses dois números é: ," + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração desses dois valores é: ," + (num1-num2));
                break;
            case 3:
                System.out.println("A divisão desses dois números é: ," + (num1/num2));
                break;
            case 4:
                System.out.println("A multiplicação desses dois valores é: ," + (num1 * num2));
                break;
            default:
                System.out.println("Operacão inválida. ");
        }
        tc.close();
    }
}
