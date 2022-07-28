var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, media;
a=parseFloat(lines.shift());
b=parseFloat(lines.shift());

media=((a*3.5 + b*7.5)/(3.5+7.5));

console.log(`MEDIA = ${media.toFixed(5)}`);