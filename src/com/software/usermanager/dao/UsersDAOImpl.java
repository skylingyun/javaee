package com.software.usermanager.dao;

import java.util.List;

import com.software.usermanager.bean.Users;
import com.software.usermanager.util.OptTemplate;
import com.software.usermanager.util.PageModel;


public class UsersDAOImpl implements UsersDAO {
	
	private OptTemplate optTemplate = null;
	
	 public UsersDAOImpl(OptTemplate optTemplate) {
		 super();
		 this.optTemplate = optTemplate;
	}
	 
	 /**
	 * 登录
	 */
	@Override
	public boolean Login(String name, String password) {
		return false;
	}

	/**
	 * 增
	 */
	@Override
	public boolean insert(Users user) {
		return false;
	}

	/**
	 * 删除一条数据
	 */
	@Override
	public boolean delete(String id) {
		String sql = "delete from users where id =　?";
		
		return false;
	}
	
	/**
	 * 批量删除
	 */
	@Override
	public boolean delete(String[] userIds) {
		return false;
	}

	/**
	 * 修改
	 */
	@Override
	public boolean update(Users user) {
		return false;
	}

	/**
	 * 查询全部
	 */
	@Override
	public List<Users> query() {
		return null;
	}

	/**
	 * 单条查询
	 */
	@Override
	public Users query(String id) {
		return null;
	}

	/**
	 * 分页查询
	 */
	@Override
	public PageModel query(int pageNo, int pageSize) {
		return null;
	}

	/**
	 * 分页模糊查询
	 */
	@Override
	public PageModel query(int pageNo, int pageSize, String condition) {
		return null;
	}
	

}
