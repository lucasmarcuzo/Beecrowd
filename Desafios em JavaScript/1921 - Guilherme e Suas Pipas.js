var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let N = parseInt(lines.shift());

let total = (( N * N ) - ( 3 * N )) / 2;   
console.log(total);