package practice.day02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class practice
 */
@WebServlet("/practice")
public class practice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public practice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
			// ------------------------------------------------ data 송신 확인 완료
			/*
			System.out.println( request.getParameter("info"));
			System.out.println( request.getParameter("data1"));
			System.out.println( request.getParameter("data2"));
			System.out.println( request.getParameter("data3"));
			System.out.println( request.getParameter("data4"));
			System.out.println( request.getParameter("data5"));
			System.out.println( request.getParameter("data6"));
			System.out.println( request.getParameter("data7"));
			System.out.println( request.getParameter("data8"));
			System.out.println( request.getParameter("data9"));
			System.out.println( request.getParameter("data10"));
			*/
		
		// 변수 선언 이유: JS에서 받은 데이터를 변수에 저장
		// 포인트: JS로부터 받은 데이터는 모두 문자열로 들어오기 때문에, 사용하고자 하는 형태에 맞추는 작업이 필요함! (형 변환)
		String data1 = request.getParameter("info");
		String data2 = request.getParameter("data1");
		double data3 = Double.parseDouble( request.getParameter("data3") );
		int data4 = Integer.parseInt(request.getParameter("data4"));
		String data5 = request.getParameter("data5");
		String data6 = request.getParameter("data6");
		String data7 = request.getParameter("data7");
		boolean data8 = Boolean.parseBoolean(request.getParameter("data8"));
		String data9 = request.getParameter("data9");
		String data10 = request.getParameter("data10");
		
		// Dao에 데이터 전송 후 result 변수로 결과값 반환받기
		boolean result =
				Dao.getInstance().setData(data1, data2, data3, data4, data5, data6, data7, data8, data9, data10);
		
		// 전달받은 내용 JS에 알려주기: response
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("DB 저장 여부:" + result);
			
	}

}
