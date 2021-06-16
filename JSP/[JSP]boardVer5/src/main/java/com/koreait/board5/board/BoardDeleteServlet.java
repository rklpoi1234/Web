package com.koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board5.MyUtils;

@WebServlet("/board/del")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int intIboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPk(request);
		
		BoardVO param = new BoardVO();
		param.setIboard(intIboard);
		param.setIuser(iuser);
		
		BoardDAO.delBoard(param);
		
		response.sendRedirect("/board/list");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
