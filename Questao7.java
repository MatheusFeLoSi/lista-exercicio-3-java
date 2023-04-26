import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int numero = 0;
        int par = 0;
        int impar = 0;

        while (contador < 10) {
            System.out.print("Digite o " + (contador+1) + "º número: ");
            numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
            
            contador++;
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

        scanner.close();
    } 
}