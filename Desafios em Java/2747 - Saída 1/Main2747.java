//Developed by: @LucasMarcuzo

public class Main2747 {

    public static void main(String[] args) {
        
        for (int i = 1; i < 40; i++) {
            System.out.print("-");
        }

        for (int i = 0; i < 5; i++) {
            
            System.out.println();
            for (int j = 1; j < 40; j++) {
    
                if(j == 1 || j == 39){
                    System.out.print("|");
                }else{
                    System.out.print(" ");  
                }
            }
        }

        System.out.println();
        for (int i = 1; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
