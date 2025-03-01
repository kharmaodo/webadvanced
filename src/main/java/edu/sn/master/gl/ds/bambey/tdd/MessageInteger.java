package edu.sn.master.gl.ds.bambey.tdd;

public class MessageInteger{
	private String message;
	private Integer result ;
	
	public MessageInteger(String message, Integer result) {
		this.message = message;
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	

}
