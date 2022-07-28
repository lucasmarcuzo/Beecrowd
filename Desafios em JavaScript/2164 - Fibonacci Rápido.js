var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

var result = ((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / (Math.sqrt(5)));

console.log(`${result.toFixed(1)}`);