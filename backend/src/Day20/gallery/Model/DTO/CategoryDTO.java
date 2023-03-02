package Day20.gallery.Model.DTO;

public class CategoryDTO {
	private int cno;
    private String cname;
    
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoryDTO(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "CategoryDTO [cno=" + cno + ", cname=" + cname + "]";
	}
}
