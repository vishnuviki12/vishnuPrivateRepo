/**
 * 
 */
package com.diviso.app.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author vishnu
 *
 */
public interface MessageStream {
	 static final String OUT_STREAM = "CreateCustomer";

	@Output(OUT_STREAM)
	public MessageChannel write();

}
