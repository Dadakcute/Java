import java.util.Scanner;

public class vetorfrase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        int contador = 0;

        System.out.print("Consoantes: ");

        for(int i=0;i<frase.length();i++){
            char c = frase.charAt(i);

            if(Character.isLetter(c) &&
            c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                System.out.print(c + " ");
                contador++;
            }
        }

        System.out.println("\nQuantidade: " + contador);
        sc.close();
    }
    
}