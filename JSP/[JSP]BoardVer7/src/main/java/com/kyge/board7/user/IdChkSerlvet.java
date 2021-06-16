package com.kyge.board7.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kyge.board7.user.UserDAO;

@WebServlet("/user/idChk")
public class IdChkSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdChkSerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		System.out.println("uid : " + uid);
		int result = UserDAO.selIdChk(uid);
		
		response.getWriter()
		.append("{\"result\"}: ")
		.append(String.valueOf(result))
		.append("}");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
