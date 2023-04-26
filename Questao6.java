import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            
            int numero1, numero2;
            int contador;
            int maior = 0;
            int menor = 0;

            System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextInt();

                if (numero1 < numero2) {
                    menor = numero1;
                    maior = numero2;
                } 
                
                else {
                    menor = numero2;
                    maior = numero1;
                }
   
                for (contador = menor; contador <= maior; contador++) {
                    System.out.println(contador);
                }
   
                scanner.close();
        }
    }  
