var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let num_album = 0, fig_compradas = 0;

num_album = parseInt(lines.shift());
fig_compradas = parseInt(lines.shift());

var figurinhas = new Array(fig_compradas);

for (let i = 0; i < figurinhas.length; i++)
{
    let y = false;
    let id = parseInt(lines.shift());

    for (let x of figurinhas)
    {
        if (x == id)
        {
            y = true;
            break;
        }
    }   

    if(y === false)
    {
        figurinhas[i]=id;
        num_album--;
    }         
}

console.log(`${num_album}`); 