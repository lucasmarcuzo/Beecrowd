var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, f, x; 
x=f=1;

n=parseInt(lines.shift());

while (x <= n)
{
    f=f*x;
    x++;
}

console.log(f); 