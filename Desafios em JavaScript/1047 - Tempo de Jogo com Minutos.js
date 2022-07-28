var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var h1, m1, s1, h2, m2, s2, tempo, hr, min;

h1=parseInt(lines.shift());
m1=parseInt(lines.shift());
h2=parseInt(lines.shift());
m2=parseInt(lines.shift());

if (h2 <= h1 && m2 <= m1) 
{
    h2 = h2 + 24;
}
else if (m2 <= m1) 
{
    m2 = m2 + 60;
    h2 = h2 - 1;
}

s1 = (h1 * 3600) + (m1 * 60);
s2 = (h2 * 3600) + (m2 * 60);

tempo = (s2 - s1);
hr = Math.floor(tempo / 3600);
min = ((tempo - (hr * 3600)) / 60);

console.log(`O JOGO DUROU ${hr} HORA(S) E ${min} MINUTO(S)`);