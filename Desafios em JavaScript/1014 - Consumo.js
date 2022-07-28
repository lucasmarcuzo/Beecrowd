var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, total;

x = parseInt(lines.shift());
y = parseFloat(lines.shift());

total=x/y;

console.log(`${total.toFixed(3)} km/l`);