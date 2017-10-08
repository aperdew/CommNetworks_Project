package chatterroom.models;

public class MessageModel {
	private String username ="";
	private String message ="";
	public MessageModel(String username, String message){
		setUsername(username);
		setMessage(message);
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
}
