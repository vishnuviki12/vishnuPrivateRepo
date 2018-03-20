/**
 * 
 */
package com.server.server.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author vishnu
 *
 */
public interface MessageStream {
	static final String IN_TOPIC = "messages-in";
	
	@Input(IN_TOPIC)
	public SubscribableChannel read();

}
