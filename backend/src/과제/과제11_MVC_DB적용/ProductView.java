package 과제.과제11_MVC_DB적용;
// 싱글톤 적용

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
	
	Scanner scanner = new Scanner(System.in);
	
	private static ProductView view = new ProductView();
	
	private ProductView() {}
	
	public static ProductView getInstance() {
		return view;
	}
	
	public void index() {
		while(true) {
			System.out.println("-----------------------제품 관리 화면-----------------------");
			System.out.print("[메뉴] 1.제품등록[C] 2.제품출력[R] 3.제품수정[U] 4.제품삭제[D]");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				register();
			}
			else if(choice == 2) {
				list();
			}
			else if(choice == 3) {
				System.out.println("[메뉴] 1.제품정보 변경 2.재고 변경");
				int chUpdate = scanner.nextInt();
				if(chUpdate == 1) {
					updateInfo();
				}
				else if(chUpdate == 2) {
					updateStock();
				}
				else {System.out.println("[알림] 번호를 다시 입력해주세요.");}
			}
			else if(choice == 4) {
				delete();
			}
			else { System.out.println("[알림] 번호를 다시 입력해주세요.");}	
		}
	}
	
	public void register() {
		System.out.println("-----------------------제품 등록 화면-----------------------");
		System.out.print("제품명: ");		String pName = scanner.next();
		System.out.print("제품가격: ");		int pPrice= scanner.nextInt();
		System.out.print("제품재고: ");		int pStock= scanner.nextInt();
		
		boolean result = ProductController.getInstance().register(pName, pPrice, pStock);
		if( result ) { System.out.println("[알림] 제품 정상 등록 완료");	}
		else {System.out.println("[알림] 제품 등록 실패");}
	}
	
	public void list() {
		System.out.println("-----------------------제품 등록 리스트-----------------------");
		System.out.printf("%2s \t %10s \t %10s \t %10s \n", "번호", "제품명", "제품가격", "제품재고");
		
		ArrayList<ProductDTO> list = ProductController.getInstance().list();

		for(ProductDTO x : list) {
			System.out.printf("%2s \t %10s \t %10s \t %10s \n", x.getpNo(), x.getpName(), x.getpPrice(), x.getpStock());
		}

	}
	
	public void updateInfo() {
		System.out.println("-----------------------제품 정보 변경-----------------------");
		System.out.print("변경할 제품번호: ");		int pNo = scanner.nextInt();
		System.out.print("변경할 제품명: ");		String pName = scanner.next();
		System.out.print("변경할 제품가격: ");		int pPrice = scanner.nextInt();
		
		if(ProductController.getInstance().updateInfo(pNo, pName, pPrice)) {
			System.out.println("[알림] 제품 정보 수정 완료");
		}
		else { System.out.println("[알림] 제품 정보 수정 실패"); }
		
	}
	public void updateStock() {
		System.out.println("-----------------------제품 재고 변경-----------------------");
		System.out.print("변경할 제품번호: ");		int pNo = scanner.nextInt();
		System.out.print("변경할 제품재고: ");		int pStock = scanner.nextInt();
		
		if( ProductController.getInstance().updateStock(pNo, pStock) ) {
			System.out.println("[알림] 제품 재고 수정 완료");
		}
		else {System.out.println("[알림] 제품 재고 수정 실패");}
	}
	public void delete() {
		System.out.println("-----------------------제품 삭제 화면-----------------------");
		System.out.println("삭제할 제품번호: ");	int pNo = scanner.nextInt();
		
		if( ProductController.getInstance().delete(pNo) ) {
			System.out.println("[알림] 제품 삭제 완료");
		}
		else {System.out.println("[알림] 제품 삭제 실패");}
	}
}
