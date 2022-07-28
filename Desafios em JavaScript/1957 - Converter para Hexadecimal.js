var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());

const y = x.toString(16);

console.log(y.toUpperCase());