package com.kyge.board7.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Param;

import com.kyge.board7.MyUtils;

@WebServlet("/board/list")
public class boardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public boardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDTO param = new BoardDTO();
		//pageing
		final int recordCnt = 10;
		int cPage = MyUtils.getParamInt("cPage", request);
		if (cPage == 0) 
		{
			cPage = 1;
		}
		int startIdx = (cPage - 1) * recordCnt;
		param.setStartIdx(startIdx);
		param.setRecordCnt(recordCnt);
		
		request.setAttribute("pagingCnt", BoardDAO.selPagingCnt(param));
		request.setAttribute("list", BoardDAO.selBoardList(param));

		//search
		int searchType = MyUtils.getParamInt("searchType", request);
		String searchText = request.getParameter("searchText");
		
		if (searchType != 0 && searchText != null && !searchText.equals("")) {
			param.setSearchType(searchType);
			param.setSearchText(searchText);
		}
		MyUtils.openJSP("리스트", "board/list", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
