var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var MaiorAB, MaiorABC;
        
var a = parseInt(lines.shift());
var b = parseInt(lines.shift());
var c = parseInt(lines.shift());

MaiorAB = parseInt((a + b + Math.abs(a - b )) / 2);
MaiorABC = parseInt((MaiorAB + c + Math.abs(MaiorAB - c)) / 2);
console.log(`${MaiorABC} eh o maior`);