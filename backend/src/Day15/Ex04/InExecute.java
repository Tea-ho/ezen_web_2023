package Day15.Ex04;

public class InExecute {
	public static void main(String[] args) {
		
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			
			if( keyCode != 13 && keyCode != 10 ) { // keyCode 10, 13: enter 
				
				if(keyCode == 49 ) { // keyCode 49: 1
					speed++;
				}
				else if( keyCode == 50 ) { // keyCode 50: 2
					speed--;
				}
				else if( keyCode == 51 ) { // // keyCode 51: 3
					break;
				}
			System.out.println("--------------------------------");
			System.out.println("[선택] 1.증속 2.감속 3.중지 ");
			System.out.println("--------------------------------");
			System.out.println("현재 속도:" + speed);
			System.out.println("선택: ");
			}
			
			try {
				keyCode = System.in.read();
				// 주의사항: 예외 처리 필수!
			}
			catch(Exception e){
				System.out.println("예외 발생: " + e);
			}

		}
		
		System.out.println("프로그램 종료");
		// System.exit(0); 
		// 용도: 프로그램 강제 종료
		// break: 반복문 탈출, return: 함수 탈출
	}
}
