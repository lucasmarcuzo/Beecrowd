using System; 

//Developed by: @LucasMarcuzo
class URI1133 {
    static void Main(string[] args) { 

        int x, y;

        x=int.Parse(Console.ReadLine());
        y=int.Parse(Console.ReadLine());

        if(x > y){   

            for (int j = y+1; j < x; j++){
                
                if (j % 5 == 2 || j % 5 == 3){

                    Console.WriteLine(j);

                }
             }

        }else{
            
            for (int k = x+1; k < y; k++){
                
                    if (k % 5 == 2 || k % 5 == 3){

                        Console.WriteLine(k);

                    }
            }
        }

    }

}