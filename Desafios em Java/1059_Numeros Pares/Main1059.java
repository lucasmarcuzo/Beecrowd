//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1059 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[101];

        for(int i=1;i<vetor.length;i++){  
            vetor[i]=i;  
        }

        for(int j=1;j<vetor.length;j++){  

           int x=vetor[j] % 2;

           if(x == 0){

                System.out.println(vetor[j]);

           } 
        }
        
        scan.close();

    }
    
}