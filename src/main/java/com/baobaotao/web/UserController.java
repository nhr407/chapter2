package com.baobaotao.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baobaotao.model.User;
import com.baobaotao.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Autowired private UserService userService;
	
	/**
	 * 用户列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/listUser")
	public String listUser(HttpServletRequest request) {
		List <User> list = userService.getAllPerson();
		request.setAttribute("userlist", list);
		return "listUser";
	}

}
