package com.web.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	public static int insertBoard(BoardVo3 vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into t_board (title, ctnt)"
				+ "values (?,?)";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			
			System.out.println(ps.toString());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally
		{
			DBUtils.close(con, ps);
		}
		return 0;
	}
	
	public static List<BoardVo3> selBoardList()
	{
		List<BoardVo3> list = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select iboard,title,regdt from t_board";
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				BoardVo3 vo = new BoardVo3();
				list.add(vo);
				
				int iboard = rs.getInt("iboard");
				String title = rs.getString("title");
				String regdt = rs.getString("regdt");
				
				vo.setIboard(iboard);
				vo.setTitle(title);
				vo.setRegdt(regdt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return list;
	}
	
	public static BoardVo3 selBoard(int iboard)
	{
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from t_board where iboard =?";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, iboard);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
					BoardVo3 vo = new BoardVo3();
					
					String title = rs.getString("title");
					String ctnt = rs.getString("ctnt");
					String regdt = rs.getString("regdt");
					
					vo.setIboard(iboard);				
					vo.setTitle(title);
					vo.setCtnt(ctnt);
					vo.setRegdt(regdt);
					
					return vo;	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return null;
	}
	
	public static int delBoard(BoardVo3 param)
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from t_board where iboard = ? ";
		
		try {
			
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIboard());
			
			System.out.println(ps.toString());
			return ps.executeUpdate(); //insert, update, delete 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		return 0;
				
	}
	
	public static int updBoard(BoardVo3 param)
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE t_board"
				+ " SET title = ?"
				+ ", ctnt = ?"
				+ " where iboard = ?";
		
		try {
			
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.setInt(3, param.getIboard());
			
			System.out.println(ps.toString());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
		return 0;
	
	}
	
}
