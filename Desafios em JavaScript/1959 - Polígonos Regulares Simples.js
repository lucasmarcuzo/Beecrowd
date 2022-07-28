var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

const a = lines.shift();
const b = lines.shift();
console.log(a * b);