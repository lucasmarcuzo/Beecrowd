//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1066 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int w, x, y, z;
        w=x=y=z=0;

        int[] vetor=new int[5];

        for(int i=0; i<vetor.length; i++)
        {
           vetor[i]=scan.nextInt();
        }

        for(int i=0; i<vetor.length; i++)
        {
            if(vetor[i]>0){
                w++;
            }if(vetor[i]<0){
                x++;
            }if(vetor[i] % 2 == 0){
                y++;
            }if(vetor[i] % 2 != 0){
                z++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n",y);
        System.out.printf("%d valor(es) impar(es)\n",z);
        System.out.printf("%d valor(es) positivo(s)\n",w);
        System.out.printf("%d valor(es) negativo(s)\n",x);

        scan.close();

    }
    
}