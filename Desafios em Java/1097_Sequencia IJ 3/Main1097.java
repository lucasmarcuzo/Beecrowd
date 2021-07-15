//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1097 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vet = {7, 6, 5, 9, 8, 7, 11, 10, 9, 13, 12, 11, 15, 14, 13};

        int[] vet2 = new int[15];
  
        int j=0;
  
        for (int i = 1; i < 10; i = i +2)
        {
          vet2[i]=i;
  
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
          j++;
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
          j++;
          System.out.printf("I=%d J=%d\n", vet2[i], vet[j]);
          j++;
  
        }

        scan.close();

    }
    
}