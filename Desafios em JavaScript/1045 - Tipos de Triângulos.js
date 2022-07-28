var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a, b, c, primeiro, segundo, terceiro;
var valor = [4];

a = parseFloat(lines.shift());
b = parseFloat(lines.shift());
c = parseFloat(lines.shift());

if (a >= b && a >= c)
{
    primeiro = a;
    segundo = b;
    terceiro = c;
}

if (b >= a && b >= c)
{
    primeiro = b;
    segundo = a;
    terceiro = c;

}
else
{
    primeiro = c;
    segundo = a;
    terceiro = b;
}

valor[0]=parseFloat(Math.pow(primeiro,2));
valor[1]=parseFloat(Math.pow(segundo,2));
valor[2]=parseFloat(Math.pow(terceiro,2));

valor[3]=valor[1] + valor[2];

if(primeiro >= segundo + terceiro)
{
    console.log("NAO FORMA TRIANGULO");
}
else
{
    if(valor[0] === valor[3])
    {
        console.log("TRIANGULO RETANGULO");
    }
    if( valor[0] >  valor[3])
    {
        console.log("TRIANGULO OBTUSANGULO");  
    }
    if( valor[0] < valor[3])
    {
        console.log("TRIANGULO ACUTANGULO"); 
    }
    if( valor[0] ===  valor[1] &&  valor[1] === valor[2])
    {
        console.log("TRIANGULO EQUILATERO");
    }
    if (valor[0] === valor[1] && valor[0] !== valor[2] && valor[2] !== valor[1])
    {
        console.log("TRIANGULO ISOSCELES");
    }
    if (valor[1] === valor[2] && valor[0] !== valor[1] && valor[0] !== valor[2])
    {
        console.log("TRIANGULO ISOSCELES");
    }
    if (valor[0] === valor[2] && valor[2] !== valor[1] && valor[0] !== valor[1])
    {
        console.log("TRIANGULO ISOSCELES");
    } 
}  