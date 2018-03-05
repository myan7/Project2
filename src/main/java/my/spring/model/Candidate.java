package my.spring.model;


public class Candidate extends AbstractItem {
	
	{
		super.setItemCategory("candidate");
	}
	
	private String specialization;
	private String experience;
	private String education;
	public Candidate() {
	
	}
	
	public Candidate(String itemBrand, String itemName, int itemInventory,
			double itemPrice, String itemDemension, String itemImage, String itemWeight, String itemDescription,
			String specialization, String experience, String education) 
	{
		super(itemBrand, itemName, itemInventory,
				itemPrice, itemDemension, itemImage, itemWeight, itemDescription);

		this.specialization = specialization;
		this.experience = experience;
		this.education = education;
	}

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
}
