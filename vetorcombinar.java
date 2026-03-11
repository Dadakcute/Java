import java.util.*;

public class vetorcombinar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[20];
        int[] C = new int[30];

        for(int i=0;i<10;i++){
            System.out.print("A["+i+"]: ");
            A[i] = sc.nextInt();
        }

        for(int i=0;i<20;i++){
            System.out.print("B["+i+"]: ");
            B[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            C[i] = A[i];
        }

        for(int i=0;i<20;i++){
            C[i+10] = B[i];
        }

        Arrays.sort(C);

        System.out.println("Vetor C ordenado:");
        for(int i=0;i<30;i++){
            System.out.print(C[i] + " ");
        }
        sc.close();
    }
}
