var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var x, y, z, w=60, v=24;

x = parseInt(lines.shift());
y = parseInt(lines.shift());

if(x < y)
{
    z=parseInt((y*w-x*w)/w);
    console.log(`O JOGO DUROU ${z} HORA(S)`);
}
else if(x > y)
{
    z=parseInt((v-x)+y);
    console.log(`O JOGO DUROU ${z} HORA(S)`);
}
else
{
    z=parseInt(24);
    console.log(`O JOGO DUROU ${z} HORA(S)`);
}  