var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y=0, cont=0;

do
{
    x=parseInt(lines.shift());

    if(x>0){
        y += x;
        cont++;
    }
    
} while (x > 0);

var z=parseFloat(y/cont);

console.log(`${z.toFixed(2)}`);
