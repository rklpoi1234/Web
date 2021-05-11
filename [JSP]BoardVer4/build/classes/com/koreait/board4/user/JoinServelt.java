package com.koreait.board4.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.board4.MyUtils;
import com.koreait.board4.UserDAO;

@WebServlet("/user/join")
public class JoinServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("/user/join", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		String unm = request.getParameter("unm");
//		String gender = request.getParameter("gender");
		
		int inGender = MyUtils.getParamInt("gender",request);
		
//		int inGender = Integer.parseInt(gender);
		
		String hashedUpw = BCrypt.hashpw(upw, BCrypt.gensalt());
		System.out.println("hashedUpw : " + hashedUpw);
		
		
		UserVo vo = new UserVo();
		
		vo.setUid(uid);
		vo.setUpw(hashedUpw);
		vo.setUnm(unm);
		vo.setGender(inGender);
		
		UserDAO.joinUser(vo);
		
		response.sendRedirect("login");
	}

}
