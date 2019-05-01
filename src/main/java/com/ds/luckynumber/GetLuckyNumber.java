package com.ds.luckynumber;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetLuckyNumber {
	@GetMapping("/getluckynum")
	public String getLuckyNumber(@RequestParam(name = "user", defaultValue = "user", required = false) String user,
			Model model) {
		model.addAttribute("user", user); // add the user attribute into model
		model.addAttribute("luckynum", new Random().nextInt(50) + 1 + ""); // add the generated random number as the lucky
																		// number to
		// the user.
		return "lucky";
	}
}
