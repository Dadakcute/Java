public class Main {

    public static int contarCaracteres(String frase) {
        return frase.length();
    }

    public static void main(String[] args) {
        String texto = "Olá mundo";
        System.out.println(contarCaracteres(texto));
    }
}