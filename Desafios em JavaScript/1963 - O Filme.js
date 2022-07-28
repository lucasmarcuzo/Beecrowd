var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var A = lines.shift();
var B = lines.shift();

var valorIngresso = (((B - A) / A) * 100);

console.log(`${valorIngresso.toFixed(2)}%`);