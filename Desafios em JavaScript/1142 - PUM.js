var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n=parseInt(lines.shift());
var aux = "";
var x = 4*n;
for(let num = 1;num <= x; num++)
{
    if((num % 4) === 0)
    {
        if(num == x){
            aux += "PUM";
        }
        else{
            aux += "PUM\n";
        }
    }
    else
    {
        aux += (num.toString() + " ");
    }
}
console.log(`${aux}`);