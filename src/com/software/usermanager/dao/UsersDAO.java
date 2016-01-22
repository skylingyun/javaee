package com.software.usermanager.dao;


import java.util.List;

import com.software.usermanager.bean.Users;
import com.software.usermanager.util.PageModel;

public interface UsersDAO {

	public boolean insert(Users user);//增
	public boolean delete(String id);//删除一条
	public boolean delete(String [] userIds);//批量删除
	public boolean update(Users user);//修改
	public List<Users> query();//查询全部
	public Users query(String id);//查询一条
	public PageModel query(int pageNo,int pageSize);//分页查询
	public PageModel query(int pageNo,int pageSize,String condition);//分页模糊查询
	public boolean Login(String name,String password);//登录
	
	
}
