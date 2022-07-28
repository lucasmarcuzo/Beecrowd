var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

do
{
    var num = 0, i = 0, v = 0;

    num=parseInt(lines.shift());

    if(num === 0)
    {
        break;
    }
    else
    {
        do
        {
            if(num % 2 === 0)
            {
                i+=num;
                v++;
            }
            num++;
            

        } while (v < 5);

       console.log(`${i}`);
    }
    
} while (true);