package Day20.gallery.Model.DTO;

public class ReplyDTO {
	private int rno; 
    private String ccon;
    private String cdate;
    private int rindex;
    private String mid;
    private int bno;
    
	public ReplyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReplyDTO(int rno, String ccon, String cdate, int rindex, String mid, int bno) {
		super();
		this.rno = rno;
		this.ccon = ccon;
		this.cdate = cdate;
		this.rindex = rindex;
		this.mid = mid;
		this.bno = bno;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getCcon() {
		return ccon;
	}

	public void setCcon(String ccon) {
		this.ccon = ccon;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public int getRindex() {
		return rindex;
	}

	public void setRindex(int rindex) {
		this.rindex = rindex;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}
	@Override
	public String toString() {
		return "ReplyDTO [rno=" + rno + ", ccon=" + ccon + ", cdate=" + cdate + ", rindex=" + rindex + ", mid=" + mid
				+ ", bno=" + bno + "]";
	}   
}
