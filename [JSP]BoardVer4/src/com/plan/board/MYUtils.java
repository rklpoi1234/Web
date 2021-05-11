package com.plan.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MYUtils 
{

	public static void openJSP(String fileNm, HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException
	{
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
		req.getRequestDispatcher(jsp).forward(req, res);
	}
	
	public static int parseStrToInt (String val) 
	{	//getpara 안하고 int변경
		try 
		{
			int result = Integer.parseInt(val);
			return result;
		} 
		catch(Exception e) 
		{
			return 0;
		}
	}
	
	public static int getParamInt (String Key, HttpServletRequest req)
	{
		String val = req.getParameter(Key);
		int intVal = parseStrToInt(val);
		return intVal;
	}
}
