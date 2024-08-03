import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        for(int i=0; i < 5; i++) {

            System.out.print("Salário Bruto  :");
            double salariobruto = salario.nextDouble();

            double inss = calcularInss(salariobruto);
            double imposto = calcularImposto(salariobruto);
            double salarioLiquido = salariobruto - inss - imposto;

            System.out.printf("Salário Bruto: R$ %.2f\n", salariobruto);
            System.out.printf("Desconto Inss: R$ %.2f\n",inss);
            System.out.printf("Desconto Imposto: R$ %.2f\n", imposto);
            System.out.printf("Salário com descontos (INSS e Imposto): R$ %.2f\n\n", salarioLiquido);

        }


    }

    public static double calcularInss(double salariobruto){

        if (salariobruto <= 1212.00) {
                return salariobruto * 0.075;
        }
            else if (salariobruto <= 2427.35) {
                return salariobruto * 0.09;
        }
            else if (salariobruto <= 3641.03) {
                return salariobruto * 0.12;
            }
            else if (salariobruto <= 7087.22) {
                return salariobruto * 0.14;
            }
            else {
                return salariobruto*0.14;
            }

    }

    public static double calcularImposto(double salariobruto) {

        if (salariobruto <= 1903.98) {
            return 0.0;
        }

        else if (salariobruto <= 2826.65) {
            return salariobruto * 0.075;
        }

        else if (salariobruto <= 2826.65) {
            return salariobruto * 0.075;
        }

        else if (salariobruto <= 3751.05) {
            return salariobruto * 0.15;
        }

        else if (salariobruto <= 4664.68) {
            return salariobruto * 0.225;
        }

        else{
            return salariobruto * 0.275;
        }

    }
}