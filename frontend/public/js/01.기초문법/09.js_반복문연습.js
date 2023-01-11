// 문제1> j: 1부터 10이하까지 1씩 증가 반복 [ 한줄씩 출력 ]
console.log('문제1>---------------------------------')
for( let j = 1; j <= 10; j++ ){
	console.log(j)
}

// 문제2> i: 1부터 10이하까지 1씩 증가 반복 [ 한줄에 모두 출력 ]
console.log('문제2>---------------------------------')
let output = '';				// 문자 변수 선언 [깡통]
								// 문자 변수로 선언하지 않으면, 모두 더한 값으로 출력 됨.
for( let i = 1; i <= 10; i++){
	output += i +"\t";
}
console.log(output);

// 문제2-1활용> i: 1부터 10이하까지 1씩 증가 반복 [ 누적합산 출력 ]
console.log('문제2-1>---------------------------------')
let sum = 0;
for( let i = 1; i <= 10; i++){
	sum += i;
}
console.log(sum);

// 문제3> i: 1부터 10이하까지 1씩 증가 반복 [html 출력]
console.log('문제3>---------------------------------')
output = ''		// 변수 output 초기화
for( let i = 1; i <= 10; i++){
	output += i;
}
document.querySelector('body').innerHTML = output
// 해석: 1)"document.querySelector('body')" body 마크업을 JS에서 사용 선언, ".innerHTML = output" output값 HTML화면 출력

// 문제4> 1부터 100까지 7배수 누적합계
console.log('문제4>---------------------------------')
// 풀이1>
sum = 0;
for( let i = 7; i <= 100; i += 7){
	sum += i;
}
console.log(sum);
// 풀이2>
sum=0;
for( let i = 1; i <= 100; i++){
	if( i % 7 == 0){ sum += i; }
}
console.log(sum);

// 문제5> (2단)구구단 [ 단: 2 		곱: 변수]
console.log('문제5>---------------------------------')
for( let i; i <= 9; i++ ){
	console.log( '2 x ' + i + ' = ' + (2 * i))
}

// 문제6> 구구단 [ 단: 변수			곱: 변수]
console.log('문제6>---------------------------------')
for( let i; i <= 9; i++ ){
	for( let j; j<=9; j++){
		console.log( i + 'x' + j + '=' + (i*j))
	}
}
