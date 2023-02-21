package Day15.Ex08.MVC패턴;
// DTO: Data Transfer Object (데이터 이동 객체)
// 목적: 이동할 때 사용하는 객체

public class MemberDTO {

	// 필드 영역 [DB 필드와 일치화, private로 선언]
	private int mNo;
	private String mID;
	private String mPW;
	
	// 생성자 영역
	// Empty 생성자 생성
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Full 생성자 생성
	public MemberDTO(int mNo, String mID, String mPW) {
		super();
		this.mNo = mNo;
		this.mID = mID;
		this.mPW = mPW;
	}
	
	// 메소드 영역 (필수 생성: getter&setter, toString)
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmID() {
		return mID;
	}
	public void setmID(String mID) {
		this.mID = mID;
	}
	public String getmPW() {
		return mPW;
	}
	public void setmPW(String mPW) {
		this.mPW = mPW;
	}
	@Override
	public String toString() {
		return "BoardDTO [mNo=" + mNo + ", mID=" + mID + ", mPW=" + mPW + "]";
	}
}
