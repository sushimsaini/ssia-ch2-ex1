/**
 * 
 */
package com.ssia.ssiach2ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sushimsaini
 *
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}
