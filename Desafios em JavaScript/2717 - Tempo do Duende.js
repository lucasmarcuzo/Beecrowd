var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var finalExpediente = parseInt(lines.shift());

var ln = lines.shift().split(` `);

var presente1 = parseInt(ln.shift());
var presente2 = parseInt(ln.shift());

var total = presente1 + presente2;

if (total > finalExpediente)
{
    console.log("Deixa para amanha!");
}
else
{
    console.log("Farei hoje!");
}