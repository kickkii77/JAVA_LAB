//파일명 BoardWServlet

package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/boardw.bs")
public class BoardwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BoardwServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/boardw.jsp")
		.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf8");
		
		String a = request.getParameter("t"); //View에서 넘어오는 제목
		String b = request.getParameter("c"); //View에서 넘어오는 내용
		String c = request.getParameter("w"); //View에서 넘어오는 작성자
		
		System.out.println(a); //잘넘어오는지 확인용
		System.out.println(b);
		System.out.println(c);
		
		
		//DB연동 후에 board테이블 추가하기
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("index.bs");
		
		
	}

}
