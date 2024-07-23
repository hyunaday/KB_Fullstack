// 다음 형태의 문서 20,000건을 추가하세요.
use test;
db.product.remove({})

for(let i = 0; i<20000; i++) {
    db.product.insert({
    num:i, 
    name:'스마트폰'+i,
    })
}

// product 컬렉션의 전체 문서수를 출력하세요.
db.product.count();

// product 컬렉션의 문서를 num의 내림차순으로 정렬하여 출력하세요
// sort로 문서를 정렬 가능(mysql : order by)
// sort ({키값 : 오름차순(1) / 내림차순(-1)})
db.product.find().sort({'num':-1});

// product 컬렉션의 문서를 num의 내림차순으로 정렬하여 상위 10건을 출력하세요
// limit : 데이터를 원하는 개수만큼만 출력해준다
// limit(출력할 데이터 갯수)
db.product.find().sort({'num':-1}).limit(10);


// product 컬렉션 문서를 num의 내림차순으로 정렬한 상태에서 다음을 처리하세요
// 메소드 체이닝의 순서는 중요하지 않다
// skip : 건너뛸 데이터의 개수, 페이징에 주로 사용
// skip할 페이지 공식 : (페이지 쪽수 - 1) * 한 페이지에 보여 줄 데이터 개수
//db.product.find().sort({'num':-1}).limit(10).skip((page_number -1)*10);
db.product.find().sort({'num':-1}).limit(10).skip((6-1)*10);

// product 컬렉션에서 num이 15미만이거나 19995 초과인 것을 출력하세요.
// $or : 배영 중 하나라도 True라면 일치
//미만 -> $lt, 초과 -> $gt
db.product.find({'$or':[
    {'num':{'$gt':19995}},
    {'num':{'$lt':15}}
    ]
})

// product 컬렉션에서 name이 '스마트폰 10', '스마트폰100','스마트폰1000' 중에 하나이면 출력하세요.
// $in : 어떤 인수든 하나라도 해당 배열에 있으면 검색됨
db.product.find({name:
    {$in:['스마트폰10','스마트폰100','스마트폰1000']}
})

// product 컬렉션에 num이 5보다 작은 문서를 출력하는데, name만 출력하세요 (_id 출력하면 안됨)
// 해당 컬럼에 0을 주면 해당 데이터 숨기기, 1을 주면 해당 데이터 보이기
db.product.find({num:{$lt:5}},{_id:0, name:1})