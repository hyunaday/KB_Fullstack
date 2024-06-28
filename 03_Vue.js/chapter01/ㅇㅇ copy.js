function Person(name, gender, age, address, job) {
    this.name = 'yura';
    this.gender = 'f';
    this.age = 15;
    this.address = 'sky';
    this.job = 'angel';
}

Person.prototype.printInfo = function () {
    console.log(
        `${this.name}의 성별은 ${this.gender}이며 ${this.age}세 입니다. 주소는 ${this.address}이며 직업은 ${this.job}입니다.`
    );
};

// // 객체 생성
// var yura = new Person('yura', 'f', 15, 'sky', 'angel');

// // 메서드 호출
yura.printInfo();
