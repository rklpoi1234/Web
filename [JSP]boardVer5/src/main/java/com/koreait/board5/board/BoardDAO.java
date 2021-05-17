package com.koreait.board5.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.koreait.board5.DBUtils;
import com.koreait.board5.board.BoardVO;


public class BoardDAO {
	
	public static int updBoard (BoardVO vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " UPDATE t_board SET title = ? , ctnt = ? WHERE iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.setInt(3, vo.getIboard()); 
		
			System.out.println(vo.getIboard());
			System.out.println("vo" + vo);
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
		return 0;
		
	}
	public static List<BoardVO> selBoardList() {
		List<BoardVO> list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		

		String sql = " SELECT A.iboard, A.title, A.iuser, A.regdt, B.unm "
				+ " FROM t_board A "
				+ " INNER JOIN t_user B "
				+ " ON A.iuser = B.iuser "
				+ " ORDER BY iboard DESC ";
		
		try {
			con = com.koreait.board5.DBUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
//				int iboard = rs.getInt("iboard");
//				String title = rs.getString("title");
//				String regdt = rs.getString("regdt");
//				String unm = rs.getString("unm");
				
				BoardVO vo = new BoardVO();
				
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setRegdt(rs.getString("regdt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setUnm(rs.getString("unm"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			com.koreait.board5.DBUtils.close(con, ps, rs);
		}
		return list;
	}
	
	public static BoardVO selBoard(BoardVO vo )
	
	{	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardVO data =null;
		
		String sql = "SELECT A.iboard, A.title, A.iuser, A.regdt, A.ctnt, B.unm as ddd"
				+ " FROM t_board A "
				+ " LEFT JOIN t_user B "
				+ " ON A.iuser = B.iuser "
				+ " WHERE iboard = ? ";

		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getIboard());
			rs = ps.executeQuery();
			
			if (rs.next()) 
			{
//				int iboard = rs.getInt("iboard");
//				String title = rs.getString("title");
//				String ctnt = rs.getString("ctnt");
//				String regdt = rs.getString("regdt");
//				String unm = rs.getString("ddd");
//				int iuser = rs.getInt("iuser");
//				
				data = new BoardVO();
				data.setIboard(rs.getInt("iboard"));
				data.setTitle(rs.getString("title"));
				data.setCtnt(rs.getString("ctnt"));
				data.setRegdt(rs.getString("regdt"));
				data.setUnm(rs.getString("ddd"));
				data.setIuser(rs.getInt("iuser"));
				
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			return data;
		} finally {
			DBUtils.close(con, ps, rs);
		}
		
}
	public static int delBoard(BoardVO vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " DELETE FROM t_board WHERE iboard = ? ";
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getIboard());
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtils.close(con, ps);
		}
	}
	public static int insertBoardVo(BoardVO vo) 
	{	
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board(iuser,title,ctnt) "
				+ "VALUES (?,?,?)";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, vo.getIuser());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getCtnt());
		
			System.out.println("vo" + vo);
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
