package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="P2_PUBLICATION_TBL")
public class Book extends AbstractItem{
	{
		super.setItemCategory("book");
	}
	
	private String author;
	private String yearofPublish;
	private String type; // book ebook
	
	public Book() {

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYearofPublish() {
		return yearofPublish;
	}

	public void setYearofPublish(String yearofPublish) {
		this.yearofPublish = yearofPublish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Book(String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDemension, String itemImage, String itemWeight, String itemDescription,
			String author, String yearofPublish, String type) 
	{
		super(itemBrand, itemName, itemInventory,
				itemPrice, itemDemension, itemImage, itemWeight, itemDescription);
		this.author = author;
		this.yearofPublish = yearofPublish;
		this.type = type;
	}
	
	
}
