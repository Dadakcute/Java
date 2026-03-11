import java.util.Scanner;

public class vetor10alun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[10][4];

        double maior = -1;
        double menor = 11;
        double soma = 0;
        int total = 0;

        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                System.out.print("Aluno " + (i+1) + " Nota " + (j+1) + ": ");
                notas[i][j] = sc.nextDouble();

                soma += notas[i][j];
                total++;

                if(notas[i][j] > maior) maior = notas[i][j];
                if(notas[i][j] < menor) menor = notas[i][j];
            }
        }

        double media = soma / total;

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        sc.close();
    }
}
