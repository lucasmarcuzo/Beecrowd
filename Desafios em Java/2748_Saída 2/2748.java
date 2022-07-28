public class Main {

    public static void main(String[] args) {
        
        tracos();

        System.out.println("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                System.out.print("|");
            }
            else if(i == 10){
                System.out.print("        Roberto                      ");
            }
        }

        espaco();

        System.out.println("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                System.out.print("|");
            }
            else if(i == 10){
                System.out.print("        5786                         ");
            }
        }

        espaco();

        System.out.println("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                System.out.print("|");
            }
            else if(i == 10){
                System.out.print("        UNIFEI                       ");
            }
        }

        System.out.println("");
        tracos();
        System.out.println("");

    }

    private static void espaco(){
        System.out.println("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                System.out.print("|");
            }
            else{
                System.out.print(" ");
            }   
        }
    }

    private static void tracos(){
        for (int i = 0; i < 39; i++) {
            System.out.print("-");
        }
    }


    
}
