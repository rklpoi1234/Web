package com.kyge.board7;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kyge.board7.user.UserEntity;

public class MyUtils {
	public static void openJSP (String title,String jsp, HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		req.setAttribute(Const.TITLE, title);
		req.setAttribute(Const.JSP, jsp);
		String Gjsp = "/WEB-INF/view/template.jsp";
		req.getRequestDispatcher(Gjsp).forward(req, res);
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
	
	public static UserEntity getLoginUser(HttpServletRequest req)
	{
		if (req == null) {
			return null;			
		}
		HttpSession hs = req.getSession();
		return (UserEntity) hs.getAttribute("loginUser");
		
	}
}
