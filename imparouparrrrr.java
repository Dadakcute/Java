public class ParOuImpar {

    public static void verificar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

    public static void main(String[] args) {
        verificar(4);
    }
}