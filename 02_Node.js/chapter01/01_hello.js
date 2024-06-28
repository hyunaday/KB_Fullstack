const c = require('ansi-colors');

function hello(name) {
    // console.log(name + ' 님, 안녕하세요?');
    console.log(`${c.green(name)}님, 안녕하세요?`);
}

hello('홍길동');
