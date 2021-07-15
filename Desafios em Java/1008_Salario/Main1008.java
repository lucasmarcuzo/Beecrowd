//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1008 { 

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num, horas;
        double salario, total;

        num=scan.nextInt();
        horas=scan.nextInt();
        salario=scan.nextDouble();

        total=horas*salario;

        System.out.printf("NUMBER = %d\n",num);
        System.out.printf("SALARY = U$ %.2f\n", total);

        scan.close();
    }  
}