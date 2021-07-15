//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1043 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        double perimetro, area;
        double[] valores = new double[6];       
        double[] x = new double[3];
    
        for(int i=0; i<3; i++){
            x[i]=scan.nextDouble();
        }
            valores[0]=x[0]+x[1];
            valores[1]=x[0]+x[2];
            valores[2]=x[1]+x[2];

            valores[3]=x[0]-x[1];
            valores[4]=x[0]-x[2];
            valores[5]=x[1]-x[2];

        if (valores[3] < x[2] && x[2] < valores[0] && valores[4] < x[1] && x[1] < valores[1] && valores[5] < x[0] && x[0] < valores[2]){
            perimetro = (x[0] + x[1] + x[2]);
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else {
            area = (((x[0]+x[1]) * x[2] )/ 2);
            System.out.printf("Area = %.1f\n", area);
        }

        scan.close();
    }        
}
