package com.koreait.board4;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
}
