package com.koreait.board5.board2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board5.MyUtils;
import com.koreait.board5.board.BoardDAO;
import com.koreait.board5.board.BoardVO;
import com.koreait.board5.user.UserVo;

@WebServlet("/board2/list2")
public class BoardList2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardList2Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVo vo = (UserVo) hs.getAttribute("loginUser");
		if (vo == null) {
			response.sendRedirect("/user/login");
			return;
		}
		request.setAttribute("list", BoardDAO.selBoardList());
		
		
		MyUtils.openJSP("/boardTest/list2", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
