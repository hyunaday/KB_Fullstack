fs = require('fs');

// fs.readFile : 비동기로 파일을 읽어온다
fs.readFileSync('./chapter03/sec03/example.txt', 'utf-8');
(err, data) => {
    if (err) {
        console.error(err);
        return;
    }
    // 인코딩 지정
    console.log(data);
};
