package com.koreait.board4.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board4.DBUtils;
import com.koreait.board4.MyUtils;
import com.koreait.board4.UserDAO;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVo vo = (UserVo) hs.getAttribute("loginUser");
		
		if (vo != null) 
		{
			response.sendRedirect("/board/list");
			return;
		}
		
		MyUtils.openJSP("/user/login", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
////		String iuser = request.getParameter("iuser");
//		int iuser = MyUtils.getParamInt("iuser", request);
//		String unm = request.getParameter("unm");
		
		UserVo vo = new UserVo();
		
		vo.setUid(uid);
		vo.setUpw(upw);
//		vo.setIuser(iuser);
		
		int result = UserDAO.loginUser(vo);
		System.out.println("result : " + result);
		
		if (result == 1) { //login success
			HttpSession hs = request.getSession();
			vo.setUpw(null);
			hs.setAttribute("loginUser", vo);
			//vo가 가리키는 유저객체는 아이유저 아이디 이름 값만 담고있다.
			
			response.sendRedirect("/board/list");
			return;
		}
		
		
		
		String errMsg = null;
		switch (result) {
		case 0:
			errMsg = "에러가 발생하였습니다";
			break;
		case 2:	
			errMsg = "id 학인해 주세요";
			break;
		case 3:
			errMsg = "pass 확인해 주세요";
			break;
		}
		request.setAttribute("errMsg", errMsg);
		doGet(request, response);
		
	}

}
