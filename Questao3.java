import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int idade, salario;
        String nome, estadoCivil, sexo;
      
        System.out.println("Digite o seu nome: ");
            nome = scanner.next();
                while(nome.length() < 3 ) {
                    System.out.println("O nome deverá conter mais de três caracteres. Digite novamente um nome válido.");
                    nome = scanner.next();   
                }
                System.out.println("Nome validade com sucesso!");
                System.out.println("--------------------------------");
        
        System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();
                while (idade <0 || idade > 150) {
                    System.out.println("Digite uma idade válida entre 0 e 150.");
                        idade = scanner.nextInt();
                }
                System.out.println("Idade validada com sucesso!");    
                System.out.println("--------------------------------");

        System.out.println("Digite o seu salário: ");
             salario = scanner.nextInt();
                while (salario <= 0) {
                    System.out.println("Digite um salário valido maior que 0 reais.");
                        salario = scanner.nextInt();
             }
             System.out.println("Salário validado com sucesso!");   
             System.out.println("--------------------------------");
    
        System.out.println("Digite o seu sexo:\nF = Feminino, M = Masculino: ");
            sexo = scanner.next().toLowerCase();
                while (!sexo.equals("m") && (!sexo.equals("f"))) { 
                    System.out.println("Sexo inválido. Digite 'F' ou 'M' para ser validado");
                        sexo = scanner.next().toLowerCase();
            }
            System.out.println("Sexo validado com sucesso!");
            System.out.println("--------------------------------");
    
        System.out.println("Digite o seu estado civil:\nS = Solteiro\nC = Casado\nV = Víuvo\nD = Divorciado");
            estadoCivil = scanner.next().toLowerCase();
                while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
                    System.out.println("Estado civil inválido. Digite:\nS = Solteiro\nC = Casado\nV = Víuvo\nD = Divorciado\nPara ser validado.");
                        estadoCivil = scanner.next().toLowerCase();
                    }
                    System.out.println("Estado civil validado com sucesso!");
                    System.out.println("--------------------------------");
                    System.out.println("Todos os dados foram validados com sucesso.\nNome: " + nome + "\nIdade: " + idade);
                    System.out.println("--------------------------------");
                    System.out.print("Salário: " + salario + "\nSexo: " + sexo + "\nEstado civil: " + estadoCivil);
        
        scanner.close();
    }
}
