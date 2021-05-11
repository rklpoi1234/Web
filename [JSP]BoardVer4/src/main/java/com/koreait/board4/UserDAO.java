package com.koreait.board4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.koreait.board4.user.UserVo;

public class UserDAO {
	public static int joinUser (UserVo param)
	{
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_user(uid,upw,unm,gender) "
				+ "values (?,?,?,?)";
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, param.getUid());
			ps.setString(2, param.getUpw());
			ps.setString(3, param.getUnm());
			ps.setInt(4, param.getGender());
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtils.close(con, ps);
		}
		return 0;
	}
		
		//login sus:1 , noneid:2, passfail:3 , error:0
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
					if (dbPw.equals(param.getUpw())) {
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
