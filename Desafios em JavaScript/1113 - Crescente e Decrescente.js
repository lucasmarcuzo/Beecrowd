var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y;

do
{
    var ln = lines.shift().split(` `);
    x = parseInt(ln.shift());
    y = parseInt(ln.shift());

    if(x > y){

        console.log("Decrescente");

    }else if(x < y){

        console.log("Crescente");
    }
    
} while (x != y);