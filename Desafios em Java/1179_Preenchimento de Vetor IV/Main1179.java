import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        Queue<Integer> numsPares = new LinkedList<>();  
        Queue<Integer> numsImpares = new LinkedList<>();  
        int impares = 0, pares = 0;

        for(int i=0; i < 15; i++){
            Integer x = scan.nextInt();

            if(x % 2 == 0){
                    numsPares.add(x);
                    pares++;
            }
            else{
                    numsImpares.add(x);
                    impares++;
            }

            if(impares == 5){
                for (int j = 0; j < 5; j++) {
                    System.out.printf("impar[%d] = %d\n",j, numsImpares.poll());
                    impares = 0;
                }
            }
            else if (pares == 5){
                for (int j = 0; j < 5; j++) {
                    System.out.printf("par[%d] = %d\n",j, numsPares.poll());
                    pares = 0;
                }
            }
        }
        
        int imparIndex=0;
        int parIndex=0;
        while(!numsImpares.isEmpty()){
            System.out.printf("impar[%d] = %d\n", imparIndex, numsImpares.poll());
            imparIndex++;
        }
        while(!numsPares.isEmpty()){
            System.out.printf("par[%d] = %d\n",parIndex, numsPares.poll());
            parIndex++;
        }
 
    }
 
}