//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1142 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, num=1;

        n=scan.nextInt();

        for (int i = 1; i <= n; i++){

            for(;num <=4*n; num++){
		
			    if((num % 4) == 0){
                    
				    System.out.println("PUM");

			    }else{
				    
                    System.out.printf("%d ", num);
			    }
		    }

        }

        scan.close();
    
    }
}