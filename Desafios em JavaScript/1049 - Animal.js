var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, c, total;

a=String(lines.shift());
b=String(lines.shift());
c=String(lines.shift());

if(a === "vertebrado")
{
    if(b === "ave")
    {
        if(c === "carnivoro")
        {
            total = String("aguia");
        }
        else if(c === "onivoro")
        {
            total = String("pomba");
        }
    }
    else if(b === "mamifero")
    {
        if(c === "onivoro")
        {
            total = String("homem");
        }
        else if(c === "herbivoro")
        {
            total = String("vaca");
        }
    }      
}
else if(a === "invertebrado")
{
    if(b === "inseto")
    {
        if(c === "hematofago")
        {
            total = String("pulga");
        }
        else if(c === "herbivoro")
        {
            total = String("lagarta");
        }
    }
    else if(b === "anelideo")
    {
        if(c === "hematofago")
        {
            total = String("sanguessuga");
        }
        else if(c === "onivoro")
        {
            total = String("minhoca");
        }
    }
}

console.log(total);