/**
 * 
 */
package com.example.gateway.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.gateway.stream.MessageStream;

/**
 * @author vishnu
 *
 */
@EnableBinding(MessageStream.class)
public class Config {

}
