/**
 * 
 */
package com.example.gateway.service;

import org.springframework.messaging.MessageChannel;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.example.gateway.model.CustomerDTO;
import com.example.gateway.stream.MessageStream;

/**
 * @author vishnu
 *
 */
@Service
public class CustomerService {
	
	private final MessageStream messageStream;
	
	CustomerService(MessageStream messageStream) {
		this.messageStream = messageStream;
	} 

	
	public boolean publish(CustomerDTO customerDTO) {
		
		MessageChannel messageChannel = messageStream.write();
		boolean result = messageChannel.send(
				MessageBuilder.withPayload(customerDTO)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		return result;
	}
}
