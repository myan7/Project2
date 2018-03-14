package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractItem 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long 		itemId;
	
	protected String 	itemBrand;
	protected String 	itemName;
	protected String 	itemCategory;
	protected int 		itemInventory;
	protected double 	itemPrice;
	protected String		itemDimension;
	protected String 	itemImage;
	protected String		itemWeight;
	@Lob   //
	protected String 	itemDescription;
	/*
	 * @Lob indicates that the property should be persisted in a Blob or a Clob 
	 * depending on the property type: java.sql.Clob, Character[], char[] and java.lang.
	 * String will be persisted in a Clob. 
	 * java.sql.Blob, Byte[], byte[] and serializable type will be persisted in a Blob.
	 */
	
	public AbstractItem() {
		
	}
	
	
	public AbstractItem (String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDimension, String itemImage, String itemWeight, String itemDescription) 
	{
		
		this.itemBrand = itemBrand;
		this.itemName = itemName;
		this.itemInventory = itemInventory;
		this.itemPrice = itemPrice;
		this.itemDimension = itemDimension;
		this.itemImage = itemImage;
		this.itemWeight = itemWeight;
		this.itemDescription = itemDescription;
	}


	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public int getItemInventory() {
		return itemInventory;
	}
	public void setItemInventory(int itemInventory) {
		this.itemInventory = itemInventory;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDemension() {
		return itemDimension;
	}
	public void setItemDemension(String itemDemension) {
		this.itemDimension = itemDemension;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public String getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	@Override
	public String toString() {
		return "AbstractItem [itemId=" + itemId + ", itemBrand=" + itemBrand + ", itemName=" + itemName
				+ ", itemCategory=" + itemCategory + ", itemInventory=" + itemInventory + ", itemPrice=" + itemPrice
				+ ", itemDemension=" + itemDimension + ", itemImage=" + itemImage + ", itemWeight=" + itemWeight
				+ ", itemDescription=" + itemDescription + "]";
	}
	

}