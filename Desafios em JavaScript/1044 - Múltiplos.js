var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var x, y;

x = parseInt(lines.shift());
y = parseInt(lines.shift());

if(y % x === 0 || x % y === 0)
{
    console.log("Sao Multiplos");
}
else
{
    console.log("Nao sao Multiplos");
}
