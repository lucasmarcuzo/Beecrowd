var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, i, g, e, s, grenais;
x=y=i=g=e=s=grenais=0;

do
{
    let ln = lines.shift().split(` `);
    x=parseInt(ln.shift());
    y=parseInt(ln.shift());

    if(x > y)
    {
        i++;
        grenais++;
        
    }else if(y > x)
    {
        g++;
        grenais++;
    }else
    {
        e++;
        grenais++;
    }

    console.log(`Novo grenal (1-sim 2-nao)`);
    s=parseInt(lines.shift());
    
} while (s === 1);


if (i > g)
{
    console.log(`${grenais} grenais`);
    console.log(`Inter:${i}`);
    console.log(`Gremio:${g}`);
    console.log(`Empates:${e}`);
    console.log(`Inter venceu mais`);

}else if (g > i)
{
    console.log(`${grenais} grenais`);
    console.log(`Inter:${i}`);
    console.log(`Gremio:${g}`);
    console.log(`Empates:${e}`);
    console.log(`Gremio venceu mais`);

}else
{
    console.log(`${grenais} grenais`);
    console.log(`Inter:${i}`);
    console.log(`Gremio:${g}`);
    console.log(`Empates:${e}`);
    console.log(`Nao houve vencedor`);
}
