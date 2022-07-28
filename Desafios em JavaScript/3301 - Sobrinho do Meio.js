var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var H, Z, L;

H=parseInt(lines.shift());
Z=parseInt(lines.shift());
L=parseInt(lines.shift());

if(H > Z && H < L || H < Z && H > L)
{
    console.log("huguinho");
}
else if(H < Z && Z < L || H > Z && L < Z )
{
    console.log("zezinho");
}
else if (H > Z && L > Z || H < Z && H < L)
{
    console.log("luisinho");
}