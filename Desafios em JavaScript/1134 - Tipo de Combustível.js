var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, a, b, c;
n=a=b=c=0;

do
{   
    n=parseInt(lines.shift());

    if(n >=1 && n <= 3){

        if(n == 1){
            a++;
        }else if(n == 2){
            b++;
        }else if(n == 3){
            c++;
        }
    }
    
} while (n != 4);

console.log(`MUITO OBRIGADO`);
console.log(`Alcool: ${a}`);
console.log(`Gasolina: ${b}`);
console.log(`Diesel: ${c}`);