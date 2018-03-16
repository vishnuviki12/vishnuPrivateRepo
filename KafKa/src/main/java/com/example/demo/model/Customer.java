/**
 *
 */
package com.example.demo.model;

import lombok.Builder;
import lombok.*;

/**
 * @author vishnu
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Customer {

    String name ;
    String email ;

}
