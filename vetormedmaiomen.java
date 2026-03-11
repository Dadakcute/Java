import java.util.*;

public class vetormedmaiomen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
            soma += num[i];
        }

        double media = soma / 5.0;

        Arrays.sort(num);

        System.out.println("Média: " + media);
        System.out.println("Menor número: " + num[0]);
        System.out.println("Maior número: " + num[4]);
        sc.close();
    }
    
}