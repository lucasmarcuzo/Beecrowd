var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, x, y, i;
var resultado = 0;

n=parseInt(lines.shift());

for (i = 0; i < n; i++){

    let ln = lines.shift().split(` `);
    x = parseInt(ln.shift());
    y = parseInt(ln.shift());
    
    if (y === 0)
    {
        console.log("divisao impossivel");
    }
    else
    {
        resultado = parseFloat(x/y);
        console.log(`${resultado.toFixed(1)}`);
    }
}    