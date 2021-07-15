import java.util.Scanner;

public class Main1009 {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        double salario, totalvendas, total;
        String nome="";

        nome=scan.next();
        salario=scan.nextDouble();
        totalvendas=scan.nextDouble();

        total=salario + (totalvendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
