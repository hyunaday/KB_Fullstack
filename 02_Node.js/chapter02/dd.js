const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

function cmToFeetAndInches(cm) {
    let totalInches = cm / 2.54;
    let feet = Math.floor(totalInches / 12);
    let inches = totalInches % 12;
    return [feet, inches];
}
d;

rl.question('센티미터를 입력하세요: ', function (cm) {
    let result = cmToFeetAndInches(parseFloat(cm));
    console.log(
        cm +
            ' 센티미터는 ' +
            result[0] +
            ' 피트 ' +
            result[1].toFixed(2) +
            ' 인치입니다.'
    );
    rl.close();
});
