import java.util.*;

public class Main3163 {

    public static Scanner scan = new Scanner(System.in);

    public static Queue<String> Oeste = new LinkedList<>();  
    public static Queue<String> Sul = new LinkedList<>();  
    public static Queue<String> Norte = new LinkedList<>();  
    public static Queue<String> Leste = new LinkedList<>();  

    public static Queue<String> Total = new LinkedList<>();

    public static void main(String[] args) {
    
        //(-4 representa o lado leste, -3 o lado norte, -2 lado sul e -1 lado oeste)
        
        int PC = scan.nextInt();
    
        switch (PC) {
            
            case -1:
                Adc(Oeste);
                break;
            case -2:
                Adc(Sul);
                break;
            case -3:
                Adc(Norte);   
                break;
            case -4:
                Adc(Leste);
                break;
        }
    }

    public static void Adc(Queue PC){

        while(true){

            String Pouso = scan.next();

            if(Pouso.equals("0")){
                break;
            }else if(Pouso.equals("-1")){
                PC = Oeste;
            }else if(Pouso.equals("-2")){
                PC = Sul;
            }else if(Pouso.equals("-3")){
                PC = Norte;
            }else if(Pouso.equals("-4")){
                PC = Leste;
            }
            else{  
                PC.add(Pouso);
            }
        
        }

        int t = tamanho();
        for (int i = 0; i < t; i++) {
           
            if(Oeste.peek() != null){
                Total.add(Oeste.poll());
            }
            if(Norte.peek() != null){
                Total.add(Norte.poll());
            }
            if(Sul.peek() != null){
                Total.add(Sul.poll());
            }
            if(Leste.peek() != null){
                Total.add(Leste.poll());
            }
        
       }

       scan.close();

       Imprimir();

    }

    public static int tamanho(){

        int tamanho = Oeste.size() + Sul.size() + Norte.size() + Leste.size();
        return tamanho;

    }
    
    public static void Imprimir(){

        String f = " ";
        for(String t : Total){
            
            f += t + " ";
        }
        
        System.out.println(f.trim());
    }
    
    
    
}
