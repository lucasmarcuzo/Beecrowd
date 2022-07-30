var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var casos = parseInt(lines.shift());

for (let i = 0; i < casos; i++)
{               
    var linha = lines.shift().split(" ");

    var primeiro = linha.shift();
    var segundo = linha.shift();
    
    primeiro = primeiro.replace("\r", "");
    segundo = segundo.replace("\r", "");

    var tam_primeiro = primeiro.length;
    var tam_segundo = segundo.length;


    var tam = tam_primeiro - tam_segundo;

    if (tam_primeiro < tam_segundo)
    {
       console.log("nao encaixa");
    }
    else
    {
        var y = primeiro.substring(tam); 
        var x = y.includes(segundo); 

        if(x === true)
        {
           console.log("encaixa"); 
        }
        else
        {
           console.log("nao encaixa"); 
        }                      
    }
}