package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBConn;


@WebServlet("/join.bs")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public JoinServlet() {
        super();
       

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/WEB-INF/join.jsp")
		.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글처리
		request.setCharacterEncoding("utf8");
		
		String a = request.getParameter("id");
		String b = request.getParameter("pw");
		String c = request.getParameter("pw1");
		String d = request.getParameter("name");
		String e = request.getParameter("age");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//DB 연결 connection 객체
		Connection conn = DBConn.connector();
		
		//SQL문 작성 : INSERT INTO 테이블명 VALUES(추가할 값들)
		String sql = "INSERT INTO member VALUES(?,?,?,?,NOW())";
		
		//SQL문의 ?에 값넣기
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, a); //?의 첫번째는 a에 있는 값을 문자형태로 넣음
			ps.setString(2, b); //?의 두번째는 b나c에 있는 값을 문자형태로 넣음
			ps.setString(3, d); //?의 세번째는 b에 있는 값을 문자형태로 넣음
			ps.setInt(4, Integer.parseInt(e)); //?의 세번째는 b에 있는 값을 문자형태로 넣음
			
			//SQL문 수행함. INSERT UPDATE DELETE에서 받음.
			ps.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		//적절한 페이지를 이동
		
		response.sendRedirect("index.bs");
				
	}

}
