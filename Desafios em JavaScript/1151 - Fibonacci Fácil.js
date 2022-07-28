var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x,y, a=0,b=1,c=0, aux = "";

x=parseInt(lines.shift());

for(y=1; y < x; y++)
{
    if(y % 2 === 1)
    {
        aux += (c.toString() + " ");
        c=a+b;
        a=c;

    }else if(y === 2){

        aux += (c.toString() + " ");

    }else if(y % 2 === 0){

        aux += (c.toString() + " ");
        c=a+b;
        b=c;
    }
}
    
console.log(`${aux}${c}`);