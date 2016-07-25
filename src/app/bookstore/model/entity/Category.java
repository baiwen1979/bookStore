package app.bookstore.model.entity;

public class Category extends Entity {
	
	private String name;
	private String description;

	public Category() {
		super(0);
	}
	
	public Category(String name, String description){
		this();
		this.setName(name);
		this.setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
