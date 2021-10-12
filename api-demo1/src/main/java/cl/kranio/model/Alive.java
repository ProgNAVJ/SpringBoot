package cl.kranio.model;

import java.io.Serializable;

public class Alive implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Alive() {}

	public Alive(int id, String message, String code) {
		super();
		this.id = id;
		this.message = message;
		this.code = code;
	}
	
	int id;
	String message;
	String code;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
