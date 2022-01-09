using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
            
        while(true){
          
          if(x % 2 != 0){
            
            x++;
            Console.WriteLine(x);
            break;
            
          }else{
            
            x += 2;
            Console.WriteLine(x);
            break;
            
          }
        }
    }
}