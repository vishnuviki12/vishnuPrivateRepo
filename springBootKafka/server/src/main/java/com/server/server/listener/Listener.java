/**
 * 
 */
package com.server.server.listener;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.server.server.model.CustomerDTO;

/**
 * @author vishnu
 *
 */
@Component
public class Listener {
	
	private final Logger log = LoggerFactory.getLogger(Listener.class);
	
	@StreamListener("messages-in")
	public void listen(@Payload CustomerDTO customerDTO) {
		log.info("listening.......");
		
	}

}
