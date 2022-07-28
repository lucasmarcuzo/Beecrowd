var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var c = parseInt(lines.shift());

for (var i = 0; i < c; i++)
{
    var x = parseInt(lines.shift());

    if(x > 8000)
    {
        console.log("Mais de 8000!");
    }
    else
    {
        console.log("Inseto!");
    }
}