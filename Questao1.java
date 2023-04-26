import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 e 10.");
            nota = scanner.nextInt();

        
            while (nota < 0 || nota >= 11 ) {
                System.out.println("Nota inválida! Digite uma nota válida.");
                nota = scanner.nextInt();
            }

            System.out.println("Sua nota " + nota + "é válida.");
        
            scanner.close();
    }
}
