package my.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="P2_Desktop_TBL")
public class Desktop extends AbstractItem {
	{
		super.setItemCategory("desktop");
	}
	
	private String	cpu;
	private String	ram;
	private String	hardDrive;
	private String	hardDriveType;
	private String	OS;
	
	public Desktop() {
		
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

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public Desktop(String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDemension, String itemImage, String itemWeight, String itemDescription,
			 String cpu, String ram,
			String hardDrive, String hardDriveType, String oS) 
	{
		super(itemBrand, itemName, itemInventory,
				itemPrice, itemDemension, itemImage, itemWeight, itemDescription);
		
		this.cpu = cpu;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.hardDriveType = hardDriveType;
		OS = oS;
	}
	
	
	
	

	
}
