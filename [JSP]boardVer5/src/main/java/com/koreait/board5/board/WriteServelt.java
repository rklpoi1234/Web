package com.koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board5.DBUtils;
import com.koreait.board5.MyUtils;
import com.koreait.board5.board.BoardDAO;
import com.koreait.board5.board.BoardVO;
import com.koreait.board5.user.UserVo;

@WebServlet("/board/write")
public class WriteServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("board/write", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		HttpSession hs = request.getSession();
		UserVo loginUser = (UserVo) hs.getAttribute("loginUser");
		
		int iuser = loginUser.getIuser();
		
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		vo.setIuser(iuser);
		
		BoardDAO.insertBoardVo(vo);
		
		response.sendRedirect("/board/list");
		
	}

}
