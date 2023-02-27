package Day19.Ex06;

import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean musicState = false;
		boolean movieState = false;
		
		Music music = new Music();
		Movie movie = new Movie();
		
		
		while(true) {
			System.out.print("[메뉴] 1.음악재생/중지 2.영화재생/중지: ");
			int ch = scanner.nextInt();
			
			if( ch == 1 && musicState == false ) {
				music.start();
				musicState = true;		music.stop = true;
			}
			else if( ch == 1 && musicState == true ) {
				musicState = false;		music.stop = false;
			}
			else if( ch == 2 && movieState == false ) {
				movie.start();
				movieState = true;		movie.stop = true;
			}
			else if( ch == 2 && movieState == true ) {
				movieState = false;		movie.stop = false;
			}
		}
	}
}
