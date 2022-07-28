var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a = parseInt(lines[0]);

var b = parseInt(lines[1]);
        
var x=a+b;
        
console.log("X = "+ x);