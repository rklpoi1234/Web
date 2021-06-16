package com.koreait.board5;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board5.user.UserVo;

public class MyUtils {
	public static void openJSP (String fileNm, HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		String jsp = "/WEB-INF/view/"+ fileNm + ".jsp";
		req.getRequestDispatcher(jsp).forward(req, res);
	}
	
	public static int getParamInt(String key, HttpServletRequest req)
	{
		String val = req.getParameter(key);
		int intVal = StringToInt(val);
		return intVal;
	}
	
	public static int StringToInt (String val)
	{
		try {
			return Integer.parseInt(val);
		} catch (Exception e) {
			return 0;
		}
		
	}
	public static int getLoginUserPk(HttpServletRequest req)
	{
		if (req == null) {
			return 0;
		}
		return getLoginUser(req).getIuser();
	}
	
	public static UserVo getLoginUser(HttpServletRequest req)
	{
		if (req == null) {
			return null;			
		}
		HttpSession hs = req.getSession();
		return (UserVo) hs.getAttribute("loginUser");
		
	}
}
