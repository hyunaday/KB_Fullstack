-- 만약 pokemon 데이터베이스가 존재하면 삭제
DROP DATABASE IF EXISTS pokemon;
-- CREATE DATABASE : 데이터베이스 생성
CREATE DATABASE pokemon;
-- 기본 DB 설정
USE pokemon;
CREATE TABLE mypokemon (
	number int,
    name varchar(20),
    type varchar(20),
    height float,
    weight float,   
    attack float,
    defense float,
    speed float
    );
-- insert INTO ~ VALUES	 : 실제 데이터 행 삽입
INSERT INTO mypokemon(number, name, type, height, weight, attack, defense, speed)
Values (10, 'caterpie', 'bug', 0.3, 2.9, 30, 35, 45),
		(25, 'pikachu', 'electric', 0.4, 6, 55, 40, 90),
        (26, 'raichu', 'electric', 0.8, 30, 90, 55, 110),
        (133, 'eevee', 'normal', 0.3, 6.5, 55, 50, 55),
        (152, 'chikorita', 'grass', 0.9, 6.4, 49, 65, 45);
SELECT * FROM mypokemon;

SELECT name FROM mypokemon;
SELECT name, height, weight FROM mypokemon;

-- DISTINCT : 중복 제거
SELECT DISTINCT height FROM mypokemon;

-- 모든 포켓몬들의 공격력을 2배 해서 'attack2'라는 별명으로 이름과 같이 뽑고싶다
SELECT name, attack * 2 as 'attack2', attack FROM mypokemon;