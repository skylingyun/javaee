package com.software.usermanager.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.software.usermanager.db.DBConnection;

public class OptTemplate {

	public Object find(String sql,Object[] objects,ObjectMapper mapper){
		Object object = null;
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = DBConnection.getConn();
			pst = conn.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				pst.setObject(i+1, objects[i]);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					object = mapper.mapping(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return object;
	}
}
