/* 
   삼항연산자: 조건 ? true : false
   제어문(if)
   1. 형태
    (1) if(조건) 실행문; 조건 true인 경우, 실행문 동작
    (2) if(조건) { 실행문1; 실행문2; 실행문3; .... } 조건 true인 경우, {} 실행문 모두 동작
    (3) if(조건) { 실행문1; } else { 실행문2; } 조건 true인 경우, 실행문1 동작 / false인 경우, 실행문2 동작
	(4) if(조건) { 실행문1; } else if(조건2) { 실행문2; } else { 실행문3; }
*/

// 형태(1)
if( 10 > 3 ) console.log('[참] 10이 더 크다.');

if( 10 > 20 ) console.log('[참] 10이 더 크다.');

// 형태(2)
if( 10 > 3 ) { console.log('[참]'); console.log('10이 더 크다'); };

// 형태(3) 삼항연산자와 동작구조 동일
if( 10 > 3 ){
	 console.log('[참] 10이 더 크다.');
}
else{
	 console.log('[참] 10이 더 작다.');
}

// 형태(4) 
if( 10 >= 15 ){ console.log('[참] 10가 15보다 더 크다.') }
else if( 10 >= 20 ) { console.log('[참] 10가 20보다 더 크다 .') }
else{ console.log('[참] 10가 제일 작다.') }

// 형태(4) - 삼항연산자 구조로 변경
10 >= 15 ? console.log('[참] 10가 15보다 더 크다.') :
10 >= 20 ? console.log('[참] 10가 20보다 더 크다 .') :
console.log('[참] 10가 제일 작다.')

// 문제1) 조건1) prompt로 정수 입력 받기
// 		 조건2) 90이상이면, "합격" 아니면 "탈락" 출력
let score_input = prompt("점수를 입력하시오. (min:0, max:100)")
if( score_input >= 90 ) { console.log("합격") }
else{ console.log("불합격") }

// 문제2) 조건1) prompt로 성별 입력 받기
// 		 조건2) 입력값1: "M", "m", "남", "남자" => 출력: "성별: 남성으로 확인되었습니다."
//		 	   입력값2: "W", "w", "여", "여자" => 출력: "성별: 여성으로 확인되었습니다."
let sex_input = prompt("성별을 입력하시오.")
if( sex_input == "M" || sex_input == "m" || sex_input == "남" || sex_input == "남자"){
	console.log("성별: 남성으로 확인되었습니다.")
}
else if( sex_input == "W" || sex_input == "w" || sex_input == "여" || sex_input == "여자"){
	console.log("성별: 여성으로 확인되었습니다.")
}
else console.log("잘못된 입력값입니다. 아래의 형식으로 다시 입력 부탁 드립니다.\n남성: M, m, 남, 남자 // 여성: W, w, 여, 여자")

// 문제3) 조건1) prompt로 정수 입력 받기
let score_input1 = prompt("점수를 입력하시오. (min:0, max:100)");
if( score_input1 >= 90 ) { console.log("A등급") }
else if( score_input1 >= 80 ) { console.log("B등급") }
else if( score_input1 >= 70 ) { console.log("C등급") }
else console.log("탈락")

// 문제3) 