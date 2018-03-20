/**
 * 
 */
package com.server.server.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

import com.server.server.stream.MessageStream;

/**
 * @author vishnu
 *
 */
@EnableBinding(MessageStream.class)
public class Config {

}
