package app.bookstore.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GenericActionSupport<TEntity, TService> extends ActionSupport
		implements ModelDriven<TEntity> {
	
	private static final long serialVersionUID = 1L;
	
	private TService service;
	private TEntity model;

	@Override
	public TEntity getModel() {
		return model;
	}
	
	public void setModel(TEntity model) {
		this.model = model;
	}

	protected TService getService() {
		return service;
	}

	public void setService(TService service) {
		this.service = service;
	}
}
