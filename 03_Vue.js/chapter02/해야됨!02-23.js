obj.age = 19;
// obj1과 obj2는 같은 주소를 가리키고 있기 때문에 값이 같이 변경된다

// obb3은 값만 복사했기 때문에 같이 변경되지 않는다.
console.log(obj3);
console.log(obj1 == obj2); // 같은 주소기 때문에 true
console.log(obj1 == obj3); // 다른 주소기 때문에 false

let arr1 = [100, 200, 300];
// 전개 연산자를 통해 원하는 값들을 중간에 삽입 가능
let arr2 = ['hello'];
