/*	과제06 요구사항 (화요일까지 제출)
	[공격했을 때]
	1. 몬스터가 사정거리 안에 있을 때, 공격키를 누르면 타격 출력	o
	2. 몬스터 HP 100 출력 (게임 화면 위)	o
	3. 타격 되었을 때, 몬스터 HP 차감	[ 공결격 난수 +-20 ]	o
	4. 몬스터 HP 0 되면, 몬스터 사라짐		o
	
	[타격받았을 때]
	1. 몬스터와 캐릭터가 겹치는 순간에 캐릭터 HP 차감	o
	2. 캐릭터 HP 100 출력 (게임 화면 위)	o
	3. 타격 받았을 때 HP 차감	[ 공결격 난수 +-10 ]	o
	4. 캐릭터 HP 0 되면 게임 끝	o
	
	[몬스터 배열]
	let monster = [ 
					{ m_img: 'mons.gif', hp: 100, left: 900 },
					{ m_img: 'mons1.gif', hp: 200, left: 900 },
					{ m_img: 'mons2.gif', hp: 300, left: 900 },
				  ]
	=> 앞의 몬스터 HP가 0이되면 다음 배열의 몬스터 출현
	
	[추가 옵션]
	1. 캐릭터 객체화
		let 캐릭터 = {
			img:		캐릭터 이미지
			left:		위치
			exp:		경험치 [0부터 시작해서 100되면 레벨 증가]
			lev:		레벨
			power: 		공격력 [레벨 증가되면 공격력 증가]
	2. 방버
	- S키 누르면, 방어 모션 출력
	- S키 누르고 있으면, 몬스터한테 타격받아도 HP 차감 X
		}
	
*/

// userbox Dom객체 가져오기
let userbox = document.querySelector('.userbox')
let logbox = document.querySelector('.logbox')
let monbox = document.querySelector('.monbox')
let logbox2 = document.querySelector('.logbox2')
let userHP = document.querySelector('.userHP').clientWidth;
/*let monHP = document.querySelector('.monHP').clientWidth;*/

// monster 배열 선언
let monster = [
	{ m_img: 'mon.gif', hp: 200, left: 900, stage: 1 },
	{ m_img: 'mon2.gif', hp: 250, left: 900, stage: 2 },
	{ m_img: 'mon3.gif', hp: 300, left: 900, stage: 3 },
]

// 스테이지 변수 선언
let stage = 1;

let monsterHP = '';

// 몬스터 스테이지에 맞춰 출력
monsterPrint( stage )

	//console.log(userHP)
	//console.log(monHP)

let u_left = 10;
let m_left = 900;
	// userbox 이동 이벤트

// 캐릭터 이동 함수
document.addEventListener( 'keydown' , (e) => { 
	// console.log('키 입력')	//--- 확인 완료
	// console.log( e ) //--- 확인 완료
	// console.log( e.keyCode ) //--- 확인 완료
	
	let key = e.keyCode;
	// 입력된 키 코드 key에 저장
	
	if( key == 37 ){
		u_left -= 10
		u_left = u_left < 0 ? 0 : u_left;
	}
	else if( key == 39 ){
		u_left += 10
		u_left = u_left > 900 ? 900 : u_left;

		userbox.style.backgroundImage = `url("img/URight.png")`
		userbox.style.backgroundSize = `100%`
	}
	else if( key == 32 ){
		userbox.style.backgroundImage = `url("img/URight.png")`
		
		// console.log(m_left-u_left) //--- 정상 확인
		attctUser(stage)
	}	
	
	userbox.style.left = `${ u_left }px`
	logbox.innerHTML = `<div> 캐릭터 좌표: ${ u_left } </div>`
	
} )

// 키에서 손 뗄 때 이벤트
document.addEventListener('keyup', (e)=>{
	userbox.style.backgroundImage = `url("img/User.png")`
	userbox.style.backgroundSize = `90%`
})


setInterval( mon_moving, 500 )

// 몬스터 이동 (난수 활용)
function mon_moving(){
	// console.log('몬스터 이동') //--- 확인 완료
	
	let rand = parseInt( Math.random()*50+1 );	// 이동거리
	let rand2 = parseInt( Math.random()*2);		// 이동방향
	
	if( rand2 == 1 ){m_left += rand}
	else{m_left -= rand}
	
	if( m_left < 0 ){
		m_left = 0;
	}
	
	if( m_left > 900 ){
		m_left= 900;
	}
	monbox.style.left = `${ m_left }px`
	
	logbox2.innerHTML = `<div> 몬스터 좌표: ${ m_left } </div>`
	
	attactMon( stage )
	
}

// 몬스터 출력 함수
function monsterPrint( stage ){
	
		// console.log(stage) //--- 확인 완료
	
	let monsterBox = '';
	let monsterPosition = 900;
	
	for( let i = 0; i < monster.length; i++ ){
		if( monster[i].stage == stage ){
			monsterBox += `<img src="img/${ monster[i].m_img }" width="80%">`
			monsterHP = `${ monster[i].hp }`
			monsterPosition = `${ monster[i].left }`
		}
	}
	
		// console.log(monsterHP) //--- 확인 완료
	
	console.log(monsterPosition)
	
	document.querySelector('.monbox').innerHTML = monsterBox;
	document.querySelector('.monHP').style.width = `${ monsterHP }px`
	monbox.style.left = `${ monsterPosition }px`
	
}

// 유저 공격 함수
function attctUser( aindex ){
	
		// console.log(aindex) //--- 인수값 확인 완료
	
	let attack1 = 0
	
	if(stage == 1){
		attack1 = parseInt( Math.random()*60+1 );
	
		if( (m_left-u_left ) >= -50 && ( m_left-u_left ) <= 60 ){
			alert('타격!')
			
			monsterHP -= attack1;
			document.querySelector('.monHP').style.width = `${ monsterHP }px`
			
			if( monsterHP <= 0 ){
				aindex++
				stage = aindex
				monsterPrint(stage)				
			}
			// console.log(monHP) //--- 정상 확인
		}
	}

	if(stage == 2){
		attack1 = parseInt( Math.random()*70+1 );
		
		if( (m_left-u_left ) >= -60 && ( m_left-u_left ) <= 70 ){
				alert('타격!')
				
				monsterHP -= attack1;
				document.querySelector('.monHP').style.width = `${ monsterHP }px`
				
				if( monsterHP <= 0 ){
					aindex++
					stage = aindex
					monsterPrint(stage)
					console.log(stage)
				}
				// console.log(monHP) //--- 정상 확인
		}
	}	
	
	if(stage == 3){
		attack1 = parseInt( Math.random()*80+1 );
		
		if( (m_left-u_left ) >= -70 && ( m_left-u_left ) <= 80 ){
				alert('타격!')
				
				monsterHP -= attack1;
				document.querySelector('.monHP').style.width = `${ monsterHP }px`
				
				if( monsterHP <= 0 ){
					return alert('win');
				}
				// console.log(monHP) //--- 정상 확인
		}
	}		
}


// 몬스터 공격 합수
function attactMon( stage ){
	
	let attack2 = 0;
	
	if(stage == 1 ){
		attack2 = parseInt( Math.random()*10+1 );
		
		if( ( m_left-u_left ) >= -30 && ( m_left-u_left ) <= 30 ){
			alert('공격받았습니다')
			
			userHP -= attack2;
			document.querySelector('.userHP').style.width = `${ userHP }px`
		}
		if(userHP <= 0 ){
			return alert('game over');
			
		}	
	}
	
	if(stage == 2 ){
		attack2 = parseInt( Math.random()*20+1 );
		
		if( ( m_left-u_left ) >= -35 && ( m_left-u_left ) <= 35 ){
			alert('공격받았습니다')
			
			userHP -= attack2;
			document.querySelector('.userHP').style.width = `${ userHP }px`
		}
		
		if(userHP <= 0 ){
			return alert('game over');
		}

	}
	
	if(stage == 3 ){
		attack2 = parseInt( Math.random()*25+1 );
		
		if( ( m_left-u_left ) >= -40 && ( m_left-u_left ) <= 40 ){
			alert('공격받았습니다')
			
			userHP -= attack2;
			document.querySelector('.userHP').style.width = `${ userHP }px`
		}
		
		if(userHP <= 0 ){
			return alert('game over');
		}
	}
}

	// console.log(monsterHP) //--- 정상확인

