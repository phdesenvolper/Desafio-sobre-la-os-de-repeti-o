import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque aqui o seu salário:");
        int salario = scanner.nextInt();

        if (salario <= 280) {
            double newSalario = (salario * 0.2) + salario;
            double inflacao = (0.038 * newSalario) - newSalario;
            System.out.println("Seu salário agora é: " + inflacao);
        }
        if (salario > 280 && salario <= 700) {
            double newSalario = (salario * 0.15) + salario;
            double inflacao = (0.038 * newSalario) - newSalario;
            System.out.println("Seu salário agora é: " + inflacao);
        }
        if (salario > 700 && salario <= 1500) {
            double newSalario = (salario * 0.1) + salario;
            double inflacao = (0.038 * newSalario) - newSalario;
            System.out.println("Seu salário agora é: " + inflacao);
        }
        if (salario > 700 && salario <= 1500) {
            double newSalario = (salario * 0.05) + salario;
            double inflacao = (0.038 * newSalario) - newSalario;
            System.out.println("Seu salário agora é: " + inflacao);
        }
    }
}