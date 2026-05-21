import java.time.LocalDate;
import java.util.Scanner;

public class excecaotexto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            if (nome.trim().isEmpty()) {
                throw new Exception("O nome não pode ficar vazio.");
            }

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            if (idade < 0) {
                throw new Exception("Idade inválida.");
            }

            System.out.print("Data de nascimento (AAAA-MM-DD): ");
            LocalDate data = LocalDate.parse(sc.nextLine());

            if (data.isAfter(LocalDate.now())) {
                throw new Exception("A data não pode ser futura.");
            }

            System.out.println("\nCadastro realizado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nascimento: " + data);

        } catch (NumberFormatException e) {

            System.out.println("Erro: digite um número válido.");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {

            sc.close();
            System.out.println("Programa encerrado.");

        }
    }
}