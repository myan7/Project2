package my.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="P2_USER_TBL")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Cart userCart;
	{
		userCart = new Cart();
	}
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPassword;
	private String gender;
	private String userPhoneNo;
	
	private String userDOB;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Cart getUserCart() {
		return userCart;
	}

	public void setUserCart(Cart userCart) {
		this.userCart = userCart;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public String getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}

	public User() {
		
	}

	@Override
	public String toString() {
		return "User [userId=" + userId  + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", gender=" + gender + ", userPhoneNo=" + userPhoneNo + ", userDOB=" + userDOB + "]";
	}
	
	
	
}
