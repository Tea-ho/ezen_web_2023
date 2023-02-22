package 과제.과제11_MVC_DB적용;

public class ProductDTO {

	// 필드 영역
	private int pNo;
	private String pName;
	private int pPrice;
	private int pStock;
	
	// 생성자 영역
	// Empty 생성자 생성
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Full 생성자 생성
	public ProductDTO(int pNo, String pName, int pPrice, int pStock) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pStock = pStock;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "ProductDTO [pNo=" + pNo + ", pName=" + pName + ", pPrice=" + pPrice + ", pStock=" + pStock + "]";
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getpStock() {
		return pStock;
	}
	public void setpStock(int pStock) {
		this.pStock = pStock;
	}
}
