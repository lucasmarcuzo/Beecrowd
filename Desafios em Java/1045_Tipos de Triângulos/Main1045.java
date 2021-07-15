//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1045 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);       
        double a, b, c, primeiro, segundo, terceiro;
        double[] valor = new double[4];

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (a >= b && a >= c){
		    primeiro = a;
	        segundo = b;
		    terceiro = c;
	    }

	    if (b >= a && b >= c){
		    primeiro = b;
	        segundo = a;
		    terceiro = c;

	    }else{
		    primeiro = c;
		    segundo = a;
		    terceiro = b;
	    }

        valor[0]=Math.pow(primeiro,2);
        valor[1]=Math.pow(segundo,2);
        valor[2]=Math.pow(terceiro,2);

        valor[3]=valor[1] + valor[2];
 
        if(primeiro >= segundo + terceiro){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
        
            if(valor[0] == valor[3]){
                System.out.println("TRIANGULO RETANGULO");
            }if( valor[0] >  valor[3]){
                System.out.println("TRIANGULO OBTUSANGULO");  
            }if( valor[0] < valor[3]){
                System.out.println("TRIANGULO ACUTANGULO"); 
            }if( valor[0] ==  valor[1] &&  valor[1] ==  valor[2]){
                System.out.println("TRIANGULO EQUILATERO");
            }if (valor[0] == valor[1] && valor[0] != valor[2] && valor[2] != valor[1]){
                System.out.println("TRIANGULO ISOSCELES");
	        }if (valor[1] == valor[2] && valor[0] != valor[1] && valor[0] != valor[2]){
		        System.out.println("TRIANGULO ISOSCELES");
	        }if (valor[0] == valor[2] && valor[2] != valor[1] && valor[0] != valor[1]){
                System.out.println("TRIANGULO ISOSCELES");
            } 
        }  
        scan.close();
    }        
}
