//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1096 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vet = {7, 6, 5};

        int[] vet2 = new int[15];
  
        for (int i = 1; i < 10; i = i +2)
        {
          int j=0;
  
          vet2[i]=i;
  
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
          j++;
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
          j++;
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
  
        }

        scan.close();

    }
    
}