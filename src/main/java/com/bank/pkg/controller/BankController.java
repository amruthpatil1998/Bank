package com.bank.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bank.pkg.entity.Bank;
import com.bank.pkg.service.BankService;

@RestController
public class BankController {

	@Autowired
	BankService resister;

	@PostMapping("/validate")
	public String reister(@RequestBody Bank b) {
		String vlidation = resister.vlidation(b);
		return vlidation;
	}
}
