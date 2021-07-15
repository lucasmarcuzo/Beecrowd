//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1049 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String a, b, c, total="";

        a=scan.next();
        b=scan.next();
        c=scan.next();
        
        if(a.equals("vertebrado")){
            if(b.equals("ave")){
                if(c.equals("carnivoro")){
                    total = "aguia";
                }else if(c.equals("onivoro")){
                    total = "pomba";
                }
            }else if(b.equals("mamifero")){
                if(c.equals("onivoro")){
                    total = "homem";
                }else if(c.equals("herbivoro")){
                    total = "vaca";
                }
            }      
        }else if(a.equals("invertebrado")){
            if(b.equals("inseto")){
                if(c.equals("hematofago")){
                    total = "pulga";
                }else if(c.equals("herbivoro")){
                    total = "lagarta";
                }
            }else if(b.equals("anelideo")){
                if(c.equals("hematofago")){
                    total = "sanguessuga";
                }else if(c.equals("onivoro")){
                    total = "minhoca";
                }
            }
        }

        System.out.println(total);

        scan.close();
    }  
}