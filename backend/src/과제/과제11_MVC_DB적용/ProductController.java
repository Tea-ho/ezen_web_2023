package 과제.과제11_MVC_DB적용;
//싱글톤 적용

import java.util.ArrayList;

public class ProductController {
	
	private static ProductController controller = new ProductController();
	
	private ProductController() {}
	
	public static ProductController getInstance() {
		return controller;
	}
	
	public boolean register( String pName, int pPrice, int pStock ) {
		
		ProductDTO dto = new ProductDTO( 0, pName, pPrice, pStock );
		boolean result = ProductDAO.getInstance().register(dto);
		
		if( result ) {	return true; }
		return false;
	}
	
	public ArrayList<ProductDTO> list(){
		return ProductDAO.getInstance().list();
	}
	
	public boolean updateInfo( int pNo, String pName, int pPrice) {
		return ProductDAO.getInstance().updateInfo(pNo, pName, pPrice);
	}
	
	public boolean updateStock( int pNo, int pStock) {
		return ProductDAO.getInstance().updateStock(pNo, pStock);
	}
	
	public boolean delete( int pNo ) {
		return ProductDAO.getInstance().delete(pNo);
	}
	
	// ------------------------------------------------------------------- 고객 화면
	public ArrayList<ProductDTO> listC(){
		return ProductDAO.getInstance().listC();
	}
	
	public boolean basketChoice(int pNo) {
		return ProductDAO.getInstance().basketChoice(pNo);
	}
	
	public ArrayList<ProductDTO> buyList(){
		return ProductDAO.getInstance().buyList();
	}
	
	public boolean buy( int buy ) {
		return ProductDAO.getInstance().buy(buy);
	}
}
