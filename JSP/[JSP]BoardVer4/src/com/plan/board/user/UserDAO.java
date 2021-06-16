package com.plan.board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

import com.plan.board.DBUtils;


public class UserDAO {
	public static int loginUser(UserVo vo)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	
		String sql = "SELECT * FROM t_user WHERE uid = ?";
		
		try
		{
			
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUid());
			rs = ps.executeQuery();
			
			if (rs.next()) 
			{
				//id있는경우 password check
				String dbPw = rs.getString("upw");
//				if (dbPw.equals(vo.getUpw())) {
//					
//				}
				if (BCrypt.checkpw(vo.getUpw(), dbPw)) 
				{
					int iuser = rs.getInt("iuser");
					String unm = rs.getString("unm");
					
					vo.setIuser(iuser);
					vo.setUnm(unm);
					
					return 1;
				}
				else 
				{
					return 3;
				}
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		}
		finally 
		{
			DBUtils.close(con, ps, rs);
		}
		return 0;
	}
}
