/**
 *
 */
package com.example.demo.stream;

import org.apache.logging.log4j.message.Message;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author vishnu
 *
 */
public interface CustomerStream {

	public static final String OUT_TOPIC = "CreateCustomer";

	/*@Input(OUT_TOPIC)
	public SubscribableChannel read();*/

	@Output(OUT_TOPIC)
	public abstract MessageChannel write();


}
