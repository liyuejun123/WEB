package com.study.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.pojo.User;
@Repository
public class UserDaoImpl implements IUserDao{

	@Override
	public User addUser(User user) {
		System.out.println("向数据库添加数据");
		return user;
	}

	@Override
	public void deleteUser(String userId) {
		System.out.println("从数据库删除id="+userId);
	}

	@Override
	public User updateUser(User user) {
		System.out.println("向数据库更新数据");
		return user;
	}

	@Override
	public User queryUser(String userId) {
		System.out.println("向数据库查询1条数据");
		User u=new User("666","Peter");
		return u;
	}

	@Override
	public List<User> listUser() {
		System.out.println("向数据库查询多条数据");
		List<User> list=new ArrayList<>();
		User u1=new User("666","Peter");
		User u2=new User("777","Peter");
		User u3=new User("888","Peter");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

}
