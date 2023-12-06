package com.bank.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.pkg.entity.Bank;
import com.bank.pkg.ripository.BankRipository;
import com.bank.pkg.util.BankUtil;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankUtil siplyfy;

	@Autowired
	BankRipository ripo;

	@Override
	public String vlidation(Bank b) {

		boolean verified = siplyfy.verified(b);

		if (verified == true) {
			System.out.println("resister");
		} else {
			System.out.println("not resister");
		}
		
		//

		Bank save = ripo.save(b);

		System.out.println(save);

		return "reister";
	}
}
