using System; 

//Developed by: @LucasMarcuzo
class URI1042 {

    static void Main(string[] args) { 

        int a, b, c;

        string[] s = Console.ReadLine().Split(' ');

        a = int.Parse(s[0]);
        b = int.Parse(s[1]);
        c = int.Parse(s[2]);

        if(a < b && a < c){

            Console.WriteLine(a);

            if(b < c){

                Console.WriteLine(b);
                Console.WriteLine(c);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);

            }else if(c < b){

                Console.WriteLine(c);
                Console.WriteLine(b);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);
            }

        }else if(b < a && b < c){

            Console.WriteLine(b);

            if(a < c){

                Console.WriteLine(a);
                Console.WriteLine(c);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);

            }else if(c < a){

                Console.WriteLine(c);
                Console.WriteLine(a);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);
            }

        }else if(c < a && c < b){

            Console.WriteLine(c);

            if(b < a){

                Console.WriteLine(b);
                Console.WriteLine(a);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);

            }else if(a < b){

                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine("");
                Console.WriteLine(a);
                Console.WriteLine(b);
                Console.WriteLine(c);
            }

        }

    }

}