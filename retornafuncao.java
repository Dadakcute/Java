public class Main {

    public static int inverterNumero(int num) {
        int invertido = 0;

        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return invertido;
    }

    public static void main(String[] args) {
        System.out.println(inverterNumero(1234)); // 4321
    }
}