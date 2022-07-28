var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const x=parseInt(lines.shift());

var l = new Array(x);

for (let i = 0; i < x; i++)
{
    l[i] = parseInt(lines.shift());
}    

console.log("Ciencia da Computacao");