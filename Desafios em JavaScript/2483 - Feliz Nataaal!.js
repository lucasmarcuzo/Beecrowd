var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var natal = "Feliz nat";

for (var i = 0; i < x; i++)
{
    natal += "a";
}

natal += "l!";

console.log(natal);