package com.lk.cantstop.dice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {
	
	@CrossOrigin("*")
	@GetMapping("/roll")
	public Option rollDice() {
		
		Roll roll = new Roll();
		
		Option option = new Option(roll);
		
		return option;
		
	}
	


}
