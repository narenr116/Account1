package com.account.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.account.dto.model.AccountDTO;
import com.account.dto.model.TransactionDTO;

@Service
public class AccountService {

	private static final Logger LOGGER = Logger.getLogger(AccountService.class);
	
	private static int seq = -1;

	public List<AccountDTO> getAllAccounts() {

		List<AccountDTO> accounts=new ArrayList<AccountDTO>();
		try {
			accounts=mapAccounts();
		} catch (Exception e) {
			LOGGER.error("Exception Occured :: "+ e.getMessage());
		}
		return accounts;
	}

	

	private List<AccountDTO> mapAccounts() {
		List<AccountDTO> dest = new ArrayList<>();
			AccountDTO acc =new AccountDTO();
			acc.setAccountName("Naren");
			acc.setAccountNumber(100030005676L);
			acc.setAccountType("Savings");
			acc.setBalanceDate(new Date());
			acc.setCurrency("INR");
			acc.setOpenAvailableBalance(new BigDecimal(200000));
			List<TransactionDTO> transactions=new ArrayList<>();
				TransactionDTO tr=new TransactionDTO();
				tr.setCreditAmmount(new BigDecimal(2067));
				tr.setDebitAmmount(new BigDecimal(200));
				tr.setDebitCredit("Credit");
				tr.setTransaction("Credit amount");
				transactions.add(tr);
			
			acc.setTransactions(transactions);
			dest.add(acc);
		return dest;
	}

}
