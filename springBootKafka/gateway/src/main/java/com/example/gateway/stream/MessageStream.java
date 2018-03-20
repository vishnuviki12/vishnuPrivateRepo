/**
 * 
 */
package com.example.gateway.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author vishnu
 *
 */
public interface MessageStream {
	static final String OUT_STREAM = "messages-out";
	
	@Output(OUT_STREAM)
	public MessageChannel write();
	

}
