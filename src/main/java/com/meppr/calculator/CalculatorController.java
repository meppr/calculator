package com.meppr.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
class CalculatorController {

	@Autowired
	private Calculator calc;

	@RequestMapping("/sum")
	String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return "" + calc.sum(a, b);
	}
}

