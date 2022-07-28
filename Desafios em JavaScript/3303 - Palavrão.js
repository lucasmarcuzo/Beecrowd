var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var palavra = lines.shift().toLowerCase();

if(palavra.length <= 20)
{
    if(palavra.length >= 10)
    {
        console.log("palavrao");
    }
    else
    {
        console.log("palavrinha");
    }
}