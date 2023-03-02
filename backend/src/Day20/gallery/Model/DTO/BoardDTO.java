package Day20.gallery.Model.DTO;

public class BoardDTO {
	private int bno; 
    private String btitle;
    private String bcon;
    private String bdate;
    private int bview;
    private String mid;
    private String cname;
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDTO(int bno, String btitle, String bcon, String bdate, int bview, String mid, String cname) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcon = bcon;
		this.bdate = bdate;
		this.bview = bview;
		this.mid = mid;
		this.cname = cname;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcon() {
		return bcon;
	}
	public void setBcon(String bcon) {
		this.bcon = bcon;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getBview() {
		return bview;
	}
	public void setBview(int bview) {
		this.bview = bview;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", btitle=" + btitle + ", bcon=" + bcon + ", bdate=" + bdate + ", bview="
				+ bview + ", mid=" + mid + ", cname=" + cname + "]";
	}
}
