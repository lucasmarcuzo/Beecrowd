//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1018 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int notas;

        int[] xpto={100,50,20,10,5,2,1};
        String[] val={"100,00","50,00","20,00","10,00","5,00","2,00","1,00"};

        notas=scan.nextInt();

        System.out.printf("%d\n",notas);
        for(int i=0; i<xpto.length; i++)
        {   
            System.out.printf("%d nota(s) de R$ %s\n",notas/xpto[i], val[i]);       
            int aux=(notas % (xpto[i]));
            notas=aux;
        }

        scan.close();

    } 
}