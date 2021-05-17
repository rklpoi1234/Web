package com.koreait.board5.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.board5.DBUtils;

public class UserDAO {
	public static UserVo selBoard(UserVo vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		UserVo result = null;
		
		String sql = " SELECT iuser, uid, upw, unm FROM t_user WHERE uid = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUid());
			rs = ps.executeQuery();
			if (rs.next()) {
				int iuser = rs.getInt("iuser");
				String uid = rs.getString("uid");
				String upw = rs.getString("upw");
				String unm = rs.getString("unm");
				result = new UserVo();
				result.setIuser(iuser);
				result.setUpw(upw);
				result.setUid(uid);
				result.setUnm(unm);
				
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
			// TODO: handle exception
		}
	}
	
	public static int insertUser(UserVo vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_user (uid,upw,unm,gender)"
				+ " VALUES (?,?,?,?) ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUid());
			ps.setString(2, vo.getUpw());
			ps.setString(3, vo.getUnm());
			ps.setInt(4, vo.getGender());
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
	}
	public static int loginUser(UserVo param)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM t_user where uid = ?";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getUid());
			
			rs = ps.executeQuery();
			
			if (rs.next()) 
			{	//아이디가 있는경우 & 비밀번호 체크
				String dbPw = rs.getString("upw");
				if (BCrypt.checkpw(param.getUpw(), dbPw)) {
					int iuser = rs.getInt("iuser");
					String unm = rs.getString("unm");
					
					
					param.setIuser(iuser);
					param.setUnm(unm);
					
					return 1;
				} else {
					return 3;
				}
			} 
			else //id none
			{
				return 2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return 0;
}
}
