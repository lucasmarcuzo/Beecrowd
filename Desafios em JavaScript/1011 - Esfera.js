var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var pi = 3.14159;
var vol = (4/3);

var r = parseFloat(lines.shift());
var total = vol * pi * Math.pow(r, 3);

console.log(`VOLUME = ${total.toFixed(3)}`);