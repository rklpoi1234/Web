package com.kyge.board7.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kyge.board7.DBUtils;

public class UserDAO {
	
	public static UserEntity selBoard(UserEntity vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		UserEntity result = null;
		
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
				result = new UserEntity();
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
	
	//id 1 or 0
	public static int selIdChk(String uid)
	{
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = " SELECT uid FROM t_user WHERE uid = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, uid.trim());
			rs = ps.executeQuery();
			if (rs.next())
			{
//				UserEntity ue = new UserEntity();
//				ue.setUid(rs.getString(uid));
				result = 1;
				
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
