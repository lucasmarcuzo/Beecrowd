var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
for (let i = 0; i < N; i++) {

    var valor = lines.shift();
    var N1 = parseInt(valor.substring(0, 1));
    var N2 = parseInt(valor.substring(2));
    var x = valor.substring(1, 2).charAt(0);

    if (N1 === N2) 
    {
        console.log(N1 * N2);
    } 
    else 
    {
        if(x.match(/[A-Z]/))
        {
            console.log(N2 - N1);
        } 
        else 
        {
            console.log(N2 + N1);
        }
    }
}