var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while (lines.length > 0) {
    var N = parseInt(lines.shift());

    if (N.toString() === `NaN`)
    {
        break;   
    }
    else
    {
        let aux = log2(N);
        console.log(`${aux}`);
    }

}

function log2(N) {
    return parseInt((Math.log(N) / Math.log(2)));
}