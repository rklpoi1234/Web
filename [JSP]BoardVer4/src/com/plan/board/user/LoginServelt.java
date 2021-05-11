package com.plan.board.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plan.board.MYUtils;

@WebServlet("/user/login")
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServelt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVo loginUser = (UserVo) hs.getAttribute("loginUser");
		if (loginUser != null) 
		{
			response.sendRedirect("/board/list");
			return;
			
		}
		MYUtils.openJSP("user/login", request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		UserVo vo = new UserVo();
		
		vo.setUid(uid);
		vo.setUpw(upw);
		
		//login 성공:1 실패:0 아이디x:2 비밀번호x:3
		int result = UserDAO.loginUser(vo);
		System.out.println("result : " +result);
		
		if (result == 1) 
		{ //성공시 1
			HttpSession hs = request.getSession();
			vo.setUpw(null); //iuser, uid , unm 값만 담고 있음 
			hs.setAttribute("loginUser", vo);
			
			response.sendRedirect("/board/list");
			return;
		}
		//로그인 실패시 errmsg 값을 널로일단만듬
		String errMsg =null;
		switch (result) 
		{
		case 0:
			errMsg = "Error발생";
			break;
		case 2:
			errMsg = "아이디 확인부탁";
			break;
		case 3:
			errMsg = "비밀번호 확인부탁";
			break;
		}
		request.setAttribute("errMsg", errMsg);
		doGet(request, response);
		
	}

}
