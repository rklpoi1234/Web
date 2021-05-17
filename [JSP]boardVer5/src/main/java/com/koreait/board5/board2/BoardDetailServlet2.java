package com.koreait.board5.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board5.MyUtils;
import com.koreait.board5.board.BoardDAO;
import com.koreait.board5.user.UserVo;


@WebServlet("/board2/detail2")
public class BoardDetailServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardDetailServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		
		request.setAttribute("BoardUser", BoardDAO.selBoard(iboard));
		
		MyUtils.openJSP("boardTest/detail2", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
