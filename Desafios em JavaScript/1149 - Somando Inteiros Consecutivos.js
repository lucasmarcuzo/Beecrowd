var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a, n=0, i=1, x=0;

a = parseInt(lines.shift());
n = parseInt(lines.shift());

while (n <= 0)
{
    i = i + 1; 
    n = parseInt(lines.shift());
}

for(let j = 0; j < n; j++) 
{
    x=(x+a+j);
}

console.log(x);