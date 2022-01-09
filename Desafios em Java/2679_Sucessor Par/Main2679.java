import java.util.*;

//Developed by: @LucasMarcuzo

public class Main2679 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        
        while(true){
          
            if(x % 2 != 0){
              
              x++;
              System.out.println(x);
              break;
              
            }else{
              
              x += 2;
              System.out.println(x);
              break;
              
            }
        }

        scan.close();
    }
}
