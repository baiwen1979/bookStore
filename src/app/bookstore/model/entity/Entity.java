package app.bookstore.model.entity;

import java.util.Calendar;
import java.util.Date;

public abstract class Entity {

	private long id;
	private Date creationDate;
	
	public Entity(long id) {
		this.id = id;
		this.setCreationDate(Calendar.getInstance().getTime());
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
