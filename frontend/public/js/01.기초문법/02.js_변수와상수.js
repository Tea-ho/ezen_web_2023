// 1. 변수 내용
let value1 = 10		//해석: 변수 value1 선언 (초기값: 10)
console.log( "변수값: " + value1 )

value1 = 20			//해석: 변수 value1(기존 데이터:10)에 새로운 값 입력 (변경값: 20)
console.log( "변수값: " + value1 )


 console.log( "변수값 더하기 5: " + value1+5 ) // + 연결자 역할 => 20하고 5를 연결해줌(출력값: 205)
 console.log( "변수값 더하기 5: " + (value1+5) ) // + 연산자 역할 => 20하고 5를 더해줌(출력값: 25)
 
 let value2 = 30
 let result = value1 + value2
 
 console.log("변수들 간 연산: " + result)
 
 // 2. 상수 내용
 const data1 = 10
 const data2 = 20
 const result2 = data1 + data2 
 //data1 = 20		// 시스템 오류 발생(원인: 상수는 변경이 불가능하기 때문)
 
 console.log("상수 데이터 확인: " + data1 )
 console.log("상수 연산 확인: " + result2 )
 
 