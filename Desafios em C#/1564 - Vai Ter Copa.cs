using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        string str;
        
        while((str=Console.ReadLine())!= null)
        {
            if (str == null)
            {
                break;   
            }
            else          
            { 
                int x = int.Parse(str);
                if (x <= 0)
                {
                Console.WriteLine("vai ter copa!"); 
                }
                else
                {
                    Console.WriteLine("vai ter duas!");
                }
            }
        }
    }

}