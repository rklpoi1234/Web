package com.koreait.board4.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board4.MyUtils;
import com.koreait.board4.user.UserVo;

@WebServlet("/board/list")
public class BoardListServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs = req.getSession();
		UserVo vo = (UserVo)hs.getAttribute("loginUser");
		
		if (vo == null) {
			res.sendRedirect("/user/login");
			return;
		} 
		List<BoardVO> list = BoardDAO.selBoardList();
		req.setAttribute("list", list);
		MyUtils.openJSP("/board/list", req, res);
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession hs = request.getSession();
//		
//		Boolean loginSuccess = (Boolean) hs.getAttribute("loginSuccess");
//		System.out.println("loginSuccess: " + loginSuccess);
//		if (loginSuccess == null || loginSuccess == false) {
//			response.sendRedirect("/board/list");
//			return;
//			
//		}
////		MyUtils.openJSP("/board/list", request, response);
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
