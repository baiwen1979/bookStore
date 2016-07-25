package app.bookstore.model.service;

import java.util.List;

import app.bookstore.model.entity.User;

public class UserServiceImpl extends ServiceSupport<User> implements
		UserService {

	@Override
	public void saveUser(User user) {
		this.getDao().save(user);	
	}

	@Override
	public User verifyUser(String loginId, String password) {
		List<User> users = this.getDao().findBy("loginId", loginId);
		for(User user: users){
			if (user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}

}
