var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x;

while (lines.length > 0) {

    var y = parseFloat(lines.shift());

    x = parseInt(y);
    var horas = (parseInt((y * 240) / 3600) % 60);
    var minutos = (parseInt((y * 240) / 60) % 60);
    var segundos = parseInt((y * 240) % 60);

    let hora = ((horas + 6) % 24);
    let saldacao;

    if (x >= 0 && x < 90 || x == 360)
    {
        saldacao = "Bom Dia!!";
    }
    else if (x >= 90 && x < 180)
    {
        saldacao = "Boa Tarde!!";
    }
    else if (x >= 180 && x < 270)
    {
        saldacao = "Boa Noite!!";
    }
    else if (x >= 270 && x < 360)
    {
        saldacao = "De Madrugada!!";
    }

    console.log(`${saldacao}\n${hora.toString().padStart(2, '0')}:${minutos.toString().padStart(2, '0')}:${segundos.toString().padStart(2, '0')}`);
}