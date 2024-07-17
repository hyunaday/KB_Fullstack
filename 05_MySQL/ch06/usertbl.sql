-- usertbl 테이블에서 이름이 '김경호'인 행을 출력하세요
SELECT * FROM usertbl  WHERE name = '김경호';

-- usertbl 테이블에서 생년이 1970 이상이고 키가 182 이상인 데이터를 출력하세요
-- 조건 두개를 모두 만족해야 하는 경우 AND로 연결해준다
SELECT * FROM usertbl 
WHERE birthYear >= 1970 AND height >= 182;

-- usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요
-- 범위값을 설정할 경우 BETWEEN '시작값' AND '끝값'을 사용한다.
SELECT * FROM usertbl 
WHERE height BETWEEN 180 AND 183;

-- usertbl 테이블에서 주소가 '경남' 또는 '전남' 도는 '경북'인 데이터를 출력하세요
-- IN으로 값이 해당 범위 안에 있는지 체크해준다
SELECT * FROM usertbl 
WHERE addr IN('경남', '전남', '경북');

-- usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요
-- LIKE 뒤에 %를 붙인 문자열을 명시하면 %의 위치에 따라 해당 문자열을 검색 가능
-- 김% : 김으로 시작하는 데이터
-- %김 : 김으로 끝나는 데이터
-- %김% : 김이 포함된 데이터
SELECT * FROM usertbl 
WHERE name LIKE '김%';

-- usertbl에서 김경호보다 큰 사람들의 이름과 키를 출력하세요actor_info
-- 서브쿼리브터 작성해서 실행해보고 리턴된 값을 확인 후 바깥 쿼리문 작성
SELECT name, height FROM usertbl
WHERE height > (SELECT  height FROM usertbl 
WHERE Name = '김경호');

-- usertbl을 mdata의 오름차순으로 정렬하여 출력하세요
-- ORDER BY절을 이용해서 정렬을 해준다. ORDER BY 뒤에는 정렬 기준을 넣는다
-- 기본적으로 ORDER BY는 오름차순으로 정렬된다 (ASC 생략)
SELECT * FROM usertbl ORDER BY mDate;

-- usertbl을 mdata의 내림차순으로 정렬하여 출력하세요buytbl
-- 내림차순으로 변경하기 위해서는 DESC를 맨 뒤에 붙여준다
SELECT * FROM usertbl  ORDER BY mDate DESC;

-- usertbl을 hei홋ht의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요
-- 정렬 기준이 여러개인 경우 ,를 이용해서 뒤에 이어 적어준다. (ASC는 생략가능)
SELECT * FROM usertbl ORDER BY height DESC, name ASC;

-- usertbl의 주소지를 중복없이 오름차순으로 출력하세요
SELECT DISTINCT addr FROM usertbl;