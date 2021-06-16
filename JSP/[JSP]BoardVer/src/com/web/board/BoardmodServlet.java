package com.web.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod")
public class BoardmodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		int inNo = Integer.parseInt(no);
		
		BoardVO vo = Database.list.get(inNo);
		
		request.setAttribute("list", vo);
		
		String jsp = "/WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("wo");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		int intNo = Integer.parseInt(no);
		
		BoardVO vo = Database.list.get(intNo);
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		//Database.list.remove(intNo);
		
		//Database.list.add(vo);
		
		response.sendRedirect("/list");
		
	}

}
