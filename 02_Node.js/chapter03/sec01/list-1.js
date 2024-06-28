const fs = require('fs');

// fs.readFileSync : 동기로 폴더를 읽어온다.
let files = fs.readdirSync('./');
console.log(files);
