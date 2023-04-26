import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome, senha;

        System.out.println("Digite seu nome de usúario: ");
            nome = scanner.next();

        System.out.println("Bem vindo, " + nome + "!\nAgora digite sua senha: ");
            senha = scanner.next();

            while (senha.equals(nome)) {
                System.out.println("Senha inválida devido a mesma ser igual ao seu usúario\nDigite uma senha válida!");
                    senha = scanner.next();
            }
        
        System.out.println("Login criado com sucesso!");

        scanner.close();
    }
}
