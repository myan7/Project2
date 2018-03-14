package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "P2_LAPTOP_TBL")
public class Laptop extends AbstractItem 
{

	{
		super.setItemCategory("laptop");
	}
	
	private String	cpu;
	private String	ram;
	private String	hardDrive;
	private String	hardDriveType;
	private String	oS;
	private String 	resolution;
	private String	display;
	
	public Laptop() 
	{
		
	}
	
	public Laptop(String itemBrand, String itemName, int itemInventory, double itemPrice, String itemDimension,
			String itemImage, String itemWeight, String itemDescription) {
		super(itemBrand, itemName, itemInventory, itemPrice, itemDimension, itemImage, itemWeight, itemDescription);
		
	}

	public Laptop(String itemBrand, String itemName, int itemInventory, double itemPrice, String itemDimension,
			String itemImage, String itemWeight, String itemDescription,String cpu, String ram, String hardDrive, String hardDriveType, String oS, String resolution,
			String display) 
	{
		super(itemBrand, itemName, itemInventory, itemPrice, itemDimension, itemImage, itemWeight, itemDescription);
		this.cpu = cpu;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.hardDriveType = hardDriveType;
		this.oS = oS;
		this.resolution = resolution;
		this.display = display;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public String getHardDriveType() {
		return hardDriveType;
	}

	public void setHardDriveType(String hardDriveType) {
		this.hardDriveType = hardDriveType;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	
	
}
