package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="P2_HEADPHONE_TBL")
public class Headphone extends AbstractItem{

	{
		super.setItemCategory("headphone");
	}
	
	public String style; // over-ear, in ear
	public String wireless;
	public String feature; // noise cancelling
	public Headphone() {
		
	}
	public Headphone(String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDimension, String itemImage, String itemWeight, String itemDescription,
			String style, String wireless, String feature) 
	{
		super(itemBrand, itemName, itemInventory,
				itemPrice, itemDimension, itemImage, itemWeight, itemDescription);

		this.style = style;
		this.wireless = wireless;
		this.feature = feature;
	}
	public String getFeature() {
		return feature;
	}
	public String getStyle() {
		return style;
	}
	public String getWireless() {
		return wireless;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public void setWireless(String wireless) {
		this.wireless = wireless;
	}
	
	
}
