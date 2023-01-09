/*
	입력
	1. confirm("메시지"): 확인(true)/취소(false) 입력받는 메시지 생성
	2. prompt("메시지"): 데이터 입력받는 메시지 창 생성

*/
// 1. 입력 메시지에 대한 확인/취소 결과를 변수에 저장
let result1 = confirm("실행하시겠습니까?")
console.log( "결과1: " + result1)

// 2. 입력 메시지 결과를 변수에 저장 (문자 데이터만 인식)
let result3 = prompt("데이터 입력")
console.log( "결과2: " + result3)

// 2-1. 문자 데이터를 숫자로 변환시키고 싶을 때는?
let result4 = Number(prompt("데이터 입력"))

// 2-2. 문자 데이터를 논리형으로 변환시키고 싶을 때는?
let result5 = Boolean(prompt("데이터 입력"))