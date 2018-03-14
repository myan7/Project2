package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "P2_CLOTHING_TBL")
public class Clothing extends AbstractItem {

	{
		super.setItemCategory("clothing");
	}
	private String bodySize; // midium large small
	private String color;
	private String material;
	private String gender; 

	public Clothing() 
	{

	}

	public Clothing(String itemBrand, String itemName, int itemInventory, double itemPrice, String itemDemension,
			String itemImage, String itemWeight, String itemDescription, 
			String size, String color, String material, String gender) 
	{
		super(itemBrand, itemName, itemInventory, itemPrice, itemDemension, itemImage, itemWeight, itemDescription);
		this.bodySize = size;
		this.color = color;
		this.material = material;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBodySize() {
		return bodySize;
	}

	public void setBodySize(String size) {
		this.bodySize = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
