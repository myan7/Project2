package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="P2_TOY_TBL")
public class Toy extends AbstractItem {

	{
		super.setItemCategory("toy");
	}
	private String type; //education music board grown-up
	private String ageRange;
	
	public Toy() {
		
	}
	
	public Toy(String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDemension, String itemImage, String itemWeight, String itemDescription,
			String type, String ageRange) 
	{
		super(itemBrand, itemName, itemInventory,
				itemPrice, itemDemension, itemImage, itemWeight, itemDescription);
		this.type = type;
		this.ageRange = ageRange;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	
	
}
