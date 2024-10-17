import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        double imposto = calcularImposto(salario);


        scanner.close();
    }

    private static double calcularImposto(double salario) {
        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);

        } else if (salario <= 4500.00) {
            imposto = 80.00 + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f\n", imposto);

        } else {
            imposto = 350.00 + (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f\n", imposto);

        }

        return imposto;
    }
}