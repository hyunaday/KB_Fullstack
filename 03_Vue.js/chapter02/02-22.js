let p = new Promise((resolve, reject) => {
    resolve('first!');
});

p.then((msg) => {
    console.log(msg); // First
    // error를 강제 발생시키는 코드, catch로 바로 이동함
    // throw new Error('## 에러!!');
    return 'second';
})
    // 그 전에 return된 값을 이어서 받음
    .then((msg) => {
        console.log(msg); // Second
        return 'third';
    })

    .then((msg) => {
        console.log(msg); // Third
    })
    .catch((error) => {
        console.log('오류 발생 ==> ' + error);
    });
