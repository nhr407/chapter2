package com.baobaotao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.UserMapper;
import com.baobaotao.model.User;

/**
 * User Service
 */
@Service
@Transactional(readOnly = true)
public class UserService {
	
	@Autowired UserMapper userMapper;
	/**
	 * 获取全部用户信息
	 * @return
	 */
	public List<User> getAllPerson() {
		return userMapper.getAllPerson();
	}
}
