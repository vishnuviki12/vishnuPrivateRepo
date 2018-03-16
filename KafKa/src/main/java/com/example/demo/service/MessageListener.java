/**
 *
 */
package com.example.demo.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


import com.example.demo.model.Customer;
import com.example.demo.stream.* ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author vishnu
 *
 */

@Component
public class MessageListener {

	private final Logger log = LoggerFactory.getLogger(MessageListener.class);

	@StreamListener(CustomerStream.OUT_TOPIC)
	public void listenToMessage(@Payload Customer customer) {
		log.info("get message{}", customer);



	}

}
