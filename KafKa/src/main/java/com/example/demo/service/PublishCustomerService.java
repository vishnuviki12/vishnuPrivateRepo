/**
 *
 */
package com.example.demo.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.example.demo.model.Customer;
import com.example.demo.stream.CustomerStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishnu
 *
 */
@Service
public class PublishCustomerService {

	private final Logger log = LoggerFactory.getLogger(PublishCustomerService.class);

	private final CustomerStream customerStream;

	PublishCustomerService(CustomerStream customerStream) {
		this.customerStream = customerStream;
	}

	public boolean sendMessage(Customer customer) {
		log.info("got message : {}", customer);
		MessageChannel messageChannel = this.customerStream.write();

		boolean message = messageChannel.send(
				MessageBuilder.withPayload(customer)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		return message;
	}

}
