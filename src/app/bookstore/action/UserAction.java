package app.bookstore.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import app.bookstore.model.entity.User;
import app.bookstore.model.service.UserService;

public class UserAction extends GenericActionSupport<User, UserService> {

	private static final long serialVersionUID = 1L;

	//登录
	public String login() throws Exception {
		String loginId = this.getModel().getLoginId();
		String password = this.getModel().getPassword();
		User user = this.getService().verifyUser(loginId, password);
		if (user != null){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		}
		this.addActionError("用户名或密码不正确！");
		return INPUT;
	}
	//注册
	public String register() throws Exception {
		try {
			this.getService().saveUser(this.getModel());
		}
		catch (Exception ex){
			this.addActionError(ex.getMessage());
			return INPUT;
		}
		return SUCCESS;
	}
	//注销
	public String logout() throws Exception {
		
		ActionContext.getContext().getSession().clear();
		return SUCCESS;
	}
}
