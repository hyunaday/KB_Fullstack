const p = new Promise((resolve, reject) => {
    setTimeout(() => {
        let num = Math.random(); // 0~1 사이의 난수 발생
        if (num >= 0.8) {
            reject('생성된 숫자가 0.8이상임 ~ ' + num);
        }
        // num이 0.8 이상이 아닌 경우에는 성공
        resolve(num);
    }, 2000);
});

p.then((result) => {
    // resolve에서 받아온 값을 result에 할당
    console.log('처리결과 : ', result);
}).catch((error) => {
    // reject에서 받아온 값을 error에 할당
});

console.log('##Promise 객체 생성!!');
