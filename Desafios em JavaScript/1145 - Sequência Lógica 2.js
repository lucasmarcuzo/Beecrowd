var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var i=1, m, n, o=1, aux = "";

m = parseInt(lines.shift());
n = parseInt(lines.shift());

do{
    if(o != m)
    {
        o++;
        aux += (i.toString() + " ");
    }
    else
    {
        aux += (i.toString() + "\n");
        o=1;
    } 
    i++;

    
} while (i <= n);
console.log(aux.replace(/\n$/, ""));