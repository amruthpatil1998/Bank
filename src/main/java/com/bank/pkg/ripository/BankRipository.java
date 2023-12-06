package com.bank.pkg.ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.bank.pkg.entity.Bank;

@Component
public interface BankRipository extends JpaRepository<Bank, String>{

}
