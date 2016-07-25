package app.bookstore.model.entity;

public class Book extends Entity {

	private String name;
	private float price;
	private String coverImageFile;
	private Category category;
	
	public Book(){
		super(0);
	}
	public Book(String name, float price, String imageFile){
		this();
		this.setName(name);
		this.setPrice(price);
		this.setCoverImageFile(imageFile);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCoverImageFile() {
		return coverImageFile;
	}
	public void setCoverImageFile(String coverImageFile) {
		this.coverImageFile = coverImageFile;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
