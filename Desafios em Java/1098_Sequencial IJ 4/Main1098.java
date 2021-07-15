//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1098 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float[] vet = new float[30];

        float[] vet2 = new float[30];
  
        float x=0, y=0;
  
        int j=3;
       
        for (int i = 3; i < 30; i++)
        {
  
            if(x == 0.0f)
            {
              System.out.printf("I=%d J=%d\n", Math.round(vet2[0]=0), Math.round(vet[0]=1));
              System.out.printf("I=%d J=%d\n", Math.round(vet2[1]=0), Math.round(vet[1]=2));
              System.out.printf("I=%d J=%d\n", Math.round(vet2[2]=0), Math.round(vet[2]=3));
            }
             
            x+=0.2f;
            y=vet[0]+x;
                System.out.printf("I=%.1f J=%.1f\n", vet2[i]=x, vet[j]=y);
            j++;
            i++;
            y=vet[1]+x;
                System.out.printf("I=%.1f J=%.1f\n", vet2[i]=x, vet[j]=y);
            j++;
            i++;
            y=vet[2]+x;
                System.out.printf("I=%.1f J=%.1f\n", vet2[i]=x, vet[j]=y);
  
  
            if(x == 0.8f || y == 4.8f){
  
              x+=0.2f;
              y=vet[0]+x;
                System.out.printf("I=%d J=%d\n", Math.round(vet2[i]=x), Math.round(vet[j]=y));
              j++;
              i++;
              y=vet[1]+x;
                System.out.printf("I=%d J=%d\n", Math.round(vet2[i]=x), Math.round(vet[j]=y));
              j++;
              i++;
              y=vet[2]+x;
                System.out.printf("I=%d J=%d\n", Math.round(vet2[1]=x), Math.round(vet[j]=y));
  
            }
  
        }

        scan.close();

    }
    
}