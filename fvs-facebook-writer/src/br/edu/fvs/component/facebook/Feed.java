package br.edu.fvs.component.facebook;

public class Feed {
	private String id;
	private String message;
	private String userid;
	
	public Feed(String id, String message, String userid) {
		this.id = id;
		this.message = message;
		this.userid = userid;
	}
	
	public String getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getUserid() {
		return userid;
	}
	
}
