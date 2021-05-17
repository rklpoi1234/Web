package com.koreait.board5.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board2/logout")
public class BoardLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
//		hs.invalidate();
		hs.removeAttribute("loginUser");
		response.sendRedirect("/user/login");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
