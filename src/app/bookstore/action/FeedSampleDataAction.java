package app.bookstore.action;

import com.opensymphony.xwork2.ActionSupport;

import app.bookstore.model.service.SystemService;

public class FeedSampleDataAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
		
	private String feedCode;
	private SystemService service;
	
	public void setService(SystemService service) {
		this.service = service;
	}
	
	public void setFeedCode(String code)
	{
		this.feedCode = code;
	}
	
	public String execute() throws Exception {
		try {
			System.out.println(feedCode);
			this.service.feedSampleData(feedCode);
			return SUCCESS;
		} 
		catch (Exception ex) {
			this.addActionError(ex.getMessage());
			return ERROR;
		}
	}

}
