var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let jogada = parseInt(lines.shift());

if(jogada <= 800)
{
    console.log("1");
}
else if(jogada > 800 && jogada <= 1400)
{
    console.log("2");
}
else if(jogada > 1400 && jogada <= 2000)
{
    console.log("3");
}