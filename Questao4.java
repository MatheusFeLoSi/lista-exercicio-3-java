import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int numero;
        double media;

        while (contador < 5) {
            System.out.print("Digite o " + (contador+1) + "º número: ");
            numero = scanner.nextInt();
                soma += numero;
                    contador++;
        }
        
        media = soma / 5;
        
        System.out.println("A soma dos números é de: " + soma);
        System.out.println("A média dos números é de: " + media);
        
        scanner.close();
    }
}