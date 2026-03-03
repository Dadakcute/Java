import java.util.Scanner;

public class diadasemana {
    static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o número do dia da semana, por favor: ");
        int Dia = tc.nextInt();

        switch (Dia) {
            case 2:
                System.out.println("Hoje é segunda-feira, já tá podendo faltar?");
                break;
            case 3:
                System.out.println("Hoje é terça-feira, tá tô indo.");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira, não aguento mais.");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira, só mais um pouco meu Deus.");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira, finalmente vai tomando.");
                break;
            case 7:
                System.out.println("Hoje é sábado, só farra.");
                break;
            case 1:
                System.out.println("Hoje é domingo, amanhã já é segunda-feira.");
                break;
        }
        tc.close();
    }


}
