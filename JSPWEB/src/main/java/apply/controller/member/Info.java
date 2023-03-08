package apply.controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.digester.SystemPropertySource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import apply.model.dao.MemberDao;
import apply.model.dto.MemberDto;


@WebServlet("/apply/member")
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Info() {super(); }

	// 1. 회원가입
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ------------------------ 첨부파일 없을 경우 ------------------------
		/*
		// 1. 호환 설정
		request.setCharacterEncoding("UTF-8");
		
		// 2. ajax data 받기
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String memail = request.getParameter("memail");
		String mimg = request.getParameter("mimg");
		
		// 3. ajax로 받은 data dto에 저장
		MemberDto dto = new MemberDto(0, mid, mpw, mimg, memail);
			System.out.println("dto: " + dto);
		
		// 4. 저장한 dto 데이터 dao에 전송 후 결과 확인
		boolean result = MemberDao.getInstance().signup(dto);
		response.getWriter().print(result);
		*/
		
		// ------------------------ 첨부파일 있을 경우 ------------------------
		// request: 첨부파일(대용량) 요청이 불가능함
		// 해결 방법: 외부 라이브러리 사용 (cos.jar)
		// cos.jar에서 제공하는 MultipartRequest 클래스 활용
		
		// tip> 현재 서버 경로 찾기
		String uploadpath = request.getSession().getServletContext().getRealPath("/apply/member/pimg");
		System.out.println(uploadpath);
		
		MultipartRequest multi = new MultipartRequest(
									request,						// 요청방식 
									uploadpath,								// 첨부파일 저장할 서버 폴더
									1024*1024*10,					// 첨부파일 용량 설정 [단위 byte로 설정되어 있음]
									"UTF-8",						// 인코딩 타입 설정
									new DefaultFileRenamePolicy()	// 동일한 첨부파일명으로 중복 업로드 될 경우, 식별이 불가능해지는 상황 예방하는 옵션
																	// 작동원리: 동일 첨부명 존재하면 뒤에 숫자 자동 부여
								);
		
		// multi 사용하여 매개변수 요청 (주의사항: name값으로 식별하기 때문에, name값 설정해야함)
		String mid = multi.getParameter("mid");
		String mpw = multi.getParameter("mpw");
		String memail = multi.getParameter("memail");
		String mimg = multi.getFilesystemName("mimg"); // 파일명 가져오기
		
		MemberDto dto = new MemberDto(0, mid, mpw, mimg, memail);
		System.out.println(dto);
		
		boolean result = MemberDao.getInstance().signup(dto);
		response.getWriter().print(result);
		
	}
    
    // 2. 로그인 / 회원정보 출력 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 호환설정
		response.setCharacterEncoding("UTF-8");
		
		// 2. DB에서 가져온 데이터 저장
		ArrayList<MemberDto> result = MemberDao.getInstance().mList();
		
		// 3. JAVA 객체 -> JS객체로 형변환
		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writeValueAsString(result);
	
		// 4. 전송
		response.setContentType("application/json");
		response.getWriter().print(jsonArray);
		
	}

	// 3. 회원 정보 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	// 4. 회원탈퇴
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
