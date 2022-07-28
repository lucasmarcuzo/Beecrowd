var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, c, media;

a=parseFloat(lines.shift());
b=parseFloat(lines.shift());
c=parseFloat(lines.shift());

media=((a*2.0)+(b*3.0)+(c*5.0))/10.0;

console.log(`MEDIA = ${media.toFixed(1)}`);