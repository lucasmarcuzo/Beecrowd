var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = lines.shift().length;

if(x <= 140)
{
    console.log("TWEET");
}
else
{
    console.log("MUTE");
}