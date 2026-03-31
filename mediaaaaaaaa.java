public class Media {

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        double media = calcularMedia(7, 8, 9);
        System.out.println("Média: " + media);
    }
}