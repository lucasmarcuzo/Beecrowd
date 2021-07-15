//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1145 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i=1, m, n, o=1;

        m = scan.nextInt();
        n = scan.nextInt();

       do{
            if(o != m){
			    o++;
			    System.out.printf("%d ", i);	

		    }else{

			    System.out.printf("%d\n", i);	
			    o=1;
		    } 
           
           i++;

       } while (i <= n);


        scan.close();
    
    }
}