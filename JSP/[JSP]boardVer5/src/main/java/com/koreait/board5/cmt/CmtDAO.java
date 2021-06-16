package com.koreait.board5.cmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.koreait.board5.DBUtils;

public class CmtDAO {
	public static int delCmt(CmtVo vo) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = " DELETE FROM t_board_cmt "
				+ " WHERE icmt = ? AND iuser = ? ";
				
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getIcmt());
			ps.setInt(2, vo.getIuser());
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
		
	}
	
	public static void insCmt(CmtVo param) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = " INSERT INTO t_board_cmt(iboard,iuser,cmt) "
				+ " values(?,?,?) ";
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIboard());
			ps.setInt(2, param.getIuser());
			ps.setString(3, param.getCmt());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
		
		
	}
	public static List<CmtVo> selCmtList(int iboard)
	{
		List<CmtVo> list  = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT a.icmt, a.cmt, a.regdate , b.unm , a.iuser "
				+ " FROM t_board_cmt AS a "
				+ " LEFT JOIN t_user AS b"
				+ " ON a.iuser = b.iuser "
				+ " ORDER BY iboard DESC ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				CmtVo vo = new CmtVo();
				list.add(vo);
				
				vo.setCmt(rs.getString("cmt"));
				vo.setIcmt(rs.getInt("icmt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setUnm(rs.getString("unm"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps, rs);
		}
		
		return list;
	}
}
