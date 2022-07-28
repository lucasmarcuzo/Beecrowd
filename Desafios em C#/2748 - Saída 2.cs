//Developed by: @LucasMarcuzo

using System; 

class URI 
{
    static void Main(string[] args) 
    {   

        Tracos();

        Console.WriteLine("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                Console.Write("|");
            }
            else if(i == 10){
                Console.Write("        Roberto                      ");
            }
        }

        Espaco();

        Console.WriteLine("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                Console.Write("|");
            }
            else if(i == 10){
                Console.Write("        5786                         ");
            }
        }

        Espaco();

        Console.WriteLine("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                Console.Write("|");
            }
            else if(i == 10){
                Console.Write("        UNIFEI                       ");
            }
        }

        Console.WriteLine("");
        Tracos();
        Console.WriteLine("");

    }

    private static void Espaco(){
        Console.WriteLine("");
        for (int i = 0; i < 39; i++) {
            if(i == 0 || i == 38){
                Console.Write("|");
            }
            else{
                Console.Write(" ");
            }   
        }
    }

    private static void Tracos(){
        for (int i = 0; i < 39; i++) {
            Console.Write("-");
        }
    }
}
