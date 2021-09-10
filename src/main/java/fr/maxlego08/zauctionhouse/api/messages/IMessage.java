package fr.maxlego08.zauctionhouse.api.messages;

import java.util.List;

import fr.maxlego08.zauctionhouse.api.enums.Message;
import fr.maxlego08.zauctionhouse.api.enums.MessageType;

public interface IMessage extends ITitleMessage{

	Message getDefaultMessage();

	List<String> getMessages();

	String getMessage();

	void setMessage(String message);

	void setMessages(List<String> messages);

	MessageType getType();

	void setType(MessageType messageType);

	
	;
	

}
