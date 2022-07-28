var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, c, d, dif;

a=parseInt(lines.shift());
b=parseInt(lines.shift());
c=parseInt(lines.shift());
d=parseInt(lines.shift());

dif=(a * b - c * d);

console.log(`DIFERENCA = ${dif}`);