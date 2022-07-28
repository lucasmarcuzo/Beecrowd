var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while (lines.length > 0) {
    let graus = parseInt(lines.shift());
    
    if ( graus >= 0 && graus < 90 ) 
    {
        console.log("Bom Dia!!");
    }
    else if ( graus >= 90 && graus < 180 )
    {
        console.log("Boa Tarde!!");
    }
    else if ( graus >= 180 && graus < 270 )
    {
        console.log("Boa Noite!!");
    }
    else if ( graus >=  270 && graus < 360)
    {
        console.log("De Madrugada!!");
    }
    else
    {
        console.log("Bom Dia!!");
    }
}