package com.Service;

import com.Model.User;

public interface UserService {
	public boolean checkUser(String email, String pass);

	public boolean Register(User user);
}
