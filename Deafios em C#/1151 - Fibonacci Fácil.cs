using System; 

//Developed by: @LucasMarcuzo

class URI1151 {

    static void Main(string[] args) { 

       int x,y, a=0,b=1,c=0;

        x=int.Parse(Console.ReadLine());

        for(y=1; y<x; y++)
        {
            if(y % 2 == 1)
            {
                Console.Write("{0} ",c);
                c=a+b;
                a=c;

            }else if(y ==2){

                Console.Write("{0} ",c);

            }else if(y % 2 == 0){

                Console.Write("{0} ",c);
                c=a+b;
                b=c;
            }
        }
            
            Console.Write("{0}\n",c);
    }
}