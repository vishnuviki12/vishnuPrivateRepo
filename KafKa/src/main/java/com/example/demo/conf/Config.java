/**
 * 
 */
package com.example.demo.conf;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.demo.stream.CustomerStream;

/**
 * @author vishnu
 *
 */
@EnableBinding(CustomerStream.class)
public class Config {

}
