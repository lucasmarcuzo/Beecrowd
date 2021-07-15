import java.util.Scanner;

public class Main1012 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        double[] values=new double[3];

        values[0]=scan.nextDouble();
        values[1]=scan.nextDouble();
        values[2]=scan.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f\n", ((values[0] * values[2]) /2));
        System.out.printf("CIRCULO: %.3f\n", ((3.14159*(values[2] * values[2]))));
        System.out.printf("TRAPEZIO: %.3f\n", (((values[0] + values[1])) * values[2]) / 2);
        System.out.printf("QUADRADO: %.3f\n", (values[1] * values[1]));
        System.out.printf("RETANGULO: %.3f\n", ((values[0] * values[1]))); 

        scan.close();
        
    }
}
