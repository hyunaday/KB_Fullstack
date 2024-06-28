fs = require('fs');

// fs.readFileSync : 동기로 폴더를 읽어온다
const data = fs.readFileSync('./chapter03/sec03/example.txt', 'utf-8'); //인코딩 지정
console.log(data);
