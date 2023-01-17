console.log('연동 확인')

let 변수 = 10;
const 상수 = 10;
let 배열 = [ 10, 20, 30 ]
let 객체 = { 수행평가: 10, 중간고사: 20, 기말고사: 30 }
function 함수(){ return (객체.수행평가+객체.중간고사+객체.기말고사); }

// 1. 객체 선언
let 객체1 = {
	이름: '김태호',
	나이: 변수,
	점수: 객체,
	정보: 배열	,
	행동: 함수
}

// 2. 객체 호출
console.log(객체1)

// 3. 객체 속성 호출
console.log(객체1.이름)

console.log(객체1.정보[2])		// 객체 내 배열의 인덱스 요소 호출 가능 확인

console.log(객체1.점수.기말고사)	// 객체 내 객체의 속성 호출 가능 확인

console.log(객체1.행동())		// 객체 내 함수 가동 가능 확인