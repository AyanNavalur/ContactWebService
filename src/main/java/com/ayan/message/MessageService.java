package com.ayan.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	MessageRepository messageRepository;
	
	public void addMessage(Message msg) {
		messageRepository.save(msg);
	}
	
	public List<Message> getAllMessages() {
		List<Message> messages = new ArrayList<Message>();
		messageRepository.findAll().forEach(messages::add);
		return messages;
	} 
	
}
