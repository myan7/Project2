package my.spring.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Error{
	int code;
	String message;
	public int getCode() {
		return code;
	}
	public Error(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
