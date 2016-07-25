package app.bookstore.model.service;

import app.bookstore.model.entity.User;

public interface UserService  {

	/**
	 * 存储新用户
	 * @param user 要存储的用户对象
	 */
	public void saveUser(User user);
	
	/**
	 * 验证指定登录Id和密码的用户对象
	 * @param loginId 用户的登录Id
	 * @param password 用户密码
	 * @return 验证成功，返回指定的用户对象，否则为空
	 */
	public User verifyUser(String loginId, String password);
	
}
