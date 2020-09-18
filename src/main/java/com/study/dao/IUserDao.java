package com.study.dao;

import java.util.List;

import com.study.pojo.User;

public interface IUserDao {
	public User addUser(User user);
	public void deleteUser(String userId);
	public User updateUser(User user);
	public User queryUser(String userId);
	public List<User> listUser();
}
