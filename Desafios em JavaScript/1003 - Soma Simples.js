var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, soma=0; 

a=parseInt(lines.shift());
b=parseInt(lines.shift());

soma=a+b;

console.log(`SOMA = ${soma}`);