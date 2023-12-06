package com.bank.pkg.util;

import org.springframework.stereotype.Component;
import com.bank.pkg.entity.Bank;

@Component
public class BankUtil {

	public boolean verified(Bank b) {
		
		String regex = "[a-zA-Z]+\\.?";
		String regex1 = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		String regex2 = "^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$";

		if (b.getBankName() != regex) {
			System.out.println("Enter Valid Bank Name");
			return false;
		}
		if (b.getName() != regex) {
			System.out.println("Enter Valid  Name");
			return false;
		}
		if (b.getAge() != regex2) {
			System.out.println("Enter Valid Age");
			return false;
		}
		if (b.getPassward() != regex2 && b.getPassward() != regex) {
			System.out.println("Enter Valid passward ");
			return false;
		}
		if (b.getPhNo() != regex1) {
			System.out.println("Enter Valid phone number ");
			return false;
		}

		return true;
	}

}
