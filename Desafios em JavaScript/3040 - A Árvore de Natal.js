var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var ts = parseInt(lines.shift());

for (let i = 0; i < ts; i++)
{
    var ln = lines.shift().split(" ");

    var altura = parseInt(ln.shift());
    var diametro = parseInt(ln.shift());
    var galhos = parseInt(ln.shift());

    if(altura >= 200 && altura <= 300)
    {
        if (diametro >= 50)
        {
            if(galhos > 150)
            {
                console.log("Sim");
            }
            else
            {
                console.log("Nao");
            }
        }
        else
        {
            console.log("Nao");
        }
    }
    else
    {
        console.log("Nao");
    }
}