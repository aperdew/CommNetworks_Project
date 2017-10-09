package chatterroom.models;

import java.util.ArrayList;
import java.util.List;
import chatterroom.models.MessageModel;

public class ChatroomModel {
	private List<MessageModel> messageList = new ArrayList(); 
	private String topic ="";
	private int id =-1;
	public ChatroomModel(){
		
	}; 
	
	public List<MessageModel> getMessageList(){
		return messageList;
	}
	
	public void setMessageList(List<MessageModel> messageList){
		this.messageList = messageList;
	}
	
	public String getTopic(){
		return topic;
	}
	
	public void setTopic(String topic){
		this.topic = topic;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
}
