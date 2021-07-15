using System; 

//Developed by: @LucasMarcuzo
class URI1099 {
    static void Main(string[] args) { 

       int x, y, z, z1, z2;
       x=y=z=0;

       z=int.Parse(Console.ReadLine());

       for (int i = 0; i < z; i++){

           string[] l1 = Console.ReadLine().Split(' ');

           x=int.Parse(l1[0]);
           y=int.Parse(l1[1]);
           z1=z2=0;


        if(x > y){   

            for (int j = y+1; j < x; j++){
                
                if (j % 2 != 0){

                    z1 += j;

                }
             }
            
                Console.WriteLine(z1);

        }else{
            
            for (int k = x+1; k < y; k++){
                
                    if (k % 2 != 0){

                        z2 += k;

                    }
            }
                Console.WriteLine(z2);
        }

    }
}
}