package com.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.User;
import com.Repository.UserRepo;

public class UserServiceImpl implements UserService {
	private UserRepo repo;

	@Override
	public boolean checkUser(String email, String pass) {
		repo = new UserRepo();
		if(!repo.validateUser(email, pass)) {
			return false;}
		else{
		return true;
		}
		
	}

	@Override
	public boolean Register(User user) {
		repo = new UserRepo();
		if (repo.register(user))
			return true;
		return false;
	}

}
	