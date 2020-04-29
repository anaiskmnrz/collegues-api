/**
 * 
 */
package dev.colleguesapi.controller;

import java.util.ArrayList;
import java.util.List;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class ErreurDto {
	
	private List<String> messages;

	/** Constructeur
	 *
	 * @param messages
	 */
	public ErreurDto() {
		super();
		this.messages = new ArrayList<>();
	}
	
	public void addMessage(String message) {
		this.messages.add(message);
	}
	

	/** Getter
	 *
	 * @return the messages
	 */
	public List<String> getMessages() {
		return messages;
	}

	/** Setter
	 *
	 * @param messages the messages to set
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	} 

}
