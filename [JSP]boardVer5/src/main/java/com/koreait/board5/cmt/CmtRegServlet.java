package com.koreait.board5.cmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board5.MyUtils;
import com.koreait.board5.board.BoardVO;

@WebServlet("/board/regCmt")
public class CmtRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CmtRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int icmt = MyUtils.getParamInt("icmt", request);
		int iuser = MyUtils.getLoginUserPk(request);
		
		CmtVo vo = new CmtVo();
		vo.setIcmt(icmt);
		vo.setIuser(iuser);
		
		CmtDAO.delCmt(vo);
		
		response.sendRedirect("/board2/detail2?iboard=" + iboard);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		String cmt = request.getParameter("cmt");
		int iuser = MyUtils.getLoginUserPk(request);
		
		CmtVo vo = new CmtVo();
		
		vo.setIboard(iboard);
		vo.setCmt(cmt);
		vo.setIuser(iuser);
		
		CmtDAO.insCmt(vo);
		
		response.sendRedirect("/board2/detail2?iboard=" + iboard);
	}

}
