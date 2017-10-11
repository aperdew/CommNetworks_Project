package chatterroom.models;

public class UserModel {
	private String username="";
	public UserModel(String username){
		setUsername(username);
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}

}
