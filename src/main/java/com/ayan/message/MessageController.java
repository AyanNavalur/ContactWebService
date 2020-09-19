package com.ayan.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@PostMapping("/messages")
	public void addMessage(@RequestBody Message msg) {
		messageService.addMessage(msg);
	}
	
	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

}
