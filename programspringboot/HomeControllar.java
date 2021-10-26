package com.programspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeControllar {
	
	@RequestMapping("/Home")
	public String home() {
		return "Hello page Should Display!!";
	}
		
		@RequestMapping("/About")
		public String About() {
			return "About us!!";

	

	}

}
