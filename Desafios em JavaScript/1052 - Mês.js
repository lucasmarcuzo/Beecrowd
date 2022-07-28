var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var meses = ["January","February","March","April","May","June","July","August","September","October","November","December"];

var i = parseInt(lines.shift());

i--;
console.log(meses[i]);