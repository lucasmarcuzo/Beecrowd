var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, total;

x=lines.shift();

total=(x*2);

console.log(`${total} minutos`);