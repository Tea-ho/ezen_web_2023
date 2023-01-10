/*
1. 산술연산자
console.log( 3+3 ) // 숫자+숫자 => 숫자
console.log( "더하기: " + 3+3 ) // 문자+숫자 => 문자
console.log( "더하기: " + (3+3) ) // 소괄호 우선 실행
console.log( "빼기: " + (3-2) )
console.log( "곱하기: " + (3*2) )
console.log( "나누기: " + (3/2) )
console.log( "나머지: " + (3%2) )

2. 비교연산자
console.log( "초과: " + (10 > 3) )
console.log( "초과: " + (10 < 3) )
console.log( "초과: " + (10 >= 3) )
console.log( "초과: " + (10 <= 3) )

3. 비교연산자 : 결과는 항상 true/false 참/거짓 맞다/틀리다
1) >초과[크다] 			<미만[작다] 
2) >=이상[크거나같다] 		<=이하[작거나같다]
3) ==같다[데이터만비교]		===같다[데이터/자료형 비교]
4) !=같지않다[아니다/제외]	!==같지않다[데이터/자료형 비교]


4. 관계연산자: 비교연산자 2개 이상일 때
1) &&(and): 비교연산자 결과 모두 참일 때, 참
2) ||(or) : 비교연산자 결과 1개라도 참이면, 참
3) !(not) : 비교연산자 결과가 참이면, 거짓 

5. 대입연산자
1) = : 오른쪽 데이터를 왼쪽에 대입
2) +=: 오른쪽 데이터를 왼쪽에 더한 후 왼쪽에 대입 (변수 = 변수 + 3 == 변수 += 3 ) 

6. 증감연산자
1) 변수++ [후위 1증가]		변수-- [후위 1감소]
2) ++변수 [선위 1증가]		--변수 [선위 1감소]

7. 삼항연산자: 조건이 참이면, 참 값 반환, 거짓이면 거짓 값 반환
1) 기본 형태 => 조건 ? 참 : 거짓
   ex) 나이>=19 ? "성인" : "청소년"
2) 중첩 형태 => 조건1 ? 참1 :
						  조건2 ? 참2 :
						 	   	      조건3 ? 참3 : 거짓


*/
console.log( "&&(and): " + (10>3 && 10>5) )
console.log( "||(or)): " + (10>3 || 3>5) )
console.log( "!(not): " + !(10>3) )

// 문제1)
// 1. 국어, 영어, 수학 점수를 입력받아 변수에 저장
// 2. 총점 출력, 평균 출력

/*	------------------------------------------------------------ 잠시 보류 처리

let Korean_S = Number(prompt("국어 점수 입력"))	// 국어 변수 선언
let English_S = Number(prompt("영어 점수 입력")) // 영어 변수 선언
let Math_S = Number(prompt("수학 점수 입력")) 	// 수학 변수 선언

let Sum = Korean_S + English_S + Math_S
let Average = (Sum/3)

console.log("총점 출력: " + Sum)
console.log("평균 출력: " + Average)

// 문제2) prompt 함수로 반지름 입력받아서 원넓이(반지름x반지름x3.14) 출력

const PI1 = 3.14
let Radius = Number(prompt("반지름을 입력하시오."))
let CircleArea = Radius*Radius*PI1
console.log("원넓이: " + CircleArea + "//입력값: " + Radius)

// 문제3) prompt 함수로 두 실수를 입력받아서 앞 실수의 값이 뒤 실수의 값의 몇프로를 차지하는지 출력

let Num1 = Number(prompt("첫번째 숫자를 입력하시오."))
let Num2 = Number(prompt("두번째 숫자를 입력하시오."))
let Percent = Num1/Num2*100
console.log("Num1/Num2 차지 비중: " + Percent + "//입력값1: " + Num1 + ", 입력값2: " + Num1)

// 문제4) 정수를 입력받아 홀수(true) / 짝수(false) 출력
let Num3 = Number(prompt("정수를 입력하시오."))
console.log("홀수(true)/짝수(false)" + (Num3%2==1) + "//입력값: " + Num3 )


// 문제5) 7배수이면 true / 아니면 false
let Num4 = Number(prompt("정수를 입력하시오"))
console.log("7의 배수O(true)/7의 배수X(false)" + (Num4%7==0) + "//입력값: " + Num4)

// 문제6) 십만원 단위의 금액을 입력받아 지폐 개수 세기
let Num5 = Number(prompt("금액을 입력하시오.(Min:100,000원, Max:999,999원"))
let cal3 = parseInt((Num5/100000))
let cal4 = parseInt((Num5/10000) % 10)
let cal5 = parseInt((Num5/1000) % 10)
let cal6 = parseInt((Num5/100) % 10)
let cal7 = parseInt((Num5/10) % 10)
let cal8 = parseInt((Num5 % 10))

console.log()
console.log("입력받은 금액: " + Num5 + "//십만원:" + cal3 +"," + "만원:" + cal4 +"," + 
			"천원:" + cal5 +"," + "백원: " + cal6 +"," + "십원: " + cal7 +","+ "일원: " + cal8 )

// 문제7) prompt 함수 로 아이디와 비밀번호를 입력받아 아이디가 admin 이고 비밀번호가 1234 와 일치하면
//       (결과: 맞으면 true 출력 아니면 false 출력 )
let IdPut = prompt("아이디를 입력하시오")
let PwPut = Number(prompt("비밀번호를 입력하시오"))
console.log("일치(true)/불일치(false):" + (IdPut=="admin")&&(PwPut==1234))

// 문제8)prompt 함수로 정수를 입력받아 홀수 이면서 7배수이면 true 아니면 false 출력
let Num6 = Number(prompt("정수를 입력하시오."))
console.log("7의배수+홀수면 True:" + (Num6%7==0)&&(Num6%2==1))

------------------------------------------------------------------------------------ */	

/*
// 4. 대입 연산자
let data3 = 10; // 선언과 동시에 대입하는 경우를 "초기화"라고 칭한다.
data3 += 2 		// == data3 = data3 + 2
console.log( "+= 대입 결과: " + data3 )
data3 -= 5 		// == data3 = data3 - 5
console.log( "-= 대입 결과: " + data3 )
data3 *= 2		// == data3 = data3 * 2
console.log( "*= 대입 결과: " + data3 )
data3 /= 3		// == data3 = data3 / 3
console.log( "/= 대입 결과: " + data3 )
data3 %= 5		// == data3 = data3 % 5
console.log( "%= 대입 결과: " + data3 )

// 5. 증감연산자 (활용: 조회수: 조회1개 증가에 맞춰 조회수 1개 증가, 재고: 주문1개 증가에 맞춰 1개 감소)
let data4 = 10;
console.log( "변수값 확인: " + data4 )		// 예상: 10
console.log( "변수값++:" + (data4++))		// 예상: 10 (출력 후 후위증감 실행)
console.log( "변수값 확인: " + data4 )		// 예상: 11 (후위증감 적용)
console.log( "++변수값:" + (++data4))		// 예상: 12 (선위증감 실행 후 출력)

console.log( "변수--:" + (data4--))		// 예상: 12 (출력 후 후위감소 실행)
console.log( "변수값 확인: " + data4 )		// 예상: 11 (후위감소 적용)
console.log( "--변수값:" + (--data4))		// 예상: 10 (선위감소 실행 후 출력)

// 6. 삼항연산자
let age = Number(prompt("나이를 입력하시오"))
let agePart = age <= 19 ? "청소년" : "성인"
console.log( age + ", 나이 분류:" + agePart)

let score = Number(prompt("점수를 입력하시오"))
let scoreClass = score >= 90 ? "1등급" : score >= 80 ? "2등급" : score >= 70 ? "3등급" : score >= 60 ? "4등급" : "탈락"
console.log( score + ", 등급:" + scoreClass)

// 문제9) 정수를 입력받아서 홀수인지 짝수인지 출력하시오.
let data5 = Number(prompt("정수를 입력하시오."))
let data5Estimate = data5 % 2 == 0 ? "짝수" : "홀수"
console.log( "입력값: " + data5 + "분류: " + data5Estimate )

// 문제10) 정수 2개를 입력받아 더 큰수를 출력
let data6 = Number(prompt("첫번째 정수를 입력하시오."))
let data7 = Number(prompt("두번째 정수를 입력하시오."))
let data67Compare = data6 > data7 ? data6 : data6 < data7 ? data7 : "동일"
console.log( "입력값1: " + data6 + ", 입력값2:" + data7 + "비교 결과: " + data67Compare )

// 문제11) 정수 3개를 입력받아 더 큰수를 출력
let data8 = Number(prompt("첫번째 정수를 입력하시오."))
let data9 = Number(prompt("두번째 정수를 입력하시오."))
let data10 = Number(prompt("세번째 정수를 입력하시오."))
let dataStore1 = data8
dataStore1 = dataStore1 < data9 ? data9 : dataStore1
dataStore1 = dataStore1 < data10 ? data10 : dataStore1
console.log("가장 큰 수: " + dataStore1)
*/

// 문제12) 정수 3개를 입력받아 오름차순으로 출력
let data11 = Number(prompt("첫번째 정수를 입력하시오."))
let data12 = Number(prompt("두번째 정수를 입력하시오."))
let data13 = Number(prompt("세번째 정수를 입력하시오."))

let dataMin = data11
dataMin = dataMin > data12 ? data12 : dataMin
dataMin = dataMin > data13 ? data13 : dataMin

let dataMiddle = data11
dataMiddle = dataMiddle < data12 ? data12 : dataMiddle
dataMiddle = dataMiddle < data13 ? dataMiddle : data13

let dataMax = data11
dataMax = dataMax < data12 ? data12 : dataMax
dataMax = dataMax < data13 ? data13 : dataMax

console.log("입력값1: " + data11 + "입력값2: " + data12 + "입력값3: " + data13 + "오름차순 정렬: " + dataMin +", " + dataMiddle +", " + dataMax)
